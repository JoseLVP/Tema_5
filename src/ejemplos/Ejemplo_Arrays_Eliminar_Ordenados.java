package ejemplos;

import java.util.Arrays;

public class Ejemplo_Arrays_Eliminar_Ordenados {

	public static void main(String[] args) {
		
		
		int Tabla1[] = {3,34,45,67,567,2388,8765,1005};
		
		int Eliminar = 567;
		
		System.out.println("Array Original -> " +Arrays.toString(Tabla1));
		
		int IndiceEliminar = Arrays.binarySearch(Tabla1, Eliminar);
		
		if (IndiceEliminar >= 0) {
			System.err.println("Indice donde se encuentra el numero a Eliminar -> " +IndiceEliminar);
			System.arraycopy(Tabla1, IndiceEliminar+1, Tabla1, IndiceEliminar, Tabla1.length-IndiceEliminar-1);
		}

		System.out.println("Nueva Tabla sin el Numero -> " +Arrays.toString(Tabla1));
	
		Tabla1=Arrays.copyOf(Tabla1, Tabla1.length-1);
		
		System.out.println("Nueva Tabla para Presentar-> " +Arrays.toString(Tabla1));
		
	}

}

