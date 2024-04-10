package com.mycompany.panaderia.Modelo;

public class Funcionario {
    private String cedula;
    private String nombre;
    private String puesto;
    private String contraseña;
    
    //Constructor de la clase
    public Funcionario(String cedula, String nombre, String puesto, String contraseña) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.puesto = puesto;
        this.contraseña = contraseña;
    }
    
    //Getters y Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   
}//Fin de la clase
