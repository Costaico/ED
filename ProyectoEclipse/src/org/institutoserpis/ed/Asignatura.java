package org.institutoserpis.ed;

public class Asignatura {
    private int identificador;
    private double calificacion;

    public Asignatura(int identificador) {
        this.identificador = identificador;
    }

    public int obtenerIdentificador() {
        return identificador;
    }

    public double obtenerCalificacion() {
        return calificacion;
    }

    public void insertarCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
