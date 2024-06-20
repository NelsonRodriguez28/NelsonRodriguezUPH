package com.mycompany.biblioteca;




/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NelsonRO
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class SaveUsuarios {
    public void saveData(String nombre, java.sql.Date fechaNacimiento, String direccion, int telefono, java.sql.Date fechaRegistro ) {
        String query = "INSERT INTO usuarios (nombre, fecha_nacimiento, direccion, telefono, fecha_registro) VALUES (?, ?, ?, ?, ?)";
        
        try (Connection connection = Cconexion.establecerConexion();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            
            preparedStatement.setString(1,  nombre);
            preparedStatement.setDate(2,  fechaNacimiento);
            preparedStatement.setString(3, direccion);
            preparedStatement.setInt(4, telefono);
            preparedStatement.setDate(5, fechaRegistro);
            
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("¡Un nuevo registro fue insertado exitosamente!");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

  
}
