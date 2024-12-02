/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Mahesh
 */
public class ConnectionProvider {
    
    public static Connection getCon()
    {
        try{
            String jdbcUrl = "jdbc:mysql://localhost:3306/inventary"; 
            String username = "root";
            String password = "root";
            //  Load JDBC driver if required (not needed for modern JDBC drivers)
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(jdbcUrl, username, password);
            return con;  
        }
        catch(ClassNotFoundException | SQLException e){
        
            System.out.println(e);
            return null;
        
        }
    }
    
}
