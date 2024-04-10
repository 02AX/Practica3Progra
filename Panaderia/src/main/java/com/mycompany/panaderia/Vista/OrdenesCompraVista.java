package com.mycompany.panaderia.Vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class OrdenesCompraVista extends JFrame {
    private JComboBox<String> productosComboBox;
    private JTextField cantidadField;
    private JButton ordenarButton;

    public OrdenesCompraVista() {
        setTitle("Realizar Orden de Compra");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        panel.add(new JLabel("Producto:"));
        productosComboBox = new JComboBox<>();
        
        panel.add(productosComboBox);

        panel.add(new JLabel("Cantidad:"));
        cantidadField = new JTextField();
        panel.add(cantidadField);

        ordenarButton = new JButton("Ordenar");
        ordenarButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        }
        
        });
        panel.add(ordenarButton);

        add(panel);
        setVisible(true);        
                
        }
    }//Fin de la clase
