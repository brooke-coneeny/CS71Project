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
public class sign_in {
    // UNDER HILL IS MISSING A NEIGHBOR
    // check visited
    @PostMapping("/sign-in/{username}/{password}")
    public String createUser(@PathVariable("username") String username, @PathVariable("password") String password)
            throws SQLException {
            String exists = "";
        try {
            Class.forName("org.postgresql.Driver");
            Connection c = null;
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/swatmoves",
                    "postgres", "admin");

            // Select user information from table that matches the username and perform query 
            String statement = String.format("SELECT * FROM login where username = '%s'", username);
            PreparedStatement pstmt = c.prepareStatement(statement);
            ResultSet rs = pstmt.executeQuery();

            exists = "no";
            while (rs.next()) {
                // Set exists equal to the user's password 
                exists = rs.getString("password");
            }

            // Check if associated password  
            if(exists != password){
                return "Correct login";
            }

             
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return "Invalid Login Information";

    }
}
