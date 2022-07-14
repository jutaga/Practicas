import java.util.Scanner;
/**
 * Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».
 * Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).
 */
public class Main {
    public static void main(String[] args) {
        String nombre = "Juan pablo";
        Scanner string = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre1 = string.nextLine();



        System.out.println("Bienvenido " + nombre);
        System.out.println("Bienvenido " + nombre1);

    }
}
