package Productos.Alojamiento;

import Productos.Alojamiento.Alojamiento;

public class Hotel extends Alojamiento {
    private String nombre;
    private int cantEstrellas;

    public Hotel(String direccion, int cantNoches, String nombre, int cantEstrellas) {
        super(direccion, cantNoches);
        this.nombre = nombre;
        this.cantEstrellas = cantEstrellas;
    }

    @Override
    public double getPrecio() {
        return 10000 * cantEstrellas * cantNoches;
    }
}
