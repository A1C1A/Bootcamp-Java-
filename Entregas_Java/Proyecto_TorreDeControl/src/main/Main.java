package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.domain.Avion;
import model.domain.Avioneta;
import model.domain.Helicoptero;
import model.domain.Operador;
import model.domain.Piloto;
import model.domain.TorreDeControl;
import model.domain.Volador;
/* 
 * La logica del programa consiste en que, en el caso de ser un objeto volador de tipo avion o avioneta, posee
 * una autorizacion inicial inmediata, la cual se confirmará en el caso de que la licencia del piloto sea vigente. En el caso de tratarse
 * de un helicoptero (u otro tipo de aeronave, el helicoptero es solo un ejemplo) la autorización deberá ser evaluada directamente por un operador
 * de la torre, quien decretará si o no dependiendo de la vigencia de la licencia del piloto. 
 * En la vida real, la autorizacion de que una aeronave aterrice depende de muchos otros factores pero decidí mantener el código lo más sencillo 
 * posible teniendo en cuenta que es una practica. 
 */


public class Main {
	static List<Volador> voladores = new ArrayList<>();
	
	public static void main(String[] args) {
		
		TorreDeControl torreDeControl = new TorreDeControl();
		Operador operador = obtenerDatosOperadorTorre();
		mostrarCodigosAeronaves();
		obtenerDatosAeronave();
		
		for (Volador v: voladores) {
			boolean verificacion = torreDeControl.verificarVolador(v);
			if(verificacion == true) {
				torreDeControl.autorizarAterrizaje(v);
				torreDeControl.asignarPista(v, true);
			} else {
				operador.verificarSolicitudAterrizaje(v, v.solicitarAutorizacion());
			}
		}
		}
	
	public static void mostrarCodigosAeronaves() { //se muestran por pantalla los codigos pertenecientes a cada uno de los objetos de tipo volador
		System.out.println("Codigos de aeronaves: \n Avion: 01 \n Avioneta: 02 \n Helicoptero: 03 \n" );
	}
	
    public static Operador obtenerDatosOperadorTorre() { //se obtienen los datos del operador de la torre de control por pantalla y se crea la instancia

		Scanner scanner = new Scanner (System.in);
		System.out.println("Por favor, a continuación ingrese sus datos de operador. \n Nombre:");
		String nombre = scanner.next();
		System.out.println("Apellido:");
		String apellido = scanner.next();
		System.out.println("Código identificador de operador:");
		int codigo = Integer.parseInt(scanner.next());
		Operador operador = new Operador (nombre, apellido, codigo);
		return operador;
		
	}
	
	public static void obtenerDatosAeronave() {	//se obtienen los datos de la aeronave por pantalla, y dependiendo del codigo de la misma, se crea una instancia diferente de un objeto volador
		int respuesta;
		do {
		Scanner scanner = new Scanner (System.in);
		System.out.println("A continuación ingrese los datos de la aeronave: \n Tipo:");
		String tipo = scanner.next();
		System.out.println("Codigo:");
		int codigo = Integer.parseInt(scanner.next());
		System.out.println("Compañia aérea:");
		String compania = scanner.next();
		System.out.println("Altitud:");
		double altitud = scanner.nextDouble();
		System.out.println("Velocidad:");
		double velocidad = Double.parseDouble(scanner.next());
		
		switch (codigo) {
		case 01:
			System.out.println("Modelo:");
			String modelo = scanner.next();
			System.out.println("Numero de vuelo:");
			String numDeVuelo = scanner.next();
			Volador avion = new Avion(tipo, modelo, numDeVuelo, codigo, compania, altitud, velocidad, obtenerDatosPiloto());
			voladores.add(avion);
			break;
			
		case 02:
			Volador avioneta = new Avioneta(tipo, codigo, compania, altitud, velocidad, obtenerDatosPiloto());
			voladores.add(avioneta);
			break;
			
		case 03:
			System.out.println("Cantidad de hélices:");
			int cantHelices = scanner.nextInt();
			Volador helicoptero = new Helicoptero(tipo, codigo, compania, altitud, velocidad, cantHelices, obtenerDatosPiloto());
			voladores.add(helicoptero);
			break;
		}
		System.out.println("¿Desea ingresar los datos de otra aeronave? Presione 1 para sí y 2 para no");
		respuesta = Integer.parseInt(scanner.next());
		} while(respuesta == 1); 
	}
	
	public static Piloto obtenerDatosPiloto() { //se obtienen los datos del piloto de la aeronave por pantalla y se instancia el objeto
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingrese por favor los datos del piloto: \n Nombre:");
		String nombre = scanner.next();
		System.out.println("Apellido:");
		String apellido = scanner.next();
		System.out.println("¿Está vigente su licencia?");
		boolean isValidLicence = scanner.nextBoolean();
		Piloto piloto = new Piloto (nombre, apellido, isValidLicence);
		return piloto;
	}

}
