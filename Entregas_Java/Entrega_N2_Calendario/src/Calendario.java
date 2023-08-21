import java.util.Scanner;

public class Calendario {
	
	public static void main(String[] args) {
		
		int dia;
		int mes;
		int anio;
		boolean esBisiesto;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Por favor ingrese una día en formato dd");
		dia = scanner.nextInt();
		System.out.println("Por favor ingrese un mes en formato mm");
		mes = scanner.nextInt();
		System.out.println("Por favor ingrese un año entre 1900 y 2099 en formato yyyy");
		anio = scanner.nextInt();
		
		
		 // Primero verificamos que el año ingresado se encuentre dentro del parámetro permitido
		if (anio < 1900 || anio > 2099) {
			System.out.println("El año ingresado no es válido, por favor ingrese la fecha nuevamente");
		} else {  //Si el año es válido, procederemos a determinar si es o no bisiesto y en base a ello, los días válidos de acuerdo al mes
			esBisiesto = (anio % 4 == 0) ? true : false;
		
			if (esBisiesto == false && mes == 02 && dia > 28) {
				System.out.println("La fecha ingresada no es válida");
			} else if (esBisiesto == true && mes == 02 && dia > 29) {
				System.out.println("La fecha ingresada no es válida");
			} else {
				System.out.println("La fecha ingresada: " + dia + "/" + mes + "/" + anio + " es válida");
			}
		} 
		
		
	}

}
