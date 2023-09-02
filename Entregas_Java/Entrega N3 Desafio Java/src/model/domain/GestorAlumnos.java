package model.domain;

import java.util.Scanner;

public class GestorAlumnos {

	private Alumno alumno;
	
	public GestorAlumnos() {
	}

	Scanner scanner = new Scanner (System.in);

	public Alumno registrarAlumno() {
		double [] notasExamenes = new double [3];
		int controlador = 1;
		double calificacion = 0;
		System.out.println("Ingrese el nombre del alumno");
		String nombre = scanner.next();
		System.out.println("Ingrese el apellido");
		String apellido = scanner.next();
		do {
			System.out.println("Ingrese el numero de examen: 1, 2, o 3");
			int nroDeExamen = scanner.nextInt();
			System.out.println("Ingrese la calificacion obtenida");
			int nota = scanner.nextInt();
			if(nota>=0 && nota <=10) {
				calificacion = nota;
			} else {
				System.out.println("La calificacion no es válida");
			}
			    
			switch(nroDeExamen) {
			         case 1: 
			        	 notasExamenes [0] = calificacion;
			         case 2: 
			        	 notasExamenes [1] = calificacion;
			         case 3: 
			        	 notasExamenes [2] = calificacion;
			     }
			controlador ++;
		} while (controlador <= notasExamenes.length); 
	
		double promedio = calcularPromedio(notasExamenes);
		alumno = new Alumno(nombre, apellido, notasExamenes, promedio);
		return alumno;
	}
	
	public double calcularPromedio (double[] array) {
		double promedio = 0;
		for(int i=0; i<array.length; i++) {
			double sumaNotas = array[i];
			promedio += sumaNotas;
		}
		promedio /= 3;
		   return promedio;
	}
	
	public String calcularNotaMasAlta (Alumno[]alumnos) {
		double promedioMasAlto = 0;
		String mensaje = null;
		for(int i=0; i<alumnos.length; i++) { //i=0
			Alumno alumno1 = new Alumno();
			alumno1 = alumnos [i];
				for(int z = 0;z<alumnos.length; z++) { 
					Alumno alumno2 = new Alumno();
					alumno2 = alumnos [z];
					if(alumno1.promedio>alumno2.promedio) {
						promedioMasAlto = alumno1.promedio;
					} 
				}
				mensaje = "El alumno con la nota más alta es:" + promedioMasAlto;
		}
		return mensaje;
	}
	
	public String calcularNotaMasBaja (Alumno[]alumnos) {
		double promedioMasBajo = 0;
		String mensaje = null;
		for(int i=0; i<alumnos.length; i++) { //i=0
			Alumno alumno1 = new Alumno();
			alumno1 = alumnos [i];
				for(int z = 0;z<alumnos.length; z++) { 
					Alumno alumno2 = new Alumno();
					alumno2 = alumnos [z];
					if(alumno1.promedio<alumno2.promedio) {
						promedioMasBajo = alumno1.promedio;
					} 
				}
				mensaje = "El alumno con la nota más baja es:" + promedioMasBajo;
		}
		return mensaje;
	}

	public void alumnosQuePromocionan (Alumno[] alumnos) {
		int contador =0;
		for(int i=0; i<alumnos.length; i++) {
			Alumno alumno = new Alumno();
			alumno = alumnos [i];
			if (alumno.promedio>=7) {
				contador ++;
				System.out.println("Promociona: " + alumno.datos());
			}
		}
		    if (contador == 0) {
			System.out.println("No hay alumnos que promocionen");
		    }
	}
	
	public void alumnosQueRecursan (Alumno[] alumnos) {
		int contador = 0;
		for(int i=0; i<alumnos.length; i++) {
			Alumno alumno = new Alumno();
			alumno = alumnos [i];
			if (alumno.promedio<7) {
				contador ++;
				System.out.println("Recursa: " + alumno.datos());
			}
		}
		if (contador == 0) {
			System.out.println("No hay alumnos que recursen");
		    }
	}
}



