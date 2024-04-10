package com.mycompany.panaderia.Vista;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class HistorialComprasVista extends JFrame {
    private JTable historialTable;

    public HistorialComprasVista() {
        setTitle("Historial de Compras");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Suponiendo que tienes un historial de compras para mostrar en una tabla
        String[] columnNames = {"ID", "Funcionario", "Producto", "Fecha"};
        Object[][] data = {
                {1, "Funcionario 1", "Producto 1", "2024-04-10"},
                {2, "Funcionario 2", "Producto 2", "2024-04-09"},
                {3, "Funcionario 3", "Producto 3", "2024-04-08"},
                };

        historialTable = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(historialTable);
        add(scrollPane);

        setVisible(true);
        }
    
    }//Fin de la clase
