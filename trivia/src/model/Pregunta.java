package model;

public class Pregunta {

    private String afirmacion;
    private boolean esCierta;
    private int dificultad;

    public Pregunta(String afirmacion, boolean esCierta, int dificultad) {
        this.afirmacion = afirmacion;
        this.esCierta = esCierta;
        this.dificultad = dificultad;
    }

    public String getAfirmacion() {
        return afirmacion;
    }

    public void setAfirmacion(String afirmacion) {
        this.afirmacion = afirmacion;
    }

    public boolean getEsCierta() {
        return esCierta;
    }

    public void setEsCierta(boolean esCierta) {
        this.esCierta = esCierta;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "afirmacion='" + afirmacion + '\'' + ", esCierta=" + esCierta + ", dificultad=" + dificultad + '}';
    }
}
