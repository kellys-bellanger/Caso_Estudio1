package ni.edu.uam;

import ni.edu.uam.modelos.*;
import ni.edu.uam.servicios.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("--- BIENVENIDO A LA CAFETERÍA UAM ---");

        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = leer.nextLine();

        System.out.print("¿Qué desea ordenar?: ");
        String nombreProducto = leer.nextLine();

        //Crear objetos
        Producto producto = new Producto(nombreProducto, 2.50);
        Cliente cliente = new Cliente(nombreCliente);
        Cajero cajero = new Cajero("Alexander");
        Cocina cocina = new Cocina();

        Pedido pedido = new Pedido();
        pedido.agregarProducto(producto);

        //Ejecución del flujo
        System.out.println("\n--- INICIANDO PROCESO DE PEDIDO ---");
        cliente.hacerPedido(cajero);
        cajero.enviarACocina(pedido, cocina);


        //Ticket de venta
        System.out.println("\n=======================================");
        System.out.println("           TICKET DE VENTA            ");
        System.out.println("=======================================");
        System.out.println(" CLIENTE: " + nombreCliente);
        System.out.println(" PRODUCTO: " + nombreProducto);
        System.out.println(" PRECIO: $2.50");
        System.out.println(" ESTADO: ENTREGADO");
        System.out.println("=======================================");
        System.out.println("      ¡Gracias por su compra!         ");
        System.out.println("=======================================");
    }
}
