import java.util.Scanner;

public class EjRectangulo {

    public static void main(String[] args) {

        //        Rectángulos:
//        Realiza un programa  que pida al usuario la información para crear un rectángulo.
//                El programa pedirá al usuario que especifique  las dimensiones del rectángulo:  largo y ancho.
//                Después el programa ha de calcular el área y el perímetro del rectángulo.
//
//        Siguiente paso.  Haz que el programa sea capaz de almacenar  cinco rectángulos especificados por el usuario.
//        Primero utiliza un bucle tradicional.
//        Después realiza la misma operación con un bucle foreach.
//
//        Muestra por la consola  la lista de rectángulos,  de manera que  aparezcan las características de cada rectángulo de uno a uno.
//
//        A continuación,  muestra la media del área de todos los rectángulos.
//
//        Finalmente,  muestra por la consola la posición del rectángulo cuya área es máxima.


        Scanner scanner = new Scanner(System.in);

//        List<Rectangulo> rectangulos = new ArrayList<>();


//        for (int i = 0; i < 5; i++) {
//
//            System.out.println("RECTANGULO " + (i + 1) + " :");
//            System.out.println("Ingrese valor de lado 1");
//            var lado1 = scanner.nextInt();
//            System.out.println("Ingrese valor de lado 2");
//            var lado2 = scanner.nextInt();
//
//            var area = calcularArea(lado1, lado2);
//            var perimetro = calcularPerimetro(lado1, lado2);
//
//            rectangulos.add(new Rectangulo(lado1, lado2, perimetro, area));
//
//        }

        var cont = 0;
        Rectangulo[] rectangulos = new Rectangulo[5];
        for (Rectangulo rectangulo : rectangulos) {

            System.out.println("RECTANGULO " + (cont + 1) + " :");
            System.out.println("Ingrese valor de lado 1");
            var lado1 = scanner.nextInt();
            System.out.println("Ingrese valor de lado 2");
            var lado2 = scanner.nextInt();

            var area = calcularArea(lado1, lado2);
            var perimetro = calcularPerimetro(lado1, lado2);

            rectangulos[cont] = new Rectangulo(lado1, lado2, area, perimetro);

            cont++;
        }
        var sumaAreas = 0;
        cont = 0;
        for (Rectangulo rectangulo : rectangulos) {
            System.out.println("RECTANGULO " + (cont + 1) + " :" + rectangulo);
            sumaAreas += rectangulo.area;
        }

        System.out.println("Media de areas = " + sumaAreas / rectangulos.length);


        int maxArea = 0;

        for (Rectangulo rectangulo : rectangulos) {
            if (rectangulo.area > maxArea) {
                maxArea = rectangulo.area;
            }
        }

        System.out.println("maxArea = " + maxArea);
    }


    public static int calcularArea(int lado1, int lado2) {
        return lado1 * lado2;
    }

    public static int calcularPerimetro(int lado1, int lado2) {
        return lado1 * 2 + lado2 * 2;
    }

    public static class Rectangulo {

        int lado1;
        int lado2;
        int area;
        int perimetro;

        public Rectangulo(int lado1, int lado2, int area, int perimetro) {
            this.lado1 = lado1;
            this.lado2 = lado2;
            this.area = area;
            this.perimetro = perimetro;
        }

        @Override
        public String toString() {
            return "Rectangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", area=" + area + ", perimetro=" + perimetro + '}';
        }
    }
}
