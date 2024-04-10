package com.mycompany.panaderia.Controlador;

import com.mycompany.panaderia.Modelo.Compra;
import com.mycompany.panaderia.Modelo.Funcionario;
import com.mycompany.panaderia.Modelo.Producto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CompraControlador {
    
    public void realizarCompra(Funcionario funcionario, List<Producto> productos) {
    Connection connection = null;
    PreparedStatement stmt = null;
    
    try {
            // Establecer conexión a la base de datos
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root/BaseDeDatosPractica3", "Alexander", "Contraseña");

            // Iniciar la transacción
            connection.setAutoCommit(false);

            // Ingresar la compra en la base de datos
            String insertCompraQuery = "INSERT INTO compras (funcionario_id, producto_id) VALUES (?, ?)";
            stmt = connection.prepareStatement(insertCompraQuery);
            for (Producto producto : productos) {
                stmt.setInt(1, funcionario.getId());
                stmt.setInt(2, producto.getId());
                stmt.addBatch();
            }
            stmt.executeBatch();

            // Confirmar la transacción
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
            // En caso de error, se hace un rollback de la transacción
            try {
                if (connection != null) {
                    connection.rollback();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } finally {
            // Cerrar
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    /////HISTORIAL ORDENES DE COMPRA/////
    public List<Compra> obtenerHistorialCompras() {
        Connection connection = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Compra> historialCompras = new ArrayList<>();

        try {
            // Establecer conexión a la BD
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root/BaseDeDatosPractica3", "Alexander", "Contraseña");

            //Hacer la consulta al historial de compras
            String selectComprasQuery = "SELECT * DE compras";
            stmt = connection.prepareStatement(selectComprasQuery);
            rs = stmt.executeQuery();
            
            // Aqui se procesa el resultado y crear los objetos de la OC
            while (rs.next()) {
                int id = rs.getInt("id");
                int funcionarioId = rs.getInt("funcionario_id");
                int productoId = rs.getInt("producto_id");
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return historialCompras;
    }
    
    
}//Fin de la clase
