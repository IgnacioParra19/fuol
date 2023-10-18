package com.parcial;

public class VAR {
    private Partido partido;
    
    public VAR(Partido partido) {
        this.partido = partido;
    }

    public int cantidadTarjetasRojas() {
        int contador = 0;
        for (TarjetaBase tarjeta : partido.getTarjetas()) {
            if (tarjeta instanceof TarjetaRoja) {
                contador++;
            }
        }
        return contador;
    }
    
    public int cantidadTarjetasAmarillas() {
        int contador = 0;
        for (TarjetaBase tarjeta : partido.getTarjetas()) {
            if (tarjeta instanceof TarjetaAmarilla) {
                contador++;
            }
        }
        return contador;
    }
}
