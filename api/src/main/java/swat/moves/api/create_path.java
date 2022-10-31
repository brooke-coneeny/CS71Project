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
import java.util.Map.Entry;

@RestController
@RequestMapping
public class create_path {
//UNDER HILL IS MISSING A NEIGHBOR
//check visited 
    @GetMapping("/get-path")
    public List getLocations() throws SQLException {
        String location = "";
        String start = "\"Singer_Hall\"";
        float distance = (float)3 / (float)2;
        System.out.println(distance);
        float n_distance = 0;
        // Hashtable<String, Float> visited = new Hashtable<String, Float>();
        List<LinkedHashMap<String, Float>> visited = new LinkedList<>();
        LinkedHashMap<String, Float> node = new LinkedHashMap<String, Float>();
        node.put(start, (float) 0);
        visited.add(node);
        List locations = new LinkedList();
        List<LinkedHashMap<String, Float>> neighbors = new LinkedList<>();
        try {
            Class.forName("org.postgresql.Driver");
            Connection c = null;
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5433/swatmoves",
                    "postgres", "admin");
            // System.out.println("Opened database successfully");
            while (distance >= 0) {
                locations.clear();
                neighbors.clear();
                System.out.println(locations);
                // if location is not in neighborsß
                String statement = String.format("SELECT * FROM %s", start);
                PreparedStatement pstmt = c.prepareStatement(statement);
                ResultSet rs = pstmt.executeQuery();
                System.out.println(rs);
                while (rs.next()) {
                    location = rs.getString("location");
                    n_distance = rs.getFloat("distance");
                    // Assuming you have a user object
                    LinkedHashMap<String, Float> m = new LinkedHashMap<String, Float>();
                    m.put(location, n_distance);
                    neighbors.add(m);
                    locations.add(location);
                }
                System.out.println(neighbors);
                // getting random number
                int max = locations.size() - 1;
                int min = 0;
                int next = (int) Math.floor(Math.random() * (max - min + 1) + min);
                // get name of next location
                String next_location = (String) locations.get(next);
                // get name, distance of next stop
                LinkedHashMap<String, Float> next_stop = neighbors.get(next);
                float dist = next_stop.get(next_location);
                System.out.println(next_location);
                System.out.println(dist);
                visited.add(next_stop);
                distance -= dist;
                start = next_location;
            }
            System.out.println(visited);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return visited;
    }
}
