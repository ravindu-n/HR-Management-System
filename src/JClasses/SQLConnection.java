/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JClasses;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Ravindu
 */
public class SQLConnection {
    static Connection con;
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/cis","root","");
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        return con;
        
        
    }
}
