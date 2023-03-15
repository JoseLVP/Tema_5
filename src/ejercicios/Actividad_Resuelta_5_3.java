package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_Resuelta_5_3 {

	static int Contador = 0;

	public static void main(String[] args) {

		System.out.print("Introduce la longitud de la Tabla a Realizar -> ");
		Scanner sc = new Scanner(System.in);
		int Longitud = sc.nextInt();

		int Tabla1[] = new int[Longitud];

		for (int i = 0; i < Tabla1.length; i++) {

			System.out.print("Introduce un numero -> ");
			int Dato = sc.nextInt();
			Tabla1[i] = Dato;

		}

		Arrays.sort(Tabla1);

		System.out.println("El orden de Menor a Mayor de la Tabla es -> " + Arrays.toString(Tabla1));

		System.out.print("El orden de Mayor a Menor de la Tabla es -> [");

		for (int i = Tabla1.length - 1; i >= 0; i--) {

			if (Contador == Tabla1.length - 1) { 
				System.out.print(Tabla1[i]);
				break;
			}

			System.out.print(+Tabla1[i] + ", ");
			Contador++;

		}
		System.out.print("]");
	}
}