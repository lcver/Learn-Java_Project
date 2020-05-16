/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lucver
 */
public class config {
    private static Connection config;
    
    public static Connection configDB()throws SQLException{
        String url="jdbc:mysql://localhost:3306/learning_EmailApplication_java";
        String user="root";
        String pass="";
        
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        config = DriverManager.getConnection(url,user,pass);
        return config;
    }
}
