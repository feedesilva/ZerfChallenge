package Productos.Vuelo;
import Productos.Producto;

import java.time.LocalDate;

public class Vuelo extends Producto {
    private LocalDate fechaIda;

    /**
     * Fecha vuelta puede ser {@code null} si es un vuelo de ida solamente.
     */
    private LocalDate fechaVuelta;
    private String aerolinea; //podría ser una clase para tener consistencia de datos
    private double precio;

    public Vuelo(LocalDate fechaIda, LocalDate fechaVuelta, String aerolinea, double precio) {
        this.fechaIda = fechaIda;
        this.fechaVuelta = fechaVuelta;
        this.aerolinea = aerolinea;
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}
