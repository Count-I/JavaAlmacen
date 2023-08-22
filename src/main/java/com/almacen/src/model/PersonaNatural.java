package com.almacen.src.model;

import java.time.LocalDate;
import java.util.Date;

public class PersonaNatural extends Persona{
    private String email;
    private LocalDate fechaNacimiento;

    public PersonaNatural(String email, LocalDate fechaNacimiento) {
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
