package Productos.Paquete;

import Productos.Producto;

import java.util.List;

public class Paquete extends Producto {
    private List<Producto> productos;

    public Paquete(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public double getPrecio() {
        double precioTotal = 0;
        for (Producto prod : productos) {
            precioTotal += prod.getPrecio();
        }
        return precioTotal;
    }
}
