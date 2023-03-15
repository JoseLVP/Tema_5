package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_Resuelta_5_5 {

	public static void main(String[] args) {

		System.out.print("Introduce la Longitud que la Tabla -> ");
		Scanner sc = new Scanner(System.in);
		int Longitud = sc.nextInt();

		System.out.print("Introduce el tope de los numeros -> ");
		int Tope = sc.nextInt();

		int Tabla1[] = new int[Longitud];

		for (int i = 0; i <= Tabla1.length-1 ; i++) {

			int Random = (int) ((Math.random() * Tope + 1));

			if (Random % 2 == 0) {

				Tabla1[i] = Random;
				

			} else {
				i--;
			}
			
		}
		Arrays.sort(Tabla1);
		System.out.print(Arrays.toString(Tabla1));
	}

}
