package com.almacen.src.controller;

import com.almacen.src.model.Almacen;
import com.almacen.src.model.PersonaJuridica;

public enum AlmacenInstance {
    INSTANCE;

    private final Almacen almacen;

    AlmacenInstance() {
        almacen= new Almacen();
        almacen.getClientes().add(new PersonaJuridica("1213"));
    }

    public Almacen getAlmacen() {
        return almacen;
    }
}
