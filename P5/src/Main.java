import java.util.Scanner;

/**
 * Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.
 */
public class Main {

    public static void main(String[] args) {
        double area;
        double radio;
        Scanner valor = new Scanner(System.in);
        System.out.print("Introduce el radio: ");
        radio = valor.nextDouble();
        area = Math.PI * Math.pow(radio,2);

        System.out.println("Area del circulo es: " +area);

    }
}
