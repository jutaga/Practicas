import java.util.Scanner;
/**
 * Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
 */
public class Main {
    public static void main(String[] args) {
        Scanner precio = new Scanner(System.in);
        System.out.print("Introduce el precio del producto: ");
        double precioProducto = precio.nextDouble();
        final double iva = 0.21;
        double precioFinal = (precioProducto) + (precioProducto * iva);

        System.out.println("El valor total a pagar es de: " + precioFinal);
    }
}
