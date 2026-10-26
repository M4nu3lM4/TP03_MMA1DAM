package org.iesalandalus.programacion.poo.meteorologia.vista;

import org.iesalandalus.programacion.poo.meteorologia.modelo.Coordenada;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
    private Consola(){}

    public static String leerDescripcion(){

        String descripcion;
        System.out.print("Introduce la descripción: ");
         return Entrada.cadena();

    }

    public static Coordenada leerCoordenada(){
        Coordenada coordenada = null;
        do {
            System.out.print("Introduce la latitud: ");
            float latitud = Entrada.real();
            System.out.print("Introduce la longitud: ");
            float longitud = Entrada.real();
            try {
                coordenada = new Coordenada(latitud,longitud);
            }catch (IllegalArgumentException iae){
                System.out.println("ERROR: " + iae.getMessage());
            }
        }while (coordenada == null);
        return coordenada;
    }
}
