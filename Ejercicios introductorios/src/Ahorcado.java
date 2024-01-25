import java.util.Random;
import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {

//        Implementa el juego del ahorcado. La computadora elige una palabra al azar y el usuario tiene que adivinarla ingresando letras.

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String[] palabras = {"palabra", "ordenador", "murcielago", "capitolio", "castillo"};
        String palabraAdivinar = palabras[new Random().nextInt(palabras.length)];

        char[] resultado = new char[palabraAdivinar.length()];

        char letra;
        var letrasEncontradas = 0;

        for (int i = 0; i < palabraAdivinar.length(); i++) {

            resultado[i] = '_';
        }


        while (palabraAdivinar.length() != letrasEncontradas) {

            System.out.println("Ingrese una letra");
            letra = scanner.next().charAt(0);

            for (int i = 0; i < palabraAdivinar.length(); i++) {

                if (palabraAdivinar.charAt(i) == letra) {
                    resultado[i] = letra;
                    letrasEncontradas++;
                }
            }

            System.out.println(" - - - - -- ");

            for (char posicion : resultado) {
                System.out.print(posicion);
            }
            System.out.println();
            System.out.println(" - - - - -- ");
            System.out.println("letrasEncontradas = " + letrasEncontradas);
        }

        System.out.println("Enorabuena!! Encontraste la palabra");


    }
}
