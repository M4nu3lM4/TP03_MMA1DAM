package org.iesalandalus.programacion.poo.meteorologia.modelo;
import org.iesalandalus.programacion.poo.meteorologia.vista.Consola;
import org.iesalandalus.programacion.poo.meteorologia.modelo.*;
import java.util.Objects;

public class Sensor {

    private Medida medida;
    private Unidad unidad;
    private Medicion ultimaMedicion = null;


    public Sensor(Medida medida){
        setTipo(medida);
    }

    private void setTipo(Medida medida){
        this.medida = Objects.requireNonNull(medida,"La medida no puede ser nula.");
        switch (medida){
            case TEMPERATURA -> unidad = Unidad.GRADOS;
            case HUMEDAD -> unidad = Unidad.PORCENTAJE;
            case PRESION -> unidad = Unidad.HECTOPASCALES;
        }
    }
    public void medir(){

         int valor = (int) (Math.random() * (unidad.getMaximo() - unidad.getMinimo() + 1)) + unidad.getMinimo();
         ultimaMedicion = new Medicion(valor,unidad);
    }

    @Override
    public String toString() {
        return medida + " = " + ultimaMedicion;
    }
}
