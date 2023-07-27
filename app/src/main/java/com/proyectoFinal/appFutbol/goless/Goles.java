package com.proyectoFinal.appFutbol.goless;

public class Goles {

    private String numero;
    private String texto;
    private int imagenBoton;

    public Goles(String numero, String texto, int imagenBoton) {
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
