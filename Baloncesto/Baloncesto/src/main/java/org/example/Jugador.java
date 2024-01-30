package org.example;

import java.time.LocalDate;

public class Jugador {
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private int canastas;
    private int rebotes;
    private int asistencias;
    private Enum posicion;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, LocalDate fechaNacimiento, int canastas, int rebotes, int asistencias, Enum posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.canastas = canastas;
        this.rebotes = rebotes;
        this.asistencias = asistencias;
        this.posicion = posicion;
    }

    public int getAge() {
        return LocalDate.now().getYear() - this.getFechaNacimiento().getYear();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCanastas() {
        return canastas;
    }

    public void setCanastas(int canastas) {
        this.canastas = canastas;
    }

    public int getRebotes() {
        return rebotes;
    }

    public void setRebotes(int rebotes) {
        this.rebotes = rebotes;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public Enum getPosicion() {
        return posicion;
    }

    public void setPosicion(Enum posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador: " +  nombre + " " + apellido + ", " + fechaNacimiento + ", canastas:" + canastas + ", rebotes:" + rebotes + ", asistencias:" + asistencias + ", posicion:" + posicion;
    }
}


