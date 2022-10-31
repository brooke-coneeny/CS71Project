package swat.moves.api;
import org.springframework.web.bind.annotation.PostMapping;
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
public class create_locations {
    @PostMapping("/create-locations")
    public void createLocations() throws SQLException{
        try {
          Class.forName("org.postgresql.Driver");
          Connection c = null;
          c = DriverManager.getConnection("jdbc:postgresql://localhost:5433/swatmoves",
          "postgres", "admin");
          System.out.println("Opened database successfully");
          PreparedStatement pstmt = c.prepareStatement("drop table if EXISTS locations; Create table locations (location varchar(400));");
          pstmt.executeUpdate();
          //insert data 
          pstmt = c.prepareStatement("insert into locations (location) values('Dana Hall / Hallowell Hall / Danawell Hall / Wharton'),('Clothier Hall'),('Underhill Music Library / Kohlberg Hall'),('Cornell Library / Science Center'), ('Beardsley Hall / Pearson Hall / Trotter Hall '),('Singer Hall'),('McCabe Library'),('Willets Hall / Worth Hall'),('David Kemp Hall / Alice Paul Hall / Mertz'),('Sharples Dining Hall'),('Matchbox'),('Pittenger Hall / Palmer Hall / Roberts Hall / NPPR Apartments')");
          pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    
}
