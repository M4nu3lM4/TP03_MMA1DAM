package org.iesalandalus.programacion.poo.meteorologia.modelo;

import java.util.Objects;

public record Medicion(int valor, Unidad unidad) {

    public Medicion{
        validarParametros(valor,unidad);
    }

    private void validarParametros(int valor,Unidad unidad){
        Objects.requireNonNull(unidad,"La unidad no puede ser nula.");

        if (valor < unidad.getMinimo() || valor > unidad.getMaximo()){
            throw new IllegalArgumentException("El valor no esta dentro de los limites");
        }

    }

    @Override
    public String toString() {
        return valor + " " + unidad ;
    }
}
