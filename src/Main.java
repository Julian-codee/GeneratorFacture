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


    }
}