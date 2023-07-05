/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author admin
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://:3306/sua_chua_dien_thoai", "root", "password");
            System.out.println("successful");
            return con;
        }catch(Exception e){
            System.out.println("fail");
            System.out.println(e.getMessage());
            return null;
        }
    }
}
