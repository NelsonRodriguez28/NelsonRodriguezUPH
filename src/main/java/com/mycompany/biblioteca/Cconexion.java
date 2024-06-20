/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author NelsonRO
 */
public class Cconexion {
    static Connection conectar=null;
    static String usuario="root";
    static String contrasenia="polonorte";
    static String bd="bilioteca";
    static String ip="localhost";
    static String puerto="3306";
    
    static String cadena= "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    

    public static Connection establecerConexion(){
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection( cadena,usuario,contrasenia);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.toString()+"No se pudo conectar a la base de datos ");
        }
        
       return conectar;
    }
}
