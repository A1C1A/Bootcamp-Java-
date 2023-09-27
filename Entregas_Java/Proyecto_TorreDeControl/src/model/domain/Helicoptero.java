package model.domain;

public class Helicoptero extends Volador {
	private int cantHelices;
	
	public Helicoptero(String tipo, int codigo, String companiaAerea, double altitud, double velocidad, int cantHelices, Piloto piloto) {
		super(tipo, codigo, companiaAerea, altitud, velocidad, piloto);
		this.cantHelices = cantHelices;
		
	}
	

	@Override
	public Piloto solicitarAutorizacion() {
		super.setEstadoDeVuelo(EstadoDeVuelo.ESPERANDO_AUTORIZACION);
		System.out.println("La aeronave: " + toString() + "solicita autorización para descender");
		return getPiloto();
	}


	@Override
	public String toString() {
		return "Helicoptero [cantHelices=" + cantHelices + super.toString();
	}
	
	
	

}
