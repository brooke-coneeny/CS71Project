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

import java.lang.*;

@RestController
@RequestMapping
public class create_specific_tables {
    @PostMapping("/create-specific-tables")
    public String createLocations() throws SQLException{
        try {
          Class.forName("org.postgresql.Driver");
          Connection c = null;
          c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/swatmoves",
          "postgres", "admin");
          //list of tables
          List<String> locations = Arrays.asList("Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton","Clothier_Hall","Underhill_Music_Library-Kohlberg_Hall","Cornell_Library-Science_Center", "Beardsley_Hall-Pearson Hall-Trotter_Hall","Singer_Hall", "McCabe_Library", "Willets_Hall-Worth_Hall","David_Kemp_Hall-Alice_Paul_Hall-Mertz","Sharples_Dining_Hall","Matchbox","Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments");

          for (String location : locations){
            String statement = "drop table if EXISTS \"" + location + "\"; Create table \"" + location + "\" (location varchar(400), distance FLOAT);";
            PreparedStatement pstmt = c.prepareStatement(statement);
            pstmt.executeUpdate();
          }

          //insert data 
          PreparedStatement pstmt = c.prepareStatement("insert into \"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\" (location,distance) values('\"Clothier_Hall\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\" (location,distance) values('\"Underhill_Music_Library-Kohlberg_Hall\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\" (location,distance) values('\"Cornell_Library-Science_Center\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\" (location,distance) values('\"Beardsley_Hall-Pearson Hall-Trotter_Hall\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\" (location,distance) values('\"Singer_Hall\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\" (location,distance) values('\"McCabe_Library\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\" (location,distance) values('\"Willets_Hall-Worth_Hall\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\" (location,distance) values('\"David_Kemp_Hall-Alice_Paul_Hall-Mertz\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\" (location,distance) values('\"Sharples_Dining_Hall\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\" (location,distance) values('\"Matchbox\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\" (location,distance) values('\"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\"', '0.2')");
          pstmt.executeUpdate();

          //insert data 
          pstmt = c.prepareStatement("insert into \"Clothier_Hall\" (location,distance) values('\"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Clothier_Hall\" (location,distance) values('\"Underhill_Music_Library-Kohlberg_Hall\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Clothier_Hall\" (location,distance) values('\"Cornell_Library-Science_Center\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Clothier_Hall\" (location,distance) values('\"Beardsley_Hall-Pearson Hall-Trotter_Hall\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Clothier_Hall\" (location,distance) values('\"Singer_Hall\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Clothier_Hall\" (location,distance) values('\"McCabe_Library\"', '0.1')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Clothier_Hall\" (location,distance) values('\"Willets_Hall-Worth_Hall\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Clothier_Hall\" (location,distance) values('\"David_Kemp_Hall-Alice_Paul_Hall-Mertz\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Clothier_Hall\" (location,distance) values('\"Sharples_Dining_Hall\"', '0.1')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Clothier_Hall\" (location,distance) values('\"Matchbox\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Clothier_Hall\" (location,distance) values('\"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\"', '0.5')");
          pstmt.executeUpdate();

          //insert data 
          pstmt = c.prepareStatement("insert into \"Underhill_Music_Library-Kohlberg_Hall\" (location,distance) values('\"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Underhill_Music_Library-Kohlberg_Hall\" (location,distance) values('\"Clothier_Hall\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Underhill_Music_Library-Kohlberg_Hall\" (location,distance) values('\"Cornell_Library-Science_Center\"', '0.05')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Underhill_Music_Library-Kohlberg_Hall\" (location,distance) values('\"Beardsley_Hall-Pearson Hall-Trotter_Hall\"', '0.1')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Underhill_Music_Library-Kohlberg_Hall\" (location,distance) values('\"Singer_Hall\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Underhill_Music_Library-Kohlberg_Hall\" (location,distance) values('\"McCabe_Library\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Underhill_Music_Library-Kohlberg_Hall\" (location,distance) values('\"Willets_Hall-Worth_Hall\"', '0.7')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Underhill_Music_Library-Kohlberg_Hall\" (location,distance) values('\"David_Kemp_Hall-Alice_Paul_Hall-Mertz\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Underhill_Music_Library-Kohlberg_Hall\" (location,distance) values('\"Sharples_Dining_Hall\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Underhill_Music_Library-Kohlberg_Hall\" (location,distance) values('\"Matchbox\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Underhill_Music_Library-Kohlberg_Hall\" (location,distance) values('\"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\"', '0.6')");
          pstmt.executeUpdate();

          //insert data 
          pstmt = c.prepareStatement("insert into \"Cornell_Library-Science_Center\" (location,distance) values('\"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Cornell_Library-Science_Center\" (location,distance) values('\"Clothier_Hall\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Cornell_Library-Science_Center\" (location,distance) values('\"Underhill_Music_Library-Kohlberg_Hall\"', '0.05')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Cornell_Library-Science_Center\" (location,distance) values('\"Beardsley_Hall-Pearson Hall-Trotter_Hall\"', '0.05')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Cornell_Library-Science_Center\" (location,distance) values('\"Singer_Hall\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Cornell_Library-Science_Center\" (location,distance) values('\"McCabe_Library\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Cornell_Library-Science_Center\" (location,distance) values('\"Willets_Hall-Worth_Hall\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Cornell_Library-Science_Center\" (location,distance) values('\"David_Kemp_Hall-Alice_Paul_Hall-Mertz\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Cornell_Library-Science_Center\" (location,distance) values('\"Sharples_Dining_Hall\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Cornell_Library-Science_Center\" (location,distance) values('\"Matchbox\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Cornell_Library-Science_Center\" (location,distance) values('\"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\"', '0.6')");
          pstmt.executeUpdate();

          //insert data 
          pstmt = c.prepareStatement("insert into \"Beardsley_Hall-Pearson Hall-Trotter_Hall\" (location,distance) values('\"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Beardsley_Hall-Pearson Hall-Trotter_Hall\" (location,distance) values('\"Clothier_Hall\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Beardsley_Hall-Pearson Hall-Trotter_Hall\" (location,distance) values('\"Underhill_Music_Library-Kohlberg_Hall\"', '0.1')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Beardsley_Hall-Pearson Hall-Trotter_Hall\" (location,distance) values('\"Cornell_Library-Science_Center\"', '0.05')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Beardsley_Hall-Pearson Hall-Trotter_Hall\" (location,distance) values('\"Singer_Hall\"', '0.01')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Beardsley_Hall-Pearson Hall-Trotter_Hall\" (location,distance) values('\"McCabe_Library\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Beardsley_Hall-Pearson Hall-Trotter_Hall\" (location,distance) values('\"Willets_Hall-Worth_Hall\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Beardsley_Hall-Pearson Hall-Trotter_Hall\" (location,distance) values('\"David_Kemp_Hall-Alice_Paul_Hall-Mertz\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Beardsley_Hall-Pearson Hall-Trotter_Hall\" (location,distance) values('\"Sharples_Dining_Hall\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Beardsley_Hall-Pearson Hall-Trotter_Hall\" (location,distance) values('\"Matchbox\"', '0.5')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Beardsley_Hall-Pearson Hall-Trotter_Hall\" (location,distance) values('\"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\"', '0.6')");
          pstmt.executeUpdate();

          //insert data 
          pstmt = c.prepareStatement("insert into \"Singer_Hall\" (location,distance) values('\"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Singer_Hall\" (location,distance) values('\"Clothier_Hall\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Singer_Hall\" (location,distance) values('\"Underhill_Music_Library-Kohlberg_Hall\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Singer_Hall\" (location,distance) values('\"Cornell_Library-Science_Center\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Singer_Hall\" (location,distance) values('\"Beardsley_Hall-Pearson Hall-Trotter_Hall\"', '0.01')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Singer_Hall\" (location,distance) values('\"McCabe_Library\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Singer_Hall\" (location,distance) values('\"Willets_Hall-Worth_Hall\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Singer_Hall\" (location,distance) values('\"David_Kemp_Hall-Alice_Paul_Hall-Mertz\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Singer_Hall\" (location,distance) values('\"Sharples_Dining_Hall\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Singer_Hall\" (location,distance) values('\"Matchbox\"', '0.5')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Singer_Hall\" (location,distance) values('\"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\"', '0.7')");
          pstmt.executeUpdate();


          //insert data 
          pstmt = c.prepareStatement("insert into \"McCabe_Library\" (location,distance) values('\"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"McCabe_Library\" (location,distance) values('\"Clothier_Hall\"', '0.1')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"McCabe_Library\" (location,distance) values('\"Underhill_Music_Library-Kohlberg_Hall\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"McCabe_Library\" (location,distance) values('\"Cornell_Library-Science_Center\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"McCabe_Library\" (location,distance) values('\"Beardsley_Hall-Pearson Hall-Trotter_Hall\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"McCabe_Library\" (location,distance) values('\"Singer_Hall\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"McCabe_Library\" (location,distance) values('\"Willets_Hall-Worth_Hall\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"McCabe_Library\" (location,distance) values('\"David_Kemp_Hall-Alice_Paul_Hall-Mertz\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"McCabe_Library\" (location,distance) values('\"Sharples_Dining_Hall\"', '0.1')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"McCabe_Library\" (location,distance) values('\"Matchbox\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"McCabe_Library\" (location,distance) values('\"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\"', '0.5')");
          pstmt.executeUpdate();

          //insert data 
          pstmt = c.prepareStatement("insert into \"Willets_Hall-Worth_Hall\" (location,distance) values('\"Clothier_Hall\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Willets_Hall-Worth_Hall\" (location,distance) values('\"Underhill_Music_Library-Kohlberg_Hall\"', '0.7')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Willets_Hall-Worth_Hall\" (location,distance) values('\"Cornell_Library-Science_Center\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Willets_Hall-Worth_Hall\" (location,distance) values('\"Beardsley_Hall-Pearson Hall-Trotter_Hall\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Willets_Hall-Worth_Hall\" (location,distance) values('\"Singer_Hall\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Willets_Hall-Worth_Hall\" (location,distance) values('\"McCabe_Library\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Willets_Hall-Worth_Hall\" (location,distance) values('\"David_Kemp_Hall-Alice_Paul_Hall-Mertz\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Willets_Hall-Worth_Hall\" (location,distance) values('\"Sharples_Dining_Hall\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Willets_Hall-Worth_Hall\" (location,distance) values('\"Matchbox\"', '0.5')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Willets_Hall-Worth_Hall\" (location,distance) values('\"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\"', '0.6')");
          pstmt.executeUpdate();

          //insert data 
          pstmt = c.prepareStatement("insert into \"David_Kemp_Hall-Alice_Paul_Hall-Mertz\" (location,distance) values('\"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"David_Kemp_Hall-Alice_Paul_Hall-Mertz\" (location,distance) values('\"Clothier_Hall\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"David_Kemp_Hall-Alice_Paul_Hall-Mertz\" (location,distance) values('\"Underhill_Music_Library-Kohlberg_Hall\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"David_Kemp_Hall-Alice_Paul_Hall-Mertz\" (location,distance) values('\"Cornell_Library-Science_Center\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"David_Kemp_Hall-Alice_Paul_Hall-Mertz\" (location,distance) values('\"Beardsley_Hall-Pearson Hall-Trotter_Hall\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"David_Kemp_Hall-Alice_Paul_Hall-Mertz\" (location,distance) values('\"Singer_Hall\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"David_Kemp_Hall-Alice_Paul_Hall-Mertz\" (location,distance) values('\"McCabe_Library\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"David_Kemp_Hall-Alice_Paul_Hall-Mertz\" (location,distance) values('\"Willets_Hall-Worth_Hall\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"David_Kemp_Hall-Alice_Paul_Hall-Mertz\" (location,distance) values('\"Sharples_Dining_Hall\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"David_Kemp_Hall-Alice_Paul_Hall-Mertz\" (location,distance) values('\"Matchbox\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"David_Kemp_Hall-Alice_Paul_Hall-Mertz\" (location,distance) values('\"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\"', '0.5')");
          pstmt.executeUpdate();

          //insert data 
          pstmt = c.prepareStatement("insert into \"Sharples_Dining_Hall\" (location,distance) values('\"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Sharples_Dining_Hall\" (location,distance) values('\"Clothier_Hall\"', '0.1')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Sharples_Dining_Hall\" (location,distance) values('\"Underhill_Music_Library-Kohlberg_Hall\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Sharples_Dining_Hall\" (location,distance) values('\"Cornell_Library-Science_Center\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Sharples_Dining_Hall\" (location,distance) values('\"Beardsley_Hall-Pearson Hall-Trotter_Hall\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Sharples_Dining_Hall\" (location,distance) values('\"Singer_Hall\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Sharples_Dining_Hall\" (location,distance) values('\"McCabe_Library\"', '0.1')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Sharples_Dining_Hall\" (location,distance) values('\"Willets_Hall-Worth_Hall\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Sharples_Dining_Hall\" (location,distance) values('\"David_Kemp_Hall-Alice_Paul_Hall-Mertz\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Sharples_Dining_Hall\" (location,distance) values('\"Matchbox\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Sharples_Dining_Hall\" (location,distance) values('\"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\"', '0.3')");
          pstmt.executeUpdate();

          //insert data 
          pstmt = c.prepareStatement("insert into \"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\" (location,distance) values('\"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\"', '0.2')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\" (location,distance) values('\"Clothier_Hall\"', '0.5')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\" (location,distance) values('\"Underhill_Music_Library-Kohlberg_Hall\"', '0.6')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\" (location,distance) values('\"Cornell_Library-Science_Center\"', '0.6')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\" (location,distance) values('\"Beardsley_Hall-Pearson Hall-Trotter_Hall\"', '0.6')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\" (location,distance) values('\"Singer_Hall\"', '0.7')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\" (location,distance) values('\"McCabe_Library\"', '0.5')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\" (location,distance) values('\"Willets_Hall-Worth_Hall\"', '0.6')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\" (location,distance) values('\"David_Kemp_Hall-Alice_Paul_Hall-Mertz\"', '0.5')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\" (location,distance) values('\"Matchbox\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\" (location,distance) values('\"Sharples_Dining_Hall\"', '0.3')");
          pstmt.executeUpdate();

          //insert data 
          pstmt = c.prepareStatement("insert into \"Matchbox\" (location,distance) values('\"Dana_Hall-Hallowell_Hall-Danawell_Hall-Wharton\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Matchbox\" (location,distance) values('\"Clothier_Hall\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Matchbox\" (location,distance) values('\"Underhill_Music_Library-Kohlberg_Hall\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Matchbox\" (location,distance) values('\"Cornell_Library-Science_Center\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Matchbox\" (location,distance) values('\"Beardsley_Hall-Pearson Hall-Trotter_Hall\"', '0.5')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Matchbox\" (location,distance) values('\"Singer_Hall\"', '0.5')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Matchbox\" (location,distance) values('\"McCabe_Library\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Matchbox\" (location,distance) values('\"Willets_Hall-Worth_Hall\"', '0.5')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Matchbox\" (location,distance) values('\"David_Kemp_Hall-Alice_Paul_Hall-Mertz\"', '0.4')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Matchbox\" (location,distance) values('\"Pittenger_Hall-Palmer_Hall-Roberts_Hall-NPPR_Apartments\"', '0.3')");
          pstmt.executeUpdate();
          pstmt = c.prepareStatement("insert into \"Matchbox\" (location,distance) values('\"Sharples_Dining_Hall\"', '0.3')");
          pstmt.executeUpdate();

        } catch (ClassNotFoundException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }

        return("created data successfully");

      }
    
}
