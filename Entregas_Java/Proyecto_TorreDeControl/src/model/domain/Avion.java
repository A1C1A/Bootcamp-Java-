package model.domain;

public class Avion extends Volador{
	private String modelo;
	private String numVuelo;
	
	public Avion(String tipo, String modelo, String numVuelo, int codigo, String companiaAerea, double altitud, double velocidad, Piloto piloto) {
		super(tipo, codigo, companiaAerea, altitud, velocidad, piloto);
		this.modelo = modelo;
		this.numVuelo = numVuelo;
	}

	

	@Override
	public Piloto solicitarAutorizacion() {
		super.setEstadoDeVuelo(EstadoDeVuelo.ESPERANDO_AUTORIZACION);
		System.out.println("La aeronave: " + toString() + "solicita autorización para descender");
		return getPiloto();
	}

	@Override
	public Piloto getPiloto() {
		return super.getPiloto();
	}

	@Override
	public String toString() {
		return "Avion [modelo=" + modelo + super.toString();
	
	}
	
}
