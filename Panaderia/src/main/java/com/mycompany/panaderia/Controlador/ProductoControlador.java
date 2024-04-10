
package com.mycompany.panaderia.Controlador;

import com.mycompany.panaderia.Modelo.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoControlador {
   
    public List<Producto> obtenerProductos() {
        List<Producto> productos = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root/BaseDeDatosPractica3", "Alexander", "Contraseña");    
        
            // Consultar los productos disponibles
            String query = "SELECT * DE Producto";
            stmt = conn.prepareStatement(query);
            
            // Ejecutar la consulta de los productos
            rs = stmt.executeQuery();
            
            // Recorrer los resultados y agregar los productos a la lista
            while (rs.next()) {
                int numeroSerial = rs.getInt("numeroSerial");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                Producto producto = new Producto(numeroSerial, nombre, precio);
                productos.add(producto);
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

           return productos;
       }


   }//Fin de la clase
