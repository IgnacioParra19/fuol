package com.parcial;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private String abreviatura;
    private List<Jugador> jugadores;
    public Equipo(String nombre, String abreviatura){
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.jugadores = new ArrayList<>();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getAbreviatura(){
        return abreviatura;
    }
    public List<Jugador> getJugadores() {
        return jugadores;
    }
    public void agregar(Jugador jugador) {
        jugadores.add(jugador);
    }
    public int jugadoresCantidad(){
        return jugadores.size();
    }
    public Jugador obtenerJugador(int numeroCamiseta) {
        for (Jugador jugador : jugadores) {
            if (jugador.getNumeroCamiseta() == numeroCamiseta) {
                return jugador;
            }
        }
        return null;

}

    public String imprimirPlantel() {
            StringBuilder resultado = new StringBuilder();
            
            for (Jugador jugador : jugadores) {
                resultado.append("[").append(jugador.getNumeroCamiseta()).append("] ")
                        .append(jugador.getNombre()).append(" (").append(jugador.getPosicion()).append("), ");
            }
            if (resultado.length() > 2) {
                resultado.delete(resultado.length() - 2, resultado.length());
            }
            return resultado.toString();
        }
}

