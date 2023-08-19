package com.almacen.src.model;

import java.util.Date;

public class PersonaNatural extends Persona{
    private String email;
    private Date fechaNacimiento;

    public PersonaNatural(String email, Date fechaNacimiento) {
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
