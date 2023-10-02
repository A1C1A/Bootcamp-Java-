package model.domain;

import java.util.Arrays;

public class CollectionCostum<T>{
    private T[]array;
    private int capacidad = 1;
	
	public CollectionCostum() {
		array = (T[]) new Object[capacidad];
	}

	public CollectionCostum(T[] array) {
		super();
		this.array = array;
	}

	public void mostrarColeccion() {
		for(T t: array) {
			if(t != null ) {
			System.out.println(t);
			}
		}
	}
	
	public int size() {
		return capacidad-1;
	}
	
	public void addFirst(T elemento) { 
		capacidad++;
		int aux = 1;
		T[] nuevoArray = Arrays.copyOf(array, array.length);
		array = (T[]) new Object[capacidad];
		
		array[0] = elemento;
		for(T t: nuevoArray) {
			array[aux] = t;
			aux ++;
		}
		
	
	}
	
	public void addLast(T elemento) {
		capacidad++;
		int aux = 0;
		T[] nuevoArray = Arrays.copyOf(array, array.length);
		array = (T[]) new Object[capacidad];
		
		for(T t: nuevoArray) {
			if(t != null) {
				array[aux] = t;
				aux++;
			} else {
				array[aux] = elemento;
			}
		}
	}
	
	public void remove(T elemento) {
		int aux = 0;
		for(int i=0; i<array.length; i++) {
			if(array[i] == elemento) {
				array[i] = null;
				capacidad--;
			}
		}
		T[] nuevoArray = Arrays.copyOf(array, array.length);
		array = (T[]) new Object[capacidad];
		for(T n: nuevoArray) {
			if(n != null) {
				array[aux] = n;
				aux++;
			}
		}
		
	}
	
	public void add(T elemento) {
		capacidad++;
		
        T[] nuevoArray = Arrays.copyOf(array, array.length);
        array = (T[]) new Object[capacidad];

		int contadorAux = 0;
		for(T t: nuevoArray) {
			if(t != null) {
				array[contadorAux]=t;
				contadorAux++;
			} else {
				array[contadorAux] = elemento;

			}
		}
	}
	
	public void removeAll() {
		for(int i=0; i<array.length; i++) {
				array[i] = null;
				capacidad = 1;
			}
	}
	
	public void isEmpty() {
		boolean isEmpty = false;
		for(int i=0; i<array.length; i++) {
			if(array[0] == null) {
				isEmpty = true;
			}else {
				isEmpty = false;
			}
	    }
		if(isEmpty == true) {
			System.out.println("La colección está vacía");
		} else{
			System.out.println("La colección posee " + size() + " elementos");
		}
	}

}
