/**
 * Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
 */
public class Main {
    public static void main(String[] args) {
        int num1 = 80;
        int num2 = 12;
        int suma , resta, multiplicacion, division, modulo;

        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        modulo = num1 % num2;
        division = num1 / num2;

        System.out.println("suma= " + suma + "\n" +
              "Resta= " + resta + "\n" +
                "Multiplicacion= " + multiplicacion + "\n" +
                "Modulo= " + modulo + "\n" +
                "division= " + division);

    }
}
