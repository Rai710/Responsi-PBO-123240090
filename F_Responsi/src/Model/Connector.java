/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lab Informatika
 */

import java.sql.*;




public  class Connector {
    private static String jdbc_driver = "com.mysql.cj.jdbc.Driver";
    private static String nama_db  = "employee_db";
    private static String url_db  = "jdbc:msql://localhost:3306/" + nama_db;
    private static String username  = "root";
    private static String password  = "";
    
    static Connection conn;
    public static Connection connect(){


        try{
            Class.forName(jdbc_driver);

            conn = DriverManager.getConnection(url_db,username,password);
            System.out.println("MYSQL CONNET!!");
        }catch(ClassNotFoundException | SQLException exception){
                System.out.println("Connected Failed : " + exception.getLocalizedMessage());
        }
        return conn;
    }
}
