package org.institutoserpis.ed;

public class ProyectoEclipse {
	public static void main(String[] args) {
        Asignatura asignatura1 = new Asignatura(1),
                   asignatura2 = new Asignatura(2),
                   asignatura3 = new Asignatura(3);
        Alumno alumno = new Alumno(asignatura1, asignatura2, asignatura3);
        Profesor profesor = new Profesor();

        profesor.ponerNotas(alumno);
        System.out.printf("Nota media del alumno: %4.2f%n",
                profesor.calcularMedia(alumno));
    }

}
