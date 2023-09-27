package model.domain;

public class Avioneta extends Volador{

	public Avioneta(String tipo, int codigo, String companiaAerea, double altitud, double velocidad, Piloto piloto) {
		super(tipo, codigo, companiaAerea, altitud, velocidad, piloto);


	}
	
	@Override
	public Piloto solicitarAutorizacion() {
		super.setEstadoDeVuelo(EstadoDeVuelo.ESPERANDO_AUTORIZACION);
		System.out.println("La aeronave: " + toString() + "solicita autorización para descender");
		return getPiloto();
	}

	@Override
	public String toString() {
		return "Avioneta" + super.toString();
	}
	
	


	
}
