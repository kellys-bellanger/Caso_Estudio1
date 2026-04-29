package ni.edu.uam.modelos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos;
    private String estado;

    public Pedido() {
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
    }
    //Metodo para agregar productos a la lista
    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    //Metodo que cambia el estado
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("-> Estado del pedido actualizado a: " + nuevoEstado);
    }
}
