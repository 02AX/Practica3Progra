package com.mycompany.panaderia.Modelo;

import java.time.LocalDateTime;

public class Cierre {
    private int numeroDeCierre;
    private double totalVenta;
    private LocalDateTime fecha;
    private String puesto;
    
    //Constructor de la clase
    public Cierre(int numeroDeCierre, double totalVenta, LocalDateTime fecha, String puesto) {
        this.numeroDeCierre = numeroDeCierre;
        this.totalVenta = totalVenta;
        this.fecha = fecha;
        this.puesto = puesto;
    }
    
    
    //Getters y Setters
    public int getNumeroDeCierre() {
        return numeroDeCierre;
    }

    public void setNumeroDeCierre(int numeroDeCierre) {
        this.numeroDeCierre = numeroDeCierre;
    }

    public double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    
  
    
    
    
    
}//Fin de la clase
