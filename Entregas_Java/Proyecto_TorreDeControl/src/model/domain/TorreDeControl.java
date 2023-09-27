package model.domain;
import java.util.List;

import model.util.SistemaDeControl;

public class TorreDeControl implements SistemaDeControl{
	private Operador operador;
	boolean isAllowedToLand;
	boolean isValidCode;
	
	/*
	 * contructor por defecto para poder instanciar la clase y acceder a sus métodos
	 */
	public TorreDeControl() {
	}
	
	/*
	 * Verifica el tipo de volador que ingresa al espacio aéreo mediante su código. En caso de ser 
	 * 01 o 02 (avion o avioneta, respecticvamente) y si la licencia del piloto está vigente, retorna true.
	 *  En el caso de no cumplirse alguna de las dos condiciones, la torre niega su autorizacion y retorna false.
	 */
	@Override
	public boolean verificarVolador(Volador v) {
		do { 
			int codigo = v.getCodigo();
			if(codigo == 1 || codigo == 2) {
				isAllowedToLand = (v.getPiloto().isLicenciaVigente()==true?true:false); 
				isValidCode = true;
				} else if (codigo == 3){
				System.out.println(v);
				System.out.println("Este tipo de aeronave no está autorizado a aterrizar");
				isAllowedToLand = false;
				isValidCode = true;
			} else {
				System.out.println("El codigo ingresado no pertenece a ningun tipo de aeronave");
				isValidCode = false;
			}
		}while(isValidCode != true);
		return isAllowedToLand;
	} 
		
	
	/*
	 * En cuYo caso el metodo verificarVolador()retorne un booleano de valor true, la torre autoriza el aterrizaje.
	 * Una vez que sea autorizado, cambia el estado de vuelo a "finalizado", simulando el fin de su aterrizaje.
	 */
	@Override
	public void autorizarAterrizaje(Volador volador) {
		    volador.setEstadoDeVuelo(EstadoDeVuelo.EN_VUELO);
		    asignarPista(volador, true);
			System.out.println("Puede aterrizar");
			volador.setEstadoDeVuelo(EstadoDeVuelo.FINALIZADO);
			System.out.println(volador);
			System.out.println("Aterrizaje finalizado \n");	
		
	}

	/*
	 * Asigna la pista correspondiente dependiendo de si la aeronave cumplió o no los requisitos para una 
	 * autorizacion inmediata
	 */
	@Override
	public void asignarPista(Volador v, boolean estadoAutorizacion) {
		if(estadoAutorizacion == true) {
			v.setPistaAsignada("Pista 1");
		} else {
			v.setPistaAsignada("Pista 2");
		}
		
	}

	


}
