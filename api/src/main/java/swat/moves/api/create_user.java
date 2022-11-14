package swat.moves.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.Map.Entry;

@RestController
@RequestMapping
public class create_user {
    // UNDER HILL IS MISSING A NEIGHBOR
    // check visited
    @PostMapping("/create-user/{username}/{password}/{name}")
    public String createUser(@PathVariable("username") String username, @PathVariable("password") String password,
            @PathVariable("name") String name) throws SQLException {
            String exists = "";
        try {
            Class.forName("org.postgresql.Driver");
            Connection c = null;
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/swatmoves",
                    "postgres", "admin");
           
            String statement = String.format("SELECT * FROM login where username = '%s'", username);
            System.out.println(statement);
            PreparedStatement pstmt = c.prepareStatement(statement);
            ResultSet rs = pstmt.executeQuery();
            exists = "no";
                while (rs.next()) {
                    exists = rs.getString("username");
                }
            
            System.out.println(exists);
            if(exists == "no"){
                statement = String.format("Insert into login (username, password, name) values('%s', '%s', '%s')", username, password, name);
                pstmt = c.prepareStatement(statement);
                pstmt.executeUpdate();
            }
             
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return "success";

    }
}
