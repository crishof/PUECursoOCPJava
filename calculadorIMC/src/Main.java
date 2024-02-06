import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese edad");
        int edad = scanner.nextInt();
        System.out.println("Ingrese sexo");
        char sexo = scanner.next().toUpperCase().charAt(0);
        System.out.println("Ingrese peso");
        double peso = scanner.nextDouble();
        System.out.println("Ingrese altura");
        double altura = scanner.nextDouble();

        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona p2 = new Persona(nombre, edad, sexo);
        Persona p3 = new Persona();
        p3.setNombre(nombre);
        p3.setEdad(edad);
        p3.setSexo(sexo);
        p3.setPeso(peso);
        p3.setAltura(altura);

        List<Persona> personaList = Arrays.asList(p1, p2, p3);

        for (Persona p : personaList) {
            System.out.println(p);
            switch (p.calcularIMC()) {
                case -1 -> System.out.println("Está por debajo de su peso");
                case 0 -> System.out.println("Esta ok de peso");
                case 1 -> System.out.println("Esta con sobrepeso");
            }
        }
    }
}