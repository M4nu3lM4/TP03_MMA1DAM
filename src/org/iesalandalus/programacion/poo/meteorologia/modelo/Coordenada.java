package org.iesalandalus.programacion.poo.meteorologia.modelo;

public record Coordenada(float latitud,float longitud) {
    private static final float LATITUD_MINIMA = -90f;
    private static final float LATITUD_MAXIMA = 90f;
    private static final float LONGITUD_MINIMA = -180f;
    private static final float LONGITUD_MAXIMA = 180f;

    public Coordenada{
        validarLatitud(latitud);
        validarLongitud(longitud);
    }

    private void validarLatitud(float latitud){
        if (latitud < LATITUD_MINIMA || latitud > LATITUD_MAXIMA){
            throw new IllegalArgumentException("Latitud no válida");
        }
    }

    private void validarLongitud(float longitud){
        if (longitud < LONGITUD_MINIMA || longitud > LONGITUD_MAXIMA){
            throw new IllegalArgumentException("Longitud no válida");
        }
    }

    @Override
    public String toString() {
        return  "(" + latitud +"º, " + longitud + "º)";
    }
}
