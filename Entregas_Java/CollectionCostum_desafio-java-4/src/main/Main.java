package main;

import model.domain.CollectionCostum;

public class Main {

	public static void main(String[] args) {
		CollectionCostum<String> miColeccion = new CollectionCostum<String>();
		System.out.println("/ Método add / \n");
		miColeccion.add("Aldana");
		miColeccion.add("Alvarez");
		miColeccion.add("Nacho");
		miColeccion.mostrarColeccion();
		System.out.println("Tamaño de la colección: " + miColeccion.size());
		
		System.out.println(" \n/Método addFirst() / \n");
		miColeccion.addFirst("Carolina");
		miColeccion.addFirst("Claudia");
		miColeccion.mostrarColeccion();
		System.out.println("Tamaño de la colección: " + miColeccion.size());
		
		System.out.println(" \n/Método addLast() / \n");
		miColeccion.addLast("Rocio");
		miColeccion.mostrarColeccion();	
		System.out.println("Tamaño de la colección: " + miColeccion.size());
		
		System.out.println(" \n/Método remove() / \n");
		miColeccion.remove("Nacho");
		miColeccion.remove("Alvarez");
		miColeccion.mostrarColeccion();
		System.out.println("Tamaño de la colección: " + miColeccion.size());
		
		System.out.println(" \n/Método isEmpty() / \n");
		miColeccion.isEmpty();
		
		System.out.println(" \n/Método removeAll() / \n");
		miColeccion.removeAll();
		miColeccion.mostrarColeccion();
		System.out.println("Tamaño de la colección: " + miColeccion.size());
		
		System.out.println(" \n/Método isEmpty() / \n");
		miColeccion.isEmpty();
	}
}
