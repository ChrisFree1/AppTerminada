package com.proyectoFinal.appFutbol;

public class Destacados {

    private String numero;
    private String texto;
    private int imagenBoton;

    public Destacados(String numero, String texto, int imagenBoton) {
        this.numero = numero;
        this.texto = texto;
        this.imagenBoton = imagenBoton;
    }

    public String getNumero() {
        return numero;
    }

    public String getTexto() {
        return texto;
    }

    public int getImagenBoton() {
        return imagenBoton;
    }
}

