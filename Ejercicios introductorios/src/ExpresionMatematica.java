public class ExpresionMatematica {
    public static void main(String[] args) {

//        Write a method in Java that resolves this mathematical expression where x and y are two variables pre-set in your code.

        int x = 4;
        int y = 2;

        var expresion = Math.pow(x, 2) + Math.pow((((4 * y) / 5) - x), 2);

        System.out.println("expresion = " + expresion);
    }
}

