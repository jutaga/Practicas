/**
 * Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
 */
public class Main {
    public static void main(String[] args) {
        int valor1 = 60;
        int valor2 = 600;

        if(valor1 > valor2){
            System.out.println(valor1 +  " Es mayor");
        }else if (valor1 < valor2){
            System.out.println(valor2 +  " Es mayor");
        }else {
            System.out.println(valor1 +  " y " + valor2 + " Son iguales");
        }
    }
}
