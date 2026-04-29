package ni.edu.uam.modelos;

import ni.edu.uam.servicios.Cajero;

public class Cliente {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    // El cliente inicia el pedido
    public void hacerPedido(Cajero cajero) {
        System.out.println("\n[CLIENTE] " + this.nombre + ": Estoy realizando mi pedido...");
    }
}
