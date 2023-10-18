package com.parcial;

public class Estadio {
    private String name;
    private String ciudad;
    private String pais;

    public Estadio(String name, String ciudad, String pais) {
        this.name = name;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getName() {
        return name;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return name + ", " + ciudad + " (" + pais + ")";
    }
}
