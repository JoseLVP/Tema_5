package ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo_Arrays_Eliminacion_Dicotomica {

	public static void main(String[] args) {

		int Tabla1[] = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println("Nuestro Arrays Completo -> " + Arrays.toString(Tabla1));
		System.out.print("Introduce un Numero para Eliminarlo del Array -> ");
		Scanner sc = new Scanner(System.in);
		int NumeroEliminar = sc.nextInt();

		int Posicion = Arrays.binarySearch(Tabla1, NumeroEliminar);

		if (Posicion >= 0) {
			for (int i = Posicion; i < Tabla1.length - 1; i++) {
				// La idea es coger el numero de la Posicion del Numero a eliminar, e ir
				// sustituyendo los valores de la Derecha de la Tabla para ir copiando los
				// valores
				Tabla1[i] = Tabla1[i + 1];

			}
			Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length - 1);
		}

		System.out.println("Nuestro Array con el Numero Eliminado -> " + Arrays.toString(Tabla1));

	
	}
}
