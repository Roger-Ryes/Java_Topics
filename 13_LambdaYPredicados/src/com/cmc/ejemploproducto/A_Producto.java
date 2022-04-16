package com.cmc.ejemploproducto;

import java.time.LocalDate;

public class A_Producto {
    private String nombre;
    private double precio;
    private int stock;
    private LocalDate fechaCaduca;
    private boolean estado;

    public A_Producto(String nombre, double precio, int stock, LocalDate fechaCaduca) {
        super();
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.fechaCaduca = fechaCaduca;
        this.estado = false;
    }

    // GET Y SET
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDate getFechaCaduca() {
        return fechaCaduca;
    }

    public void setFechaCaduca(LocalDate fechaCaduca) {
        this.fechaCaduca = fechaCaduca;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "A_Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", fechaCaduca=" + fechaCaduca +
                ", estado=" + estado +
                "}\n";
    }
}
