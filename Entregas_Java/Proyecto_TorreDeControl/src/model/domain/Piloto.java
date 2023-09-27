package model.domain;

public class Piloto {
	private String nombre;
	private String apellido;
	private boolean licenciaVigente;
	
	public Piloto(String nombre, String apellido, boolean licenciaVigente) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.licenciaVigente = licenciaVigente;
	}

	
	public boolean isLicenciaVigente() {
		return licenciaVigente;
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", apellido=" + apellido + ", licenciaVigente=" + licenciaVigente + "]";
	}
	
	
	
	
}
