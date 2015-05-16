package com.tecsup.spring.model;

import java.util.List;

public class Musico {

    private String nombre;

    private int canciones;

    private Instrumento instrumentoFavorito;

    private List<Instrumento> instrumentos;

    public Musico() {

    }

    public Musico(String nombre, int canciones) {
        this.nombre = nombre;
        this.canciones = canciones;
    }

    public Musico(Instrumento instumentoFavorito) {
        this.instrumentoFavorito = instumentoFavorito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCanciones() {
        return canciones;
    }

    public void setCanciones(int canciones) {
        this.canciones = canciones;
    }

    public Instrumento getInstrumentoFavorito() {
        return instrumentoFavorito;
    }

    public void setInstrumentoFavorito(Instrumento instrumentoFavorito) {
        this.instrumentoFavorito = instrumentoFavorito;
    }

    public List<Instrumento> getInstrumentos() {
        return instrumentos;
    }

    public void setInstrumentos(List<Instrumento> instrumentos) {
        this.instrumentos = instrumentos;
    }

}
