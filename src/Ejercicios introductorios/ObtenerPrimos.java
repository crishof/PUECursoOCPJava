import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObtenerPrimos {
    public static void main(String[] args) {
        //      Realiza un programa que pregunte al usuario un número X.  El programa ha de mostrar  todos los números primos que existen desde 0 hasta X incluido.

        System.out.println("Ingrese un numero");

        Scanner scanner = new Scanner(System.in);

        var num = scanner.nextInt();
        List<Integer> primos = new ArrayList<>();

        for (int i = 2; i <= num; i++) {

            if (esPrimo(i)) {
                primos.add(i);
            }
        }
        System.out.println("primos menores que " + num + " = " + primos);
    }

    private static boolean esPrimo(int n) {

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}