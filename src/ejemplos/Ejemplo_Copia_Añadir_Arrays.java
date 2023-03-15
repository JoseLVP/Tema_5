package ejemplos;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ejemplo_Copia_Añadir_Arrays {

	public static void main(String[] args) {
		
		int Tabla1[] = {1,54,61,23,81,93,5,6};
		
		System.out.println("Contenido Original de Tabla1 -> " +Arrays.toString(Tabla1));

		System.out.print("Introduce la Cantidad de Numeros a añadir a la Tabla -> ");
		Scanner sc = new Scanner(System.in);
		int Añadir = sc.nextInt();
		
		
		int Tabla2[]=Arrays.copyOf(Tabla1, Tabla1.length+Añadir);
		
		for (int i = Tabla2.length-Añadir; i <=Tabla2.length-1; i++) {
			
			System.out.print("Introduce un numero para Añadirlo a la Tabla -> " );
			Tabla2[i]=sc.nextInt();
			
			
		}
		System.out.println("Contenido Nuevo de Tabla2 -> " +Arrays.toString(Tabla2));
		Arrays.sort(Tabla2);
		System.out.println("Contenido De Tabla2 Ordenado -> "+Arrays.toString(Tabla2));
		
		sc.close();
	}

}
