package ejemplos;

import java.util.Scanner;

public class Ejemplo_Array_For {

	public static void main(String[] args) {

		System.out.println("Introduce la Longitud de la Tabla");
		Scanner sc = new Scanner(System.in);
		int Longitud = sc.nextInt();

		int Tabla1[] = new int[Longitud];

		for (int i = 0; i < Tabla1.length; i++) {

			System.out.println("Introduce un Dato para la Tabla para la Posicion " +(i+1));

			int Dato = sc.nextInt();

			Tabla1[i] = Dato;

		}
		
		System.out.println("El dato de la tabla es " + Tabla1[2]);
		sc.close();
	}

}
