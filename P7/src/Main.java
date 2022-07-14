import java.util.Scanner;
/**
 *Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a
 */
public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.print("Escribe el numero a traducir a ASCII: ");
        int num = numero.nextInt();
        char ascii = (char)num;

        System.out.println(num + " En ASCII es: " + ascii);

    }
}
