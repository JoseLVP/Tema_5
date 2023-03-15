package ejemplos;

import java.util.Arrays;

public class Ejemplo_Ordenar_Arrays {

	static int Contador = 0;

	public static void main(String[] args) {

		int Tabla1[] = { 1, 2, 6, 4, 9, 11, 27, 3 };

		System.out.println(Arrays.toString(Tabla1)); // Visualizamos la Tabla desordenada, en el orden que hemos
														// introducido los datos
		Arrays.sort(Tabla1); // Recoge los datos y los ordena de Menos a Mayor
		System.out.println("Array -> " + Arrays.toString(Tabla1)); // Visualizamos la Tabla ordenada de Menor a Mayor

		
		
		System.out.print("Array Invertido -> [");
		
		for (int i = Tabla1.length - 1; i >= 0; i--) {  
			
			if (Contador==Tabla1.length-1) {				//Funcion para invertir el orden de los Numeros
				System.out.print(Tabla1[i]);
				break;
			}

			System.out.print(+Tabla1[i] + ", ");			
			Contador++;
		}
		System.out.print("]"); 
	}

}
