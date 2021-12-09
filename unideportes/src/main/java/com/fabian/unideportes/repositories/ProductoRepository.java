package com.fabian.unideportes.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

import com.fabian.unideportes.models.ProductoModelo;

public interface ProductoRepository extends MongoRepository<ProductoModelo, String>{

    ArrayList<ProductoModelo> findByNombre(String nombre);
    ArrayList<ProductoModelo> findByCatergoria(String catergoria);
    ArrayList<ProductoModelo> findByPrecio(int precio);
    ArrayList<ProductoModelo> findByDisponibilidad(Boolean disponibilidad);
    ArrayList<ProductoModelo> findByPrecioGreaterThanEqual(int precio);
    
}



