
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BILAL
 */
public class selectdata {
    
    Connection conn;
    
   
       public void selectAll(){

        String sql = "SELECT Date FROM Event";
        
        try {
             Statement st  = conn.createStatement();
             ResultSet rs   = st.executeQuery(sql);
            
            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getString("date"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
