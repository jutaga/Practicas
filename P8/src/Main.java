import java.util.Scanner;
/**
 *Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter (char) y muestre su código en la tabla ASCII.
 */
public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("Escribe un char para su codigo ASCII: ");
        char caracter = numero.next().charAt(0);
        int ascii = (int)caracter;

        System.out.println(caracter + " En ASCII es: " + ascii);
    }
}
