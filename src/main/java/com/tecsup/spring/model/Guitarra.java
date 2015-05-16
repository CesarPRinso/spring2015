package com.tecsup.spring.model;

public class Guitarra extends Instrumento {

    public Guitarra(String nombre, String marca) {
        super(nombre, marca);
    }

    public Guitarra() {
    }

    public void sonido() {
        System.out.println("traaaaannnn (guitarra)");
    }

}
