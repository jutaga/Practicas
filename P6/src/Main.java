import java.util.Scanner;
/**
 *  Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
 */
public class Main {
    public static void main(String[] args) {
        int num = 18;
        Scanner valor = new Scanner(System.in);

        if(num % 2 == 0){
            System.out.println("El numero es divisible por 2");
        }else {
            System.out.println("El numero no es divisible por 2");
        }

    }
}
