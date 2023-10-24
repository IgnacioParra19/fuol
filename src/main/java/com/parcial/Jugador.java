package com.parcial;

public class Jugador implements IJugadorDeFutbol {
    private String nombre;
    private int numeroCamiseta;
    private String posicion;

    public Jugador(String nombre, int numeroCamiseta) {
        this.nombre = nombre;
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posFut) {
        this.posicion = posFut;
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
