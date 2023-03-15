package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_Resuelta_5_9 {

	static Scanner sc = new Scanner(System.in);
	static int Contador = 0;

	public static void main(String[] args) {

		int Participante1[] = new int[3];
		int Participante2[] = new int[3];
		int Participante3[] = new int[3];
		int Participante4[] = new int[3];
		int Participante5[] = new int[3];
		int Global[] = new int[5];
		int Global2[] = new int[5];
		int Total[] = new int[5];

		int Guardar[] = PrimerPunto(Participante1, Participante2, Participante3, Participante4, Participante5, Global);

		System.out.println("La Puntuacion de los Participantes, en Orden, es -> " + Arrays.toString(Guardar));

		int Guardar2[] = SegundoPunto(Participante1, Participante2, Participante3, Participante4, Participante5, Global2);

		System.out.println("La Puntuacion de los Participantes, en Orden, es -> " + Arrays.toString(Guardar2));

		
		for (int i = 0; i<Total.length; i++) {
			
			Total[i] = Guardar[i] + Guardar2[i];
			
		}
		
		Arrays.sort(Total);
		
		System.out.println("La puntuacion final de todos los participantes son -> " +Arrays.toString(Total));
		
	}

	static int[] PrimerPunto(int[] Participante1, int[] Participante2, int[] Participante3, int[] Participante4,
			int[] Participante5, int[] Global) {
		for (int j = 0; j < 6; j++) {

			System.out.print("1º Ronda - Que participante ha terminado? -> ");
			int Terminar = sc.nextInt();

			if (Terminar == 1) {
				System.out.print("Cual es la Puntuacion del Participante " + Terminar + " ? ->");
				Participante1[0] = sc.nextInt();
				Global[0] = Participante1[0];
				Contador++;

			}

			if (Terminar == 2) {
				System.out.print("Cual es la Puntuacion del Participante " + Terminar + " ? ->");
				Participante2[0] = sc.nextInt();
				Global[1] = Participante2[0];
				Contador++;

			}

			if (Terminar == 3) {
				System.out.print("Cual es la Puntuacion del Participante " + Terminar + " ? ->");
				Participante3[0] = sc.nextInt();
				Global[2] = Participante3[0];
				Contador++;

			}

			if (Terminar == 4) {
				System.out.print("Cual es la Puntuacion del Participante " + Terminar + " ? ->");
				Participante4[0] = sc.nextInt();
				Global[3] = Participante4[0];
				Contador++;

			}

			if (Terminar == 5) {
				System.out.print("Cual es la Puntuacion del Participante " + Terminar + " ? ->");
				Participante5[0] = sc.nextInt();
				Global[4] = Participante5[0];
				Contador++;

			}

			if (Contador == 5) {
				break;

			}

		}

		return Global;
	}

	static int[] SegundoPunto(int[] Participante1, int[] Participante2, int[] Participante3, int[] Participante4,
			int[] Participante5, int[] Global2) {
		for (int j = 0; j < 5; j++) {

			System.out.print("2º Ronda - Que participante ha terminado? -> ");
			int Terminar = sc.nextInt();

			if (Terminar == 1) {
				System.out.print("Cual es la Puntuacion del Participante " + Terminar + " ? ->");
				Participante1[1] = sc.nextInt();
				Global2[0] = Participante1[0];
				Contador++;

			}

			if (Terminar == 2) {
				System.out.print("Cual es la Puntuacion del Participante " + Terminar + " ? ->");
				Participante2[1] = sc.nextInt();
				Global2[1] = Participante2[0];
				Contador++;

			}

			if (Terminar == 3) {
				System.out.print("Cual es la Puntuacion del Participante " + Terminar + " ? ->");
				Participante3[1] = sc.nextInt();
				Global2[2] = Participante3[0];
				Contador++;

			}

			if (Terminar == 4) {
				System.out.print("Cual es la Puntuacion del Participante " + Terminar + " ? ->");
				Participante4[1] = sc.nextInt();
				Global2[3] = Participante4[0];
				Contador++;

			}

			if (Terminar == 5) {
				System.out.print("Cual es la Puntuacion del Participante " + Terminar + " ? ->");
				Participante5[1] = sc.nextInt();
				Global2[4] = Participante5[0];
				Contador++;

			}

			if (Contador == 5) {
				break;

			}

		}

		return Global2;
	}

	
	
}
