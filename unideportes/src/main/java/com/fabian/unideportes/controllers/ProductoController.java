package com.fabian.unideportes.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.fabian.unideportes.models.ProductoModelo;
import com.fabian.unideportes.services.ProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/producto")
public class ProductoController {
    
    @Autowired
    ProductoService productoService;

    @GetMapping()
    public ArrayList<com.fabian.unideportes.models.ProductoModelo> obtenerListaProductos(){
        return productoService.obtenerProductos();
    }

    @PostMapping()
    public ProductoModelo guardarProductoNuevo(@RequestBody ProductoModelo producto){
        return productoService.guardarProducto(producto);
    }

    @DeleteMapping(path = "/{id}")
    public String eliminarProducto(@PathVariable("id") String id){
        if(productoService.eliminarProducto(id)){
            return "Se eliminó el cliente con el Id: "+id;
        }else{
            return "No existe cliente con Id: "+id;
        }
    }

    @GetMapping(path = "/{id}")
    public Optional<ProductoModelo> obtenerProductoPorId(@PathVariable("id") String id){
        return productoService.obtenerPorId(id);
    }

   
    @GetMapping(path = "/nombre/{nombre}")
    public ArrayList<ProductoModelo> obtenerProductoPorNombre(@PathVariable("nombre") String nombre){
        return productoService.obtenerPorNombre(nombre);
    }

    @GetMapping(path = "/catergoria/{catergoria}")
    public ArrayList<ProductoModelo> obtenerProductoPorCategoria(@PathVariable("catergoria") String catergoria){
        return productoService.obtenerPorCategoria(catergoria);
    }

    @GetMapping(path = "/precio/{precio}")
    public ArrayList<ProductoModelo> obtenerProductoPorPrecio(@PathVariable("precio") int precio){
        return productoService.obtenerPorPrecio(precio);
    }

    @GetMapping(path = "/disponibilidad/{disponibilidad}")
    public ArrayList<ProductoModelo> obtenerProductoPorDisponibilidad(@PathVariable("disponibilidad") Boolean disponibilidad){
        return productoService.obtenerPorDisponibilidad(disponibilidad);
    }

    @GetMapping(path = "/preciomayor/{precio}")
    public ArrayList<ProductoModelo> obtenerProductoPorPrecioMayor(@PathVariable("precio") int precio){
        return productoService.obtenerPorPrecioMayor(precio);
    }

}
