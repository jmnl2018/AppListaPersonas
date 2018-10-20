package com.familia.applistapersonas.model;

/**
 * Created by AcademiaMoviles on 20/10/2018.
 */

public class PersonaModel {

    private String nombres;
    private String telefono;

    public PersonaModel() {
    }

    public PersonaModel(String nombres, String telefono) {
        this.nombres = nombres;
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}
