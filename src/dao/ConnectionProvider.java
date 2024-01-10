/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;
import java.sql.*;
/**
 *
 * @author DELL
 */
public class ConnectionProvider {
    public static Connection getcon(){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacymanagementsystem","root","Kartik@111");
            return con;
            
        }catch(Exception e)
        {
            return null;
        }
    }
}
