/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datatest;

import java.sql.*;

/**
 *
 * @author User
 */
public class Datatest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

   Connection conn =null ;
    try{
        Class.forName("com.mysql.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_project","root","seaways123");
    if(conn!=null){
        System.err.println("Connected!");
    }
    Statement stmt = conn.createStatement(); 
   Statement statement = conn.createStatement();
   
ResultSet rs=stmt.executeQuery("select branch_name from branch");  

while(rs.next())  
System.out.println(rs.getString(1));  
conn.close();
    }catch(Exception e){
        System.err.println("Notconnected");
    }
   
}
}
