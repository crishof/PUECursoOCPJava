import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

//      Desarrolla un programa que convierta la temperatura de Celsius a Fahrenheit y viceversa. Permite al usuario elegir la dirección de la conversión.

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese la cantidad de grados");
        int temp = scanner.nextInt();
        int opcion;
        var resultado = 0;
        do {
            System.out.println("Ingrese 1 para convertir  de F° a C° o 2 para convertir a de C° a F°");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> resultado = (temp - 32) * 5 / 9;
                case 2 -> resultado = (temp * 9 / 5) + 32;
                default -> System.out.println("Opcion incorrecta");
            }

        } while (opcion != 1 && opcion != 2);

        if (opcion == 1) {
            System.out.println(temp + " F° equivalen a " + resultado + "C°");
        } else {
            System.out.println(temp + " F° equivalen a " + resultado + "C°");
        }
    }
}
