import java.util.Random;

public class Persona {

    private static final char sexoDefault = 'H';
    private static final int underWeight = -1;
    private static final int inRangeWeight = 0;
    private static final int overWeight = 1;
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;


    public Persona() {
        this("", 0, sexoDefault, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.dni = generarDni();
        this.sexo = comprobarSexo(sexo);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Persona: \n" +
                "nombre: " + nombre + "\n" +
                "edad: " + edad + "\n" +
                "dni: " + dni + "\n" +
                "sexo: " + sexo + "\n" +
                "peso: " + peso + "\n" +
                "altura: " + altura;
    }

    public int calcularIMC() {

        double indice = peso * Math.pow(altura, 2);

        if (indice < 20) {
            return underWeight;
        } else if (indice <= 25) {
            return inRangeWeight;
        } else {
            return overWeight;
        }

    }

    public char comprobarSexo(char sexo) {
        return sexo == 'H' || sexo == 'M' ? sexo : sexoDefault;
    }

    public String generarDni() {

        int number = 10000000 + new Random().nextInt(50000000);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";

        return number + "-" + letras.charAt(number % 23);
    }

}
