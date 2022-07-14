import java.util.Scanner;
/**
 * Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean test = true;
        System.out.print("Introduce un numero positivo: ");
        int num = sc.nextInt();

        do{
            if(num >= 0){
                test = true;
                System.out.println("El numero es: " + num);
            }else {
                System.out.println("El numero es negativo , intentelo de nuevo");
                System.out.print("Introduce un numero positivo: ");
                num = sc.nextInt();
                test = false;
            }

        }while(test == false);
    }
}
