package ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo_Array_Busqueda_Multiple {

	public static void main(String[] args) {
		
		
		int Tabla1[] = {1,2,3,4,5,6,7,8,9,1,2,3};
		
		
		System.out.print("Indique el numero a Buscar -> ");
		Scanner sc = new Scanner(System.in);
		int ElementoBuscado = sc.nextInt();
		
		int[] Posicion = buscar (Tabla1, ElementoBuscado);
		
		if (Posicion.length >=0) {
			System.out.println("El valor buscado esta en la posicion -> " +(Arrays.toString(Posicion)));

		} else {
			System.out.println("No se ha encontrado el valor buscado");	
		}

	}

	static int[] buscar (int[] Tabla, int Elemento) {
		
		int[] Lugar = new int[0];
		
		for (int i=0; i< Tabla.length; i++) {
			
			if (Tabla[i]==Elemento) {
				Lugar = Arrays.copyOf(Lugar, Lugar.length+1);
				Lugar[Lugar.length-1]=i;
				
			}
		}
		
		return Lugar;
		
	}
	
	
}
