package ni.edu.uam.servicios;

import ni.edu.uam.modelos.Pedido;

public class Cajero {
    private String nombre;

    public Cajero(String nombre) {
        this.nombre = nombre;
    }

    public void recibirPedido() {
        System.out.println("[CAJERO] Alexander: Recibí el pedido. Registrando en el sistema...");
    }

    // Envía el pedido a la cocina
    public void enviarACocina(Pedido pedido, Cocina cocina) {
        System.out.println("[CAJERO] Alexander: Pedido enviado a cocina. El estado ha cambiado.");
        cocina.prepararPedido(pedido); // [cite: 39]
        cocina.notificarPedidoListo(this); // [cite: 42]
    }

    // Notifica al cliente final
    public void notificarCliente() {
        System.out.println("[CAJERO] Alexander: ¡Su pedido está listo! Gracias por esperar.");
    }
}
