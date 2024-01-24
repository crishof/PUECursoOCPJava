import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {

//        Dado una palabra en Java (String), mostrar por la consola el número de vocales

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra");

        var palabra = scanner.next();

        var contador = 0;

        String vocales = "aeiou";

        for (int i = 0; i < palabra.length(); i++) {

            if (vocales.contains(String.valueOf(palabra.charAt(i)))) {
                contador++;
            }
        }

        System.out.println("contador = " + contador);

    }
}
