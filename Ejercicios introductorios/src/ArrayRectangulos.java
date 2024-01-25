import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayRectangulos {

    public static void main(String[] args) {


        Random random = new Random();
        List<Rectangulo> rectangulos = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            rectangulos.add(new Rectangulo(random.nextInt(100), random.nextInt(100)));
        }

        var cont = 1;

        for (Rectangulo r : rectangulos) {
            System.out.println("Area rectangulo " + cont + ": " + r.area());
            cont++;
        }

        System.out.println("suma de todas las areas = " + rectangulos.stream().mapToDouble(Rectangulo::area).sum());
        System.out.println("La media de areas es: " + rectangulos.stream().mapToDouble(Rectangulo::area).average());
        System.out.println("El area mayor es: " + rectangulos.stream().mapToDouble(Rectangulo::area).max());

        double test = rectangulos.stream().mapToDouble(Rectangulo::area).max().orElse(0);
        System.out.println("test = " + test);

    }

    public static class Rectangulo {

        int lado1;
        int lado2;

        public Rectangulo(int lado1, int lado2) {
            this.lado1 = lado1;
            this.lado2 = lado2;
        }

        public double area() {
            return lado1 * lado2;
        }

        public double perimetro() {
            return (lado1 + lado2) * 2;
        }

        @Override
        public String toString() {
            return "Rectangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", area=" + area() + ", perimetro=" + perimetro() + '}';
        }
    }
}
