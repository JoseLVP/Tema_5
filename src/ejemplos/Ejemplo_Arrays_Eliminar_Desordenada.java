package ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejemplo_Arrays_Eliminar_Desordenada {

	public static void main(String[] args) {

		int Tabla1[] = new int[10];

		for (int i = 0; i < Tabla1.length; i++) {

			Tabla1[i] = (int) (Math.random() * 2 + 1);

		}

		System.out.println("Nuestro Array es -> " + Arrays.toString(Tabla1));

		System.out.print("Indique el numero a Eliminar del Array -> ");
		Scanner sc = new Scanner(System.in);
		int Eliminar = sc.nextInt();

		for (int j = 0; j < Tabla1.length; j++) {

			int posicion = -1;

			if (Tabla1[j] == Eliminar) {

				posicion = j;

			}

			if (posicion >= 0) {

				Tabla1[j] = Tabla1[Tabla1.length - 1];

				Tabla1 = Arrays.copyOf(Tabla1, Tabla1.length - 1);

				j--;
			}

		}

		Arrays.sort(Tabla1);
		System.out.println(Arrays.toString(Tabla1));
	}
}
