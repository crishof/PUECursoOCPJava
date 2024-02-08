import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class ArrayCirculos {
    public static void main(String[] args) {

        /*
        1º circulo Tendrá color de tipo string y en un metodo main sencillo una lista de circunferencias.
        Usar metodo Random. Para cada circunferencia calcular area y perimetro.

        2º hacer un metodo auxiliar y que reciba una lista de circunferencias y
        que reciba un 2º parametro que sea el colo de tipo string.
        Este metodo retornara otra lista que solo tenga las circunferencias del color pasado como parámetro
        y que este metodo auxiliar sea llamado por el main.
        También muestre por la consola la circunferencia de area maxima, minima
        y la media del area de todas las circunferencias. (editado)
         */

        List<String> colores = List.of("Amarillo", "Rojo", "Azul", "Verde");
        Random random = new Random();

        List<Circulo> circulos = new ArrayList<>();


        for (int i = 0; i < 10; i++) {

            var ran = random.nextDouble(100) + 1;

            Circulo circulo = new Circulo(ran, colores.get(random.nextInt(3)));

            circulos.add(circulo);

        }

        Circulo circuloMax = circulos.get(0);
        Circulo circuloMin = circulos.get(0);

        double areaTotal = circulos.get(0).area();

        for (int i = 1; i < circulos.size(); i++) {

            if (circulos.get(i).area() < circuloMin.area()) {
                circuloMin = circulos.get(i);
            }
            if (circulos.get(i).area() > circuloMax.area()) {
                circuloMax = circulos.get(i);
            }

            areaTotal += circulos.get(i).area();
        }

        double media = areaTotal / circulos.size();

        System.out.println("media = " + media);
        System.out.println("areaTotal = " + areaTotal);

        System.out.println("circulos = " + circulos);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el color a buscar");
        String color = scanner.next();
        List<Circulo> circulosColor = filtrarColor(color, circulos);

        System.out.println("circulosColor = " + circulosColor);

    }

    public static List<Circulo> filtrarColor(String color, List<Circulo> circulos) {

        List<Circulo> circulosColor = new ArrayList<>();

        for (Circulo c : circulos) {
            if (c.getColor().equals(color)) {
                circulosColor.add(c);
            }
        }

        return circulosColor;
    }

    public static class Circulo {

        private final double radio;
        private final String color;

        public Circulo(double radio, String color) {
            this.radio = radio;
            this.color = color;
        }

        public double area() {
            return Math.PI * radio * radio;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Circulo{" + "radio=" + radio + ", color='" + color + '\'' + '}';
        }
    }
}
