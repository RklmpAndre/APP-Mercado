/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.SQLClientInfoException;
/**
 *
 * @author andre
 */
public class ConnectionFactory {
    private static final String URL = "jdbc:mysql://localhost:3306/appmercado";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection conn;
    
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection(URL, USER, PASSWORD);
            
         
        } catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    
}
