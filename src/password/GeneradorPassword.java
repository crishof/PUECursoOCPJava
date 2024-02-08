package password;

import java.util.Scanner;

public class GeneradorPassword {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la longitud del pass");
        int longitud = scanner.nextInt();
        Password password = new Password(longitud);

        System.out.println("password = " + password.getPass());

        System.out.println("Password fuerte: " + password.esFuerte(password.getPass()));

    }
}
