import java.util.Scanner;
/**
 * Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce cuantas ventas deseas hacer: ");
        int numVentas = sc.nextInt();
        int precioTotal = 0;
        int producto;

        for(int i = 1; i <= numVentas; i++){
            System.out.print(i + ". Producto: ");
            producto = sc.nextInt();
            precioTotal = precioTotal + producto;
        }
        System.out.println("Total a pagar: " + precioTotal + " Pesos");
    }
}
