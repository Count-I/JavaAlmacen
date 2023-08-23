package com.almacen.src.model;

import java.time.LocalDate;

public class Venta {
    private String codigo;
    private LocalDate fecha;
    private String idCliente;
    private int cantidad;
    private String cproducto;
    private Double subtotal;

    public Venta() {
    }

    public Venta(String codigo, LocalDate fecha, String idCliente, int cantidad, String cproducto, Double subtotal) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.cantidad = cantidad;
        this.cproducto = cproducto;
        this.subtotal = subtotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProducto() {
        return cproducto;
    }

    public void setProducto(String producto) {
        this.cproducto = producto;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
}
