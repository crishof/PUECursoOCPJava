package Baloncesto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class EquipoBaloncesto {
    public static void main(String[] args) {
//        Requisitos:
//        Crear una clase JugadorBaloncesto y como atributos:
//        -String nombre
//        -String apellido
//        -Localdate fecha nacimiento
//        -int numero de canastas
//        -int numero de rebotes
//        -int numero de asistencias
//        -(String o Enum) posicion en el campo la hacemos con un string tambien a piñón,
//        pero si alguien se anima que investige ENUM (comparte recurso por Slack)
//        Enunciado:
//        Desde un main crear 10 jugadores en una lista de jugadores. Cada jugador hardcoded.


        List<Jugador> listaJugadores = crearListaJugadores();

        System.out.println("= = = = = LISTA DE JUGADORES = = = = =");
        print(listaJugadores);

//        2.   Filtrar la lista de jugadores según dos parámetros: el tipo de jugador y el número de canastas mínimo.
//        Por ejemplo, retornar una lista de los aleros que han conseguido 100 canastas o más.

        String tipo = "ALERO";
        int canastas = 20;
        List<Jugador> filtro1 = filtarPorTipoYMinimoCanastas(listaJugadores, tipo, canastas);
        System.out.println("= = = = = FILTRADO POR " + tipo + " y mayor a " + canastas + " canastas = = = = = ");
        print(filtro1);

//        3.   Media del número de rebotes de todos los pivots.

        System.out.println("= = = = = FILTRADO POR MEDIA DE REBOTES DE TODOS LOS PIVOTS = = = = = ");

        List<Jugador> listaPivots = listaJugadores.stream().filter(jugador -> jugador.getPosicion().toString().equals("PIVOT")).toList();

        double mediaRebotes = listaPivots.stream().mapToInt(Jugador::getRebotes).average().orElse(0.0);
        System.out.println("La media es : " + mediaRebotes + " y se evaluaron " + listaPivots.size() + " registro(s)");
        print(listaPivots);

//      4.   Top 5 de jugadores que han conseguido más canastas de entre 18 y 23 años. No hardcoded, tienen que ser parametrizables

        int edadMin = 18;
        int edadMax = 23;

        System.out.println("Jugadores del top 5 ");

        List<Jugador> jugadoresRangoFecha = listaJugadores.stream().filter(jugador -> jugador.getFechaNacimiento().isBefore(LocalDate.now().minusYears(edadMin))).filter(jugador -> jugador.getFechaNacimiento().isAfter(LocalDate.now().minusYears(edadMax))).limit(5).toList();

        print(jugadoresRangoFecha);

        Collections.sort(listaJugadores);

        System.out.println("Lista ordenada");

        for (Jugador j : listaJugadores) {
            System.out.println("j = " + j);
        }

    }

    private static List<Jugador> crearListaJugadores() {

        List<Jugador> listaJugadores = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Jugador jugador = crearJugadorAleatorio();
            listaJugadores.add(jugador);
        }

        return listaJugadores;
    }

    public static List<Jugador> filtarPorTipoYMinimoCanastas(List<Jugador> jugadores, String tipo, int canastas) {

        return jugadores.stream().filter(jugador -> jugador.getCanastas() > canastas).filter(jugador -> jugador.getPosicion().toString().equals(tipo)).toList();
    }

    private static Jugador crearJugadorAleatorio() {
        Random random = new Random();
        String[] nombres = {"Juan", "Ana", "Luis", "María", "Carlos", "Laura", "Pedro", "Elena", "Miguel", "Carmen"};
        String[] apellidos = {"García", "Martínez", "López", "Fernández", "Pérez", "Gómez", "Rodríguez", "Sánchez", "Díaz", "Vargas"};
        LocalDate fechaNacimiento = LocalDate.of(1995 + random.nextInt(10), 1 + random.nextInt(12), 1 + random.nextInt(28));
        int canastas = random.nextInt(100);
        int rebotes = random.nextInt(50);
        int asistencias = random.nextInt(30);
        Posicion[] posiciones = Posicion.values();
        Posicion posicion = posiciones[random.nextInt(posiciones.length)];

        return new Jugador(nombres[random.nextInt(nombres.length)], apellidos[random.nextInt(apellidos.length)], fechaNacimiento, canastas, rebotes, asistencias, posicion);
    }

    private static void print(List<Jugador> listaJugadores) {

        for (Jugador jugador : listaJugadores) {
            System.out.println(jugador);
        }
    }
}