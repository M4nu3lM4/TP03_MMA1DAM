package org.iesalandalus.programacion.poo.meteorologia.modelo;

public enum Unidad {
    GRADOS("ºC",-10,50),
    PORCENTAJE("%",0,100),
    HECTOPASCALES("hPa",900,1200);

    private final String simbolo;

    private final int minimo;

    private final int maximo;

    private Unidad(String simbolo,int minimo, int maximo){
        this.simbolo = simbolo;
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public int getMinimo() {
        return minimo;
    }

    public int getMaximo() {
        return maximo;
    }

    @Override
    public String toString() {
        return simbolo;
    }
}
