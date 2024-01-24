public class Factorial {
    public static void main(String[] args) {

//      Realiza un programa que calcule el factorial de un número determinado por el usuario.


        var x = 10;
        var factorial = 1;
        for (int i = 1; i <= x; i++) {
            factorial *= i;
        }
        System.out.println("factorial = " + factorial);
    }
}

