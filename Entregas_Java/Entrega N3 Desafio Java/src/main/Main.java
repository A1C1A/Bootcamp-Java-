package main;

import java.util.Scanner;

import model.domain.Alumno;
import model.domain.GestorAlumnos;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 GestorAlumnos gestor = new GestorAlumnos();
	 int opcion;
	 Alumno alumno = new Alumno();
	 Scanner scanner = new Scanner (System.in);
	 System.out.println("Ingrese la cantidad de alumnos a procesar");
	 int cantidadAlumnos = scanner.nextInt();
	 Alumno [] alumnos = new Alumno [cantidadAlumnos];
	  
		 do {
			 System.out.println("Seleccione una opción: 1- Registrar alumno \n"
	 		+ "2- Alumno/a con la clasificación más alta \n"
			+ "3- Alumno/a con la clasificación más baja \n"
	 		+ "4- Mostar listado de alumnos que promocionan \n" 
			+ "5- Mostrar listado de alumnos recursantes \n"
	 		+ "6- Salir del programa");
	     opcion = scanner.nextInt();

	     switch (opcion) {
	     
	     case 1:
			for (int i=0; i<alumnos.length; i++) {
				alumnos [i] = gestor.registrarAlumno();
				alumno = alumnos [i];
			} 
			break;
	      case 2:
	    	 System.out.println(gestor.calcularNotaMasAlta(alumnos));;
			break;
	      case 3:
	    	  System.out.println(gestor.calcularNotaMasBaja(alumnos));
	    	  break;
	      case 4:
	    	  gestor.alumnosQuePromocionan(alumnos);
	    	  break;
	      case 5:
	    	  gestor.alumnosQueRecursan(alumnos);
	}
		 } while (opcion !=6);
     
}
	
}
