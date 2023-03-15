package ejercicios;

import java.util.Arrays;

public class Actividad_Resuelta_5_8 {

	public static void main(String[] args) {

		int Random[] = new int [20];

		int Par[] = new int[0];
		int InPar[] = new int[0];

		for (int i = 0; i < Random.length; i++) {

			Random[i] = (int) (Math.random() * 20 + 1);
		}

		System.out.println("Nuestro Array Random es -> " + Arrays.toString(Random));

		for (int j = 0; j < Random.length ; j++) {
			if (Random[j] % 2 == 0) {

				Par = Arrays.copyOf(Par, Par.length + 1);
				Par[Par.length-1] = Random[j];
				
			} else {
				
				InPar = Arrays.copyOf(InPar, InPar.length + 1);
				InPar[InPar.length-1] = Random[j];
				
				
			}
		}

		System.out.println("Los Numeros Pares de nuestro Array son -> " +Arrays.toString(Par));
		System.out.println("Los Numeros Impares de nuestro Array son -> " +Arrays.toString(InPar));
		
}
}


