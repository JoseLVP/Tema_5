package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Actividad_Resuelta_5_10 {

	public static void main(String[] args) {
		
		int Numeros[] = new int [20];
		
		for (int i = 0; i<Numeros.length; i++) {
			
			Numeros[i] = (int)(Math.random()*50+1);
		
		}
		
		Arrays.sort(Numeros);
		System.out.println("Nuestro Array es -> " +Arrays.toString(Numeros));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A partir de que Numero quieres Eliminar? -> ");

		int NumeroMax = sc.nextInt();
		
		int[] ArraySinMayores = SinMayores(Numeros, NumeroMax);
		
		System.out.println("El Array sin el numero Elegido -> " +Arrays.toString(ArraySinMayores));
		
		sc.close();
	}

	static int[] SinMayores (int[]Numero, int NumMaximo) {
		
		int Copia[] = new int [0];
		
		for (int Elemento : Numero) {
			
			if (Elemento <NumMaximo) {
				
				Copia=Arrays.copyOf(Copia, Copia.length+1);
				Copia[Copia.length-1]=Elemento;
				
			}
			
			
		}
		
		
		return Copia;
	}
	
}
