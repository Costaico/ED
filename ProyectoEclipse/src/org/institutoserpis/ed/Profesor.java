package org.institutoserpis.ed;

import java.util.Random;

public class Profesor {
	  public void ponerNotas(Alumno alumno) {
	        Random rnd = new Random();
	        Asignatura asignatura1, asignatura2, asignatura3;

	        asignatura1 = alumno.obtenerAsignatura1();
	        asignatura2 = alumno.obtenerAsignatura2();
	        asignatura3 = alumno.obtenerAsignatura3();

	        asignatura1.insertarCalificacion(rnd.nextDouble()*10);
	        asignatura2.insertarCalificacion(rnd.nextDouble()*10);
	        asignatura3.insertarCalificacion(rnd.nextDouble()*10);
	    }

	    public double calcularMedia(Alumno alumno) {
	        Asignatura asignatura1, asignatura2, asignatura3;
	        double nota1, nota2, nota3, media;

	        asignatura1 = alumno.obtenerAsignatura1();
	        asignatura2 = alumno.obtenerAsignatura2();
	        asignatura3 = alumno.obtenerAsignatura3();

	        nota1 = asignatura1.obtenerCalificacion();
	        nota2 = asignatura2.obtenerCalificacion();
	        nota3 = asignatura3.obtenerCalificacion();

	        media = (nota1 + nota2 + nota3)/3;

	        return media;
	    }
}
