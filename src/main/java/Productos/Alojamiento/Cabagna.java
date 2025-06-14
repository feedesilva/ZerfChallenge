package Productos.Alojamiento;

import Productos.Producto;

import java.util.List;

public class Cabagna extends Producto {
    private List<CasaDepartamento> casas;
    private boolean esGrupal;

    public Cabagna(List<CasaDepartamento> casas, boolean esGrupal) {
        this.casas = casas;
        this.esGrupal = esGrupal;
    }

    @Override
    public double getPrecio() {
        double precioTotal = 0;
        for (CasaDepartamento casa : casas) {
            precioTotal += casa.getPrecio();
        }
        if (esGrupal) {
            int cantidadCasas = casas.size(); //obtengo cantidad de casas
            //comparo entre descuento por casa y máximo descuento a hacer. El menor descuento es el que corre.
            double descuento = Math.min(0.1 * cantidadCasas, 0.5);
            precioTotal *= (1 - descuento);
    }
        return precioTotal;
    }
}
