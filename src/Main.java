import generator.producto;
import generator.itemFactura;
import generator.factura;
import generator.cliente;

import java.util.Scanner;

public class Main {
    //Creacion del nuevo cliente
    public static void main(String[] args) {
        cliente cliente = new cliente();
        Scanner scanner = new Scanner(System.in);

        //Informacion del cliente

        System.out.print("Ingrese el Nombre del Cliente: ");
        cliente.setNombre(scanner.nextLine());

        System.out.print("Ingrese el Nif del Cliente: ");
        cliente.setNif(scanner.nextLine());

        //Genrecacion de factura automatica

        System.out.print("Ingrese una descripción de la factura (o presione Enter para usar la predeterminada): ");
        String descripcion = scanner.nextLine();

        descripcion = (descripcion.length() == 0)
                ? "La factura electrónica es un documento digital que certifica la venta de bienes o servicios,\ncumpliendo con requisitos legales y fiscales. Contiene información clave como los datos del vendedor y comprador,\nnúmero de factura, fecha, descripción de productos o servicios, precios, impuestos y el total a pagar."
                : descripcion;

        factura factura = new factura(descripcion, cliente);


    }
}