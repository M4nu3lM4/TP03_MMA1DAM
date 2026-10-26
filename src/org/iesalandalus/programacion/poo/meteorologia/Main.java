package org.iesalandalus.programacion.poo.meteorologia;

import org.iesalandalus.programacion.poo.meteorologia.modelo.Estacion;
import org.iesalandalus.programacion.poo.meteorologia.vista.Consola;
import org.iesalandalus.programacion.poo.meteorologia.modelo.*;

public class Main {
    public static void main(String[] args) {

            System.out.println("Estación 1");
            System.out.println("----------");
            Estacion estacion1 = new Estacion(Consola.leerDescripcion(),Consola.leerCoordenada());
            Estacion estacion2 = new Estacion(Consola.leerDescripcion(),Consola.leerCoordenada());
            System.out.println("Estacion 2");
            System.out.println("----------");
        System.out.println();
        for (int i = 0; i < 24; i++) {
            estacion1.actualizarLecturas();
            estacion2.actualizarLecturas();
            mostrarInformacion(i,estacion1.toString(),estacion2.toString());
        }

    }

    private static void mostrarInformacion(int hora, String infoEstacion1 , String infoEstacion2){

        System.out.println("hora: "+ hora + " h.");
        System.out.println("---------------");
         System.out.println(infoEstacion1);
         System.out.println(infoEstacion2);

    }


}
