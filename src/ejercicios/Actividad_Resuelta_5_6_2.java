package ejercicios;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Actividad_Resuelta_5_6_2 {

	static int Contador=0;
	
	public static void main(String[] args) {
		
		System.out.println("Introduce la combinacion de la Loteria -> ");
		Scanner sc = new Scanner(System.in);
		
		int Tabla1[] = new int [6];
		int Tabla2[] = new int [6];
		
		for (int i = 0; i <= Tabla1.length-1; i++) {
			
			int Propia = sc.nextInt();
			Tabla1[i]=Propia;
		}
		System.out.println("Los numeros de tu Loteria son -> " +Arrays.toString(Tabla1));

		for (int j = 0; j <=Tabla2.length-1; j++) {
			
			int Random =(int) (Math.random()*100+1);
			Tabla2[j]=Random;
			
		}
		Arrays.sort(Tabla2);
		System.out.println("La combinacion Ganadora de la Loteria es -> " +Arrays.toString(Tabla2));
		
		 for (int i = 0; i < Tabla2.length-1; i++) {
			
			 int p = Arrays.binarySearch(Tabla1, Tabla2[i]);
			 
			  if (p>0) {
				Contador++;
			}
		}
		
		System.out.println("El numero de Aciertos en la Loteria es -> " +Contador);
		
		}
		
		
	

}

