package Usuarios;

import Productos.Producto;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Usuario {
    private String nombreUsuario;
    private double presupuesto;
    private List<Producto> productosComprados;

    public Usuario(String nombreUsuario, double presupuesto) {
        this.nombreUsuario = nombreUsuario;
        this.presupuesto = presupuesto;
        this.productosComprados = new ArrayList<>();
    }

    public boolean contratarProducto(Producto producto) {
        if (producto.getPrecio() <= presupuesto) {
            productosComprados.add(producto);
            presupuesto -= producto.getPrecio();
            System.out.println("Producto adquirido con éxito.");
            return true;
        } else {
            System.out.println("No se puede adquirir el producto, presupuesto insuficiente.");
            return false;
        }
    }
    public int getCantidadProductosComprados() {
        return productosComprados.size();
    }
}

