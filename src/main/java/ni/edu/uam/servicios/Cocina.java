package ni.edu.uam.servicios;

import ni.edu.uam.modelos.Pedido;

public class Cocina {
    //Metodo que actualiza el estado del cliente
    public void prepararPedido(Pedido pedido) {
        pedido.cambiarEstado("En preparación"); // [cite: 40]
        System.out.println("[COCINA] El pedido ha llegado a la cocina, se esta preparando...");
    }

    // Notifica de vuelta al cajero
    public void notificarPedidoListo(Cajero cajero) {
        cajero.notificarCliente();
    }
}
