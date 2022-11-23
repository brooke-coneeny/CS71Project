package swat.moves.api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@RestController
@RequestMapping
public class get_locations {

    @GetMapping("/get-locations")
    public List getLocations() throws SQLException{
      String location = "";
      List locations = new LinkedList();
      try {
        Class.forName("org.postgresql.Driver");
        Connection c = null;
        c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/swatmoves",
        "postgres", "admin");
        PreparedStatement pstmt = c.prepareStatement("SELECT * FROM locations");
        ResultSet rs =pstmt.executeQuery();
        
        while (rs.next()) {
          location = rs.getString("location");
          //Assuming you have a user object
          locations.add(location);
        }

      } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      return locations;
    }
  }
