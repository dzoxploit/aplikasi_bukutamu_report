/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package didinnuryahya_xirpljava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class Koneksi {
    
    public static final String url = "jdbc:mysql://localhost:3306/didinnuryahya_java";
    public static final String username = "root";
    public static final String password = "";
    
    public static Connection getconnection()throws SQLException {
        Connection connect = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection(url,username,password);
            System.out.println("Koneksi Berhasil");
        } catch (ClassNotFoundException ex) {
            System.out.println("Koneksi Gagal");
        }
        
        return connect;
    }

}
