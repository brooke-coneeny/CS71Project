package swat.moves.api;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
public class create_path {
//UNDER HILL IS MISSING A NEIGHBOR
    @CrossOrigin(maxAge = 3600)
    @GetMapping("/get-path/{start}/{distance}/{check}")
    public String getLocations(@PathVariable("start") String start, @PathVariable("distance") float distance, @PathVariable("check") Boolean check) throws SQLException {
        
        if (check == true) {
            distance = distance / (float) 2.0;
        } 

        String location = "";
        //'String start = ;
        // float distance = (float)3 / (float)2;
        float n_distance = 0;
        // Hashtable<String, Float> visited = new Hashtable<String, Float>();
        List<LinkedHashMap<String, Float>> visited = new LinkedList<>();
        HashSet<String> history = new HashSet<String>();
        history.add(start);
        LinkedHashMap<String, Float> node = new LinkedHashMap<String, Float>();
        node.put(start, (float) 0);
        visited.add(node);
        List locations = new LinkedList();
        List<LinkedHashMap<String, Float>> neighbors = new LinkedList<>();
        String path = start + ",";
        try {
            Class.forName("org.postgresql.Driver");
            Connection c = null;
            c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/swatmoves",
                    "postgres", "admin");
            while (distance >= 0) {
                System.out.println(distance);
                locations.clear();
                neighbors.clear();
                // if location is not in neighbors
                String statement = String.format("SELECT * FROM %s", start);
                PreparedStatement pstmt = c.prepareStatement(statement);
                ResultSet rs = pstmt.executeQuery();
                while (rs.next()) {
                    location = rs.getString("location");
                    n_distance = rs.getFloat("distance");
                    // Assuming you have a user object
                    LinkedHashMap<String, Float> m = new LinkedHashMap<String, Float>();
                    m.put(location, n_distance);
                    neighbors.add(m);
                    locations.add(location);
                }
                
                int flag = 0;
                while (flag == 0) {
                     // getting random number
                    int max = locations.size() - 1;
                    int min = 0;
                    int next = (int) Math.floor(Math.random() * (max - min + 1) + min);
                    // get name of next location
                    String next_location = (String) locations.get(next);
                    // get name, distance of next stop
                    LinkedHashMap<String, Float> next_stop = neighbors.get(next);
                    if (!history.contains(next_location)) {
                        flag = 1;
                        float dist = next_stop.get(next_location);
                        distance -= dist;
                        start = next_location;
                        path += next_location + ",";
                        visited.add(next_stop);
                        history.add(next_location);
                    }
                    else {
                        locations.remove(next_location);
                        neighbors.remove(next_stop);
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //path = path.substring(0, path.length() - 1);

        if (check == true){
            String[] path_array = path.split(",");
            for (int i = path_array.length-2; i >= 0; i -= 1) {
                path += path_array[i];
                path += ",";
            }
        }

        path = path.substring(0, path.length() - 1);
        return path;

    }
}
