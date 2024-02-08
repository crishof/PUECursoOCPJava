import java.util.Scanner;

public class Vocales {
    public static void main(String[] args) {

//      Dado una palabra en Java (String), mostrar por la consola el número de vocales
//      Reemplazar las vocales por otro caracter

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String vocales = "aeiou";

        System.out.println("Ingrese una palabra");
        var palabra = scanner.next();

        System.out.println("La palabra tiene " + contarVocales(palabra, vocales) + " vocales");

        System.out.println("Palabra con las vocales reemplazadas: " + reemplazarVocales(palabra, vocales));
    }

    private static String reemplazarVocales(String palabra, String vocales) {

        String palabraNueva = "";

        for (int i = 0; i < palabra.length(); i++) {

            palabraNueva = palabra.replaceAll("[aeiou]", "-");

        }

        return palabraNueva;
    }

    public static int contarVocales(String palabra, String vocales) {
        var contador = 0;

        for (int i = 0; i < palabra.length(); i++) {

            if (vocales.contains(String.valueOf(palabra.charAt(i)))) {
                contador++;
            }
        }
        return contador;
    }
}
