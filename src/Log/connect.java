/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author lenovo
 */
public class connect {
     private static Connection con1;
    private static Statement st1;
    
   
    
  public static Statement connection(){
        try{
            Class.forName("org.sqlite.JDBC");
            String url = "jdbc:sqlite:student.db";
            con1 = DriverManager.getConnection(url);
            st1 =  (Statement) con1.createStatement();
           System.out.println("Connection succesfull");
            
        }catch(Exception ex){
            System.out.println("Connection fail");
        }
         return st1;
}
}
