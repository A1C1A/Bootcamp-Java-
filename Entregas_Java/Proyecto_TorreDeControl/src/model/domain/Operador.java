package model.domain;

public class Operador {
	private String nombre;
	private String apellido;
	/*
	 * codigo identificador de operador, permite registrar el operador que realiza las diferentes acciones en
	 * la torre de control. 
	 */
	private int codDeOperador;
	
	public Operador(String nombre, String apellido, int codDeOperador) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.codDeOperador = codDeOperador;
	}
	
	/*
	 * teniendo en cuenta el tipo de volador y la vigencia de la licencia del piloto, retorna false si
	 * la licencia ya no es vigente, o true en caso de sí serlo.  
	 */
	public void verificarSolicitudAterrizaje(Volador v, Piloto piloto) {
		TorreDeControl torreDeControl = new TorreDeControl();
		if(piloto.isLicenciaVigente() == false) {
			System.out.println("Autorización denegada. Licencia de piloto inválida \n");
		} else {
			v.setEstadoDeVuelo(EstadoDeVuelo.FINALIZADO);
			System.out.println("Autorización concedida, puede aterrizar. \n");
			torreDeControl.asignarPista(v, false);
			System.out.println(v);
		}
	}

	@Override
	public String toString() {
		return "Operador [nombre=" + nombre + ", apellido=" + apellido + ", codDeOperador=" + codDeOperador + "]";
	}
	
	
	

}
