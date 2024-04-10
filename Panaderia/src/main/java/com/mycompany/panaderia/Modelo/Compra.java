package com.mycompany.panaderia.Modelo;

import com.mycompany.panaderia.Modelo.Producto;
import com.mycompany.panaderia.Modelo.Funcionario;
import java.time.LocalDateTime;
import java.util.List;

public class Compra {
    private int numeroDeCompra;
    private Funcionario funcionario;
    private List<Producto> productos;
    private double total;
    private LocalDateTime fechaYHora;
    
    
    //Constructor de la clase
    public Compra(int numeroDeCompra, Funcionario funcionario, List<Producto> productos, double total, LocalDateTime fechaYHora) {
        this.numeroDeCompra = numeroDeCompra;
        this.funcionario = funcionario;
        this.productos = productos;
        this.total = total;
        this.fechaYHora = fechaYHora;
    }
    
    //Getters y Setters
    public int getNumeroDeCompra() {
        return numeroDeCompra;
    }

    public void setNumeroDeCompra(int numeroDeCompra) {
        this.numeroDeCompra = numeroDeCompra;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }
    
}//Fin de la clae
