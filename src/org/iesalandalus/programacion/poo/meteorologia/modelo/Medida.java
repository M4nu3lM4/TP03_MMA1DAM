package org.iesalandalus.programacion.poo.meteorologia.modelo;

public enum Medida {
    TEMPERATURA("T"),
    HUMEDAD("H"),
    PRESION("P");


    private final String simbolo;

    private Medida(String simbolo){
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return simbolo;
    }
}
