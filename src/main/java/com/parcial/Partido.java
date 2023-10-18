package com.parcial;

import java.util.ArrayList;
import java.util.List;

public class Partido {
    private Estadio estadio;
    private Equipo local;
    private Equipo visitante;
    private String nombrePart;
    private List<TarjetaBase> tarjetas;

    public Partido(Estadio estadio, Equipo local, Equipo visitante, String nombrePart) {
        this.estadio = estadio;
        this.local = local;
        this.visitante = visitante;
        this.nombrePart = nombrePart;
        this.tarjetas = new ArrayList<>();
    }
    public Equipo getLocal(){
        return local;
    }
    public Equipo getVisitante(){
        return visitante;
    }
    public String getNombre(){
        return nombrePart;
    }
    public void agregar(TarjetaBase tarjeta) {
        tarjetas.add(tarjeta);
    }

    public List<TarjetaBase> getTarjetas() {
        return tarjetas;
    }
    public int tarjetasCantidad() {
        return tarjetas.size();
    }
    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

}

