import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {

//      Write a program that generates a random number and asks the user to guess what the number is. If the user’s guess is higher than the random number, the program should display Too high, try again. If the user’s guess is lower than the random number, the program should display Too low, try again. The program should use a loop that repeats until the user correctly guesses the random number.

        Random random = new Random();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        var numeroAdivinar = random.nextInt(100) + 1;

        int num1;
        do {
            System.out.println("Ingrese un numero");
            num1 = scanner.nextInt();
            if (num1 < numeroAdivinar) {
                System.out.println("El numero es mayor");
            } else if (num1 > numeroAdivinar) {
                System.out.println("El numero es menor");
            }
        } while (num1 != numeroAdivinar);

        System.out.println("Enorabuena! el numero es: " + numeroAdivinar);
    }
}