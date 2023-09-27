package model.domain;

public abstract class Volador {
	private String tipo;
	private int codigo;
	private String companiaAerea;
	private EstadoDeVuelo estadoDeVuelo; 
	private double altitud;
	private double velocidad;
	private String pistaAsignada;
	private Piloto piloto;
	
	public Volador(String tipo, int codigo, String companiaAerea, double altitud, double velocidad, Piloto piloto) {
		this.tipo = tipo;
		this.codigo = codigo;
		this.companiaAerea = companiaAerea;
		this.altitud = altitud;
		this.velocidad = velocidad;
		this.piloto = piloto;
		}
	
	public abstract Piloto solicitarAutorizacion();
	
	public int getCodigo() {
		return codigo;
	}

	public EstadoDeVuelo getEstadoDeVuelo() {
		return estadoDeVuelo;
	}

	public void setEstadoDeVuelo(EstadoDeVuelo estadoDeVuelo) {
		this.estadoDeVuelo = estadoDeVuelo;
	}
	
	public void setPistaAsignada(String pistaAsignada) {
		this.pistaAsignada = pistaAsignada;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	@Override
	public String toString() {
		return " codigo=" + codigo + ", companiaAerea=" + companiaAerea + ", estadoDeVuelo="
				+ estadoDeVuelo + ", altitud=" + altitud + "ft. " + ", velocidad=" + velocidad + "km/h" + ", Pista asignada = " + pistaAsignada + ", piloto=" + piloto + "]";
	}
	
	
	
	
	

}
