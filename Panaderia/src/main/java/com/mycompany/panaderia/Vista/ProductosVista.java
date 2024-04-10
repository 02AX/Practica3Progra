
package com.mycompany.panaderia.Vista;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ProductosVista extends JFrame {
    private JTable productosTable;

    public ProductosVista() {
        setTitle("Lista de Productos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        String[] columnNames = {"ID", "Nombre", "Precio"};
        Object[][] data = {
                {1, "Producto 1", 0},
                {2, "Producto 2", 0},
                {3, "Producto 3", 0},
                {4, "Producto 4", 0},
                {5, "Producto 5", 0},
                {6, "Producto 6", 0},
                {7, "Producto 7", 0},
                {8, "Producto 8", 0},
                {9, "Producto 9", 0},
                {10, "Producto 10", 0},
                };

        productosTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(productosTable);
        add(scrollPane);

        setVisible(true);
        }
        
    }//Fin de la clase
