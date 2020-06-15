/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * package daos;

public class koneksi {
    
}

 * @author toto
 */
public class koneksi {
    private static Connection kon;
    private static final String URL = "jdbc:mysql://localhost:3306/wangemoney?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String DriverName = "com.mysql.cj.jdbc.Driver";
    private static final String username ="root";
    private static final String password="";
    
    public static Connection bukaKoneksi(){
        if(kon == null){
            try{
                Class.forName(DriverName);
                try {
                    kon = DriverManager.getConnection(URL,username,password);
                } catch (SQLException ex) {
                    System.out.println("Tidak terhubung ke database"+ ex);
                }
            }catch(ClassNotFoundException e){
                System.out.println("Tidak terhubung ke database"+ e);
            }
        }
        return kon;
    }
    public static Connection tutupKoneksi(){
        if(kon != null){
           try{
               kon.close();
           }catch(SQLException e){       
               System.out.println("Tidak terhubung ke database"+ e);
           }
        }
        return kon;
    }
    public static void main(String args[]){
        new koneksi();
    }
}
