package com.fabian.unideportes.models;

import org.springframework.data.annotation.Id;

public class ProductoModelo {

    @Id
    private String id;
    private String catergoria;
    private String nombre;
    private String descripcion;
    private int precio;
    private boolean disponibilidad;
    private int stock;
    
    public ProductoModelo() {
    }

    public ProductoModelo(String id, String catergoria, String nombre, String descripcion, int precio,
            boolean disponibilidad, int stock) {
        this.id = id;
        this.catergoria = catergoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCatergoria() {
        return catergoria;
    }

    public void setCatergoria(String catergoria) {
        this.catergoria = catergoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    
}

