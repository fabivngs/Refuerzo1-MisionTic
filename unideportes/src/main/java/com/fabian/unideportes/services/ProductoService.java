package com.fabian.unideportes.services;

import java.util.ArrayList;
import java.util.Optional;

import com.fabian.unideportes.models.ProductoModelo;
import com.fabian.unideportes.repositories.ProductoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public ArrayList<ProductoModelo> obtenerProductos(){
        return (ArrayList<ProductoModelo>) productoRepository.findAll();

    }

    public ProductoModelo guardarProducto(ProductoModelo producto){
        return productoRepository.save(producto);
    }

    public boolean eliminarProducto(String id){
        if(productoRepository.existsById(id)){
            productoRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    public Optional<ProductoModelo> obtenerPorId(String id){
        return productoRepository.findById(id);
    }

    public ArrayList<ProductoModelo> obtenerPorNombre(String nombre){
        return productoRepository.findByNombre(nombre);
    }

    public ArrayList<ProductoModelo> obtenerPorCategoria(String catergoria){
        return productoRepository.findByCatergoria(catergoria);
    }

    public ArrayList<ProductoModelo> obtenerPorPrecio(int precio){
        return productoRepository.findByPrecio(precio);
    }

    public ArrayList<ProductoModelo> obtenerPorDisponibilidad(Boolean disponibilidad){
        return productoRepository.findByDisponibilidad(disponibilidad);
    }

    public ArrayList<ProductoModelo> obtenerPorPrecioMayor(int precio){
        return productoRepository.findByPrecioGreaterThanEqual(precio);
    }


}
