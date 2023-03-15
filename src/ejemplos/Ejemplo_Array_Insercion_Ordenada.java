package ejemplos;

import java.util.Arrays;

public class Ejemplo_Array_Insercion_Ordenada {

	public static void main(String[] args) {
		
		int Tabla1[] = {1,2,3,4,6,7,8,9};
		
		int Insertar = 5;
		
		int IndiceInsercion = Arrays.binarySearch(Tabla1, Insertar);
		
		
		if (IndiceInsercion <0) {
			IndiceInsercion=-IndiceInsercion-1; /* Esta formula nos devuelve el indice donde se debe colocar el numero 
												a insertar en caso de que no exista en la tabla */
			
			System.out.println(IndiceInsercion);
			
		}
		
		int Copia[] = new int [Tabla1.length+1];
		
		System.arraycopy(Tabla1, 0, Copia, 0, IndiceInsercion);
		
		System.out.println(Arrays.toString(Copia));
		
		Copia[IndiceInsercion]=Insertar;
		
		System.out.println(Arrays.toString(Copia));
		
		System.arraycopy(Tabla1, IndiceInsercion, Copia, IndiceInsercion+1, Tabla1.length-IndiceInsercion);
		
		System.out.println(Arrays.toString(Copia));
		
		
		Tabla1 = Copia;
		
		System.out.println(Arrays.toString(Tabla1));
	}

}
