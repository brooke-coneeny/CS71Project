// This file is where we will create databases

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

// Create a table which stores all of the locations with no distances
//CREATE TABLE locations(
//  Place varchar(255)
//)

//INSERT INTO locations
//VALUES ('Dana', 'Hallowell', 'Danawell', 'Wharton', 'Clothier', 'Underhill',
//'Kohlberg', 'Cornell', 'Science Center', 'Beardsley', 'Pearson', 'Trotter',
//'Singer', 'McCabe', 'Willets', 'Worth', 'David Kemp', 'Alice Paul', 'Mertz',
//'Dining Center', 'Matchbox', 'Pittenger', 'Palmer', 'Roberts', 'NPPR')

// Create a table for each location with the distances to each neighbor
