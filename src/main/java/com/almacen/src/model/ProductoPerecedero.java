package com.almacen.src.model;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;

public class ProductoPerecedero extends Producto {
    private LocalDate fechaVencimiento;

    public ProductoPerecedero(int codigo, String nombre, Double valorUnitario, BigInteger existencia, LocalDate fechaEnvasado, float pesoEnvase, Pais paisOrigen) {
        super(codigo, nombre, valorUnitario, existencia);
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

}
