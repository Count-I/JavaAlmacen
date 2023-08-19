package com.almacen.src.model;

import java.math.BigInteger;

public abstract class Producto {

    protected int codigo;
    protected String nombre;
    protected Double valorUnitario;
    protected BigInteger existencia;

    public Producto() {
    }

    public Producto(int codigo, String nombre, Double valorUnitario, BigInteger existencia) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.valorUnitario = valorUnitario;
        this.existencia = existencia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigInteger getExistencia() {
        return existencia;
    }

    public void setExistencia(BigInteger existencia) {
        this.existencia = existencia;
    }
}
