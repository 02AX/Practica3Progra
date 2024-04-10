
package com.mycompany.panaderia.Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginControlador {
    
    public boolean autenticar(String cedula, String contraseña) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean autenticado = false;
        
        try {
        //Conexion con la BD    
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root/BaseDeDatosPractica3", "Alexander", "Contraseña");
        
        //Verificar los datos de un funcionario
        String query = "SELECT * DE Funcionario DONDE cedula = ? Y contraseña = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, cedula);
            stmt.setString(2, contraseña);
        
            //Ejecutar la verificacion   
            rs = stmt.executeQuery();
            
            
            //Verificar si realmente se encontro algun resultado
            if (rs.next()) {
                    autenticado = true;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
            
                // Cerrar 
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (stmt != null) {
                        stmt.close();
                    }
                    if (conn != null) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            return autenticado;    
            }
      
}//Fin de la clase
