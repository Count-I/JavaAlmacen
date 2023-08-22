package com.almacen.src.model;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;

public class ProductoEnvasado extends Producto{
    private LocalDate fechaEnvasado;
    private float pesoEnvase;
    private Pais paisOrigen;

    public ProductoEnvasado(int codigo, String nombre, Double valorUnitario, BigInteger existencia, LocalDate fechaEnvasado, float pesoEnvase, Pais paisOrigen) {
        super(codigo, nombre, valorUnitario, existencia);
        this.fechaEnvasado = fechaEnvasado;
        this.pesoEnvase = pesoEnvase;
        this.paisOrigen = paisOrigen;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public float getPesoEnvase() {
        return pesoEnvase;
    }

    public Pais getPaisOrigen() {
        return paisOrigen;
    }
}
