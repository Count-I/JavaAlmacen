package com.almacen.src.model;

import java.util.List;

public class Almacen {
    List<Persona> clientes;
    List<Producto> productos;

    public Almacen() {
    }

    public List<Persona> getClientes() {
        return clientes;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
