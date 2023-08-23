package com.almacen.src.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Almacen {
    List<Persona> clientes;
    List<Producto> productos;

    List<Venta>ventas;

    public Almacen() {
        clientes= new ArrayList<>();
        productos= new ArrayList<>();
        ventas=new ArrayList<>();
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

    public void addProducto(Producto producto) {
        productos.add(producto);
    }
    public List<Producto> obtenerListaRefrigerados()
    {
        return productos.stream().filter(producto -> producto instanceof ProductoRefrigerado).collect(Collectors.toList());
    }

    public void addCliente(Persona persona){
        clientes.add(persona);}

    public void addVenta(Venta venta){
        ventas.add(venta);
    }

    public void removePersona(Persona persona){
        clientes.remove(persona);
    }

    public void removeProducto(Producto producto){
        productos.remove(producto);
    }

    public void removeVenta(Venta venta){
        ventas.remove(venta);
    }

    public Persona obetenerPersona(String documento){
        return clientes.stream().filter(persona -> persona.getDocumento().equals(documento)).findFirst().get();
    }
    public Producto obtenerProduco (String documento){
        return productos.stream().filter(producto -> producto.equals(documento)).findFirst().get();
    }

    public Venta obtenerVenta(String codigo){
        return ventas.stream().filter(venta1 -> venta1.getCodigo().equals(codigo)).findFirst().get();
    }

    public List<Persona> obtenerNatural() {
        return  clientes.stream().filter(persona -> persona instanceof PersonaNatural).collect(Collectors.toList());

    }
}
