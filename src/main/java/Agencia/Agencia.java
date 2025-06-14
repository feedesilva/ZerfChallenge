package Agencia;

import Productos.Producto;
import Usuarios.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Agencia {
    private List<Usuario> usuarios;

    public Agencia() {
        this.usuarios = new ArrayList<>();
    }

    public void altaUsuario (Usuario usuario) {
        // Hago una verificación para evitar duplicados y nulos
        if (usuario != null && !usuarios.contains(usuario)) {
            usuarios.add(usuario);
            System.out.println("Usuario " + usuario.getNombreUsuario() + " dado de alta.");
        } else {
            System.out.println("El usuario ya existe o es nulo.");
        }
    }

    //nombres de usuario por cant de productos adquiridos decreciente
    public List<String> usuariosPorCantDeProds(){
        return usuarios.stream()
                .sorted((u1, u2) -> Integer.compare(u2.getCantidadProductosComprados(), u1.getCantidadProductosComprados()))
                .map(Usuario::getNombreUsuario)
                .collect(Collectors.toList());
    }

    public List<Producto> productosQuePuedeAdquirir (Usuario usuario, List<Producto> disponibles){
        return disponibles.stream()
                .filter(producto -> producto.getPrecio() <= usuario.getPresupuesto())
                .collect(Collectors.toList());
    }
}
