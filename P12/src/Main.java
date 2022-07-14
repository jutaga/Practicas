/**
 * Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
 */
public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 100 ; i++ ){

            if(i % 2 == 0){
                if(i % 3 == 0){
                    System.out.println( i + " Divisible por 2 y 3");
                }else{
                    System.out.println( i + " Divisible por 2");
                }
            }else if (i % 3 == 0){
                System.out.println( i + " Divisible por 3");
            }else {
                System.out.println(i);
            }
        }
    }
}
