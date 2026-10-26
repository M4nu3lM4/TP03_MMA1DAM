package org.iesalandalus.programacion.poo.meteorologia.modelo;

import java.util.Objects;

public class Estacion {

    private static final String PREFIJO_IDENTIFICADOR = "Estación";
    private static int numEstaciones = 0;
    private final String identificador;
    private String descripcion;

    private final Sensor sensorHumedad = new Sensor(Medida.HUMEDAD);
    private final Sensor sensorPresion = new Sensor(Medida.PRESION);
    private final Sensor sensorTemperatura = new Sensor(Medida.TEMPERATURA);
    private Coordenada ubicacion;




    public Estacion(String descripcion, Coordenada ubicacion){
        setDescripcion(descripcion);
        setUbicacion(ubicacion);
        numEstaciones++;
        identificador = PREFIJO_IDENTIFICADOR + numEstaciones;
    }


    private void setDescripcion(String descripcion){
        Objects.requireNonNull(descripcion,"La descripción no puede ser nula.");
        this.descripcion = descripcion;
    }

    private void setUbicacion(Coordenada ubicacion){
        Objects.requireNonNull(ubicacion,"La ubicación no puede ser nula.");
        this.ubicacion = ubicacion;
    }

    public void actualizarLecturas(){
        sensorTemperatura.medir();
        sensorHumedad.medir();
        sensorPresion.medir();
    }

    @Override
    public String toString() {
        return ( PREFIJO_IDENTIFICADOR + numEstaciones + descripcion + ubicacion);
    }
}
