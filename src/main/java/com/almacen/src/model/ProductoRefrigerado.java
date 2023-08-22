package com.almacen.src.model;

import java.math.BigInteger;

public class ProductoRefrigerado extends Producto {
    private String codigoAlimentos;
    private short temperaturaRecomendadaRefrigeracion;

    public ProductoRefrigerado(int codigo, String nombre, Double valorUnitario, BigInteger existencia, String codigoAlimentos, short temperaturaRecomendadaRefrigeracion) {
        super(codigo, nombre, valorUnitario, existencia);
        this.codigoAlimentos = codigoAlimentos;
        this.temperaturaRecomendadaRefrigeracion = temperaturaRecomendadaRefrigeracion;
    }

    public ProductoRefrigerado(short temperaturaRecomendadaRefrigeracion) {
        this.temperaturaRecomendadaRefrigeracion = temperaturaRecomendadaRefrigeracion;
    }

    public String getCodigoAlimentos() {
        return codigoAlimentos;
    }

    public short getTemperaturaRecomendadaRefrigeracion() {
        return temperaturaRecomendadaRefrigeracion;
    }
}
