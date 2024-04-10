package com.mycompany.panaderia.Modelo;

public class Producto {
    private int numeroSerial;
    private String nombre;
    private double precio;
    
    //Constructor de la clase
    public Producto(int numeroSerial, String nombre, double precio) {
        this.numeroSerial = numeroSerial;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //Getters y Setters

    public int getNumeroSerial() {
        return numeroSerial;
    }

    public void setNumeroSerial(int numeroSerial) {
        this.numeroSerial = numeroSerial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
   
}//Fin de la clase
