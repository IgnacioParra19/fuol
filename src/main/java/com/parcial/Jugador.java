package com.parcial;

public class Jugador implements IJugadorDeFutbol {
    private String nombre;
    private int numeroCamiseta;

    public Jugador(String nombre, int numeroCamiseta) {
        this.nombre = nombre;
        this.numeroCamiseta = numeroCamiseta;
    }

    @Override
    public String getNombre(){
        return nombre;
    }

    @Override
    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }
}
