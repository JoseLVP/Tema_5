package ejercicios;

import java.util.Scanner;

public class Actividad_Resuelta_5_2 {

	public static void main(String[] args) {
		
		
		int Tabla1[] = new int [5];
		
		for (int i =0 ; i<Tabla1.length; i++) {
			
			System.out.print("Introduce un Numero para el hueco " +(i+1)+" -> ");
			Scanner sc = new Scanner(System.in);
			int Recoger = sc.nextInt();
			
			Tabla1[i] = Recoger;
		}

		for ( int j = 0 ; j<Tabla1.length; j++) {
			
			System.out.println("El valor de la Tabla del hueco " +(j+1)+ " es " +Tabla1[j]);
			
		}
		
	}

}
