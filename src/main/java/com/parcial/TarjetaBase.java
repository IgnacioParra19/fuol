package com.parcial;

public abstract class TarjetaBase{
    private String tipoTarjeta;
    private Jugador jugador;


    public TarjetaBase(String tipoTarjeta, Jugador jugador) {
        setColor(tipoTarjeta);
        setJugador(jugador);
    }

    public String getColor() {
        return tipoTarjeta;
    }
    public void setColor(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
    public Jugador getJugador() {
        return jugador;
    }
    private void setJugador(Jugador value) {
        this.jugador = value;
    }
    @Override
    public String toString(){
        return String.format("Tarjeta %s para %s",
                    getColor(),
                    getJugador().getNombre());
    }
}

