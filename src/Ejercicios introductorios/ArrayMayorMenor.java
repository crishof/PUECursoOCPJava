import java.util.ArrayList;
import java.util.Random;

public class ArrayMayorMenor {

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            numeros.add(random.nextInt(100) + 1);
        }

        System.out.println("numeros = " + numeros);

        int menor = 100, mayor = 0;
        for (Integer numero : numeros) {

            if (numero < menor) {
                menor = numero;
            }
            if (numero > mayor) {
                mayor = numero;
            }
        }

        System.out.println("menor = " + menor);
        System.out.println("mayor = " + mayor);

    }
}
