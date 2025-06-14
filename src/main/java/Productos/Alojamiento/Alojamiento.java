package Productos.Alojamiento;

import Productos.Producto;

public abstract class Alojamiento extends Producto {
    protected String direccion;
    protected int cantNoches; //protected para poder acceder desde subclases

    public Alojamiento(String direccion, int cantNoches) {
        this.direccion = direccion;
        this.cantNoches = cantNoches;
    }
}
