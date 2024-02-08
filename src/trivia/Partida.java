package trivia;

import java.util.ArrayList;

public class Partida {

    private final ArrayList<Pregunta> preguntas;

    public Partida() {

        this.preguntas = new ArrayList<>();

        preguntas.add(new Pregunta("La capital de Francia es París", true, 1));
        preguntas.add(new Pregunta("El cielo es rojo", false, 10));
    }

    public void mostrarPreguntas() {

        for (int i = 0; i < preguntas.size(); i++) {
            System.out.println(preguntas.get(i));
        }
    }
}
