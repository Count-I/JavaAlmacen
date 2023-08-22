package com.almacen.src.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Almacen {
    List<Persona> clientes;
    List<Producto> productos;

    public Almacen() {
        clientes= new ArrayList<>();
        productos= new ArrayList<>();
    }

    public List<Persona> obtenerJuridica(){
        return clientes.stream().filter(persona -> persona instanceof PersonaJuridica).collect(Collectors.toList());
    }

    public List<Producto> obtenerListaEnvasados(){
        return productos.stream().filter(producto -> producto instanceof ProductoEnvasado).collect(Collectors.toList());
    }

    public List<Persona> getClientes() {
        return clientes;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
