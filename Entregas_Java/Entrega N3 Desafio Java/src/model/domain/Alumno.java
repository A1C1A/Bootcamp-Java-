package model.domain;

import java.util.Arrays;

public class Alumno {

	public String nombre;
	public String apellido;
	public int nroDeExamen;
	public double [] calificaciones = new double[3];
	public double promedio;
	
	public Alumno() {
		
	}

	public Alumno(String nombre, String apellido, double[] calificaciones, double promedio) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.calificaciones = calificaciones;
		this.promedio = promedio;
	}
	
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", nroDeExamen=" + nroDeExamen
				+ ", calificaciones=" + Arrays.toString(calificaciones) + ", promedio=" + promedio + "]";
	}

	public String datos() {
		String mensaje = toString();
		return mensaje;
	}
	
}
