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
public class create_specific_tables {
    @PostMapping("/create-specific-tables")
    public void createLocations() throws SQLException{
        try {
          Class.forName("org.postgresql.Driver");
          Connection c = null;
          c = DriverManager.getConnection("jdbc:postgresql://localhost:5433/swatmoves",
          "postgres", "admin");
          System.out.println("Opened database successfully");
          //list of tables
          List<String> locations = Arrays.asList("Dana_Hall/Hallowell_Hall/Danawell_Hall/Wharton","Clothier_Hall","Underhill_Music_Library/Kohlberg_Hall","Cornell_Library/Science_Center", "Beardsley_Hall/Pearson Hall/Trotter_Hall ","Singer_Hall", "McCabe_Library", "Willets_Hall/Worth_Hall","David_Kemp_Hall/Alice_Paul_Hall/Mertz","Sharples_Dining_Hall","Matchbox","Pittenger_Hall/Palmer_Hall/Roberts_Hall/NPPR_Apartments");

        //   List locations = new LinkedList<String>();
        //   locations.addAll("Dana Hall / Hallowell Hall / Danawell Hall / Wharton","Clothier Hall","Underhill Music Library / Kohlberg Hall","Cornell Library / Science Center", "Beardsley Hall / Pearson Hall / Trotter Hall ","Singer Hall'),('McCabe Library'),('Willets Hall / Worth Hall","David Kemp Hall / Alice Paul Hall / Mertz'),('Sharples Dining Hall","Matchbox","Pittenger Hall / Palmer Hall / Roberts Hall / NPPR Apartments");
          //run this for each one
        //   System.out.println(locations);
          
          for (String location : locations){
            String statement = "drop table if EXISTS \"" + location + "\"; Create table \"" + location + "\" (location varchar(400));";
            System.out.println(statement);
            PreparedStatement pstmt = c.prepareStatement(statement);
            pstmt.executeUpdate();
          }
        //   PreparedStatement pstmt = c.prepareStatement("drop table if EXISTS locations; Create table locations (location varchar(400));");
        //   pstmt.executeUpdate();
          //insert data 
        //   pstmt = c.prepareStatement("insert into locations (location) values('Dana Hall / Hallowell Hall / Danawell Hall / Wharton'),('Clothier Hall'),('Underhill Music Library / Kohlberg Hall'),('Cornell Library / Science Center'), ('Beardsley Hall / Pearson Hall / Trotter Hall '),('Singer Hall'),('McCabe Library'),('Willets Hall / Worth Hall'),('David Kemp Hall / Alice Paul Hall / Mertz'),('Sharples Dining Hall'),('Matchbox'),('Pittenger Hall / Palmer Hall / Roberts Hall / NPPR Apartments')");
        //   pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
      }
    
}
