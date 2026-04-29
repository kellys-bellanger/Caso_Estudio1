package ni.edu.uam.modelos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos;
    private String estado;

    public Pedido(List<Producto> productos, String estado) {
        this.productos = productos;
        this.estado = estado;
    }
    //Metodo para agregar productos a la lista
    public void agregarProducto(Producto p) {
        productos.add(p);
    }
    //Metodo que cambia el estado
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("LOG -> Estado del pedido actualizado a: " + estado);
    }
}
