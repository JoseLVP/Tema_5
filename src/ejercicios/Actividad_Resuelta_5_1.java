package ejercicios;

import java.util.Scanner;

public class Actividad_Resuelta_5_1 {

	public static void main(String[] args) {
		
		int Dato=0, Suma=0;
		
		System.out.println("Introduce la Longitud de la Tabla");
		Scanner sc = new Scanner(System.in);
		int Longitud = sc.nextInt();
		
		int Tabla1[] = new int [Longitud];
		
		for (int i = 0; i<Tabla1.length; i++) {
			
			Dato= (int)(Math.random()*100+1);
			
			Suma = Suma+Dato;
			
			Tabla1[i] = Dato;
			
			System.out.println("El Dato guardado en el espacio " +(i+1)+ " De la tabla es -> " +Tabla1[i]);
			
		}
		
		System.out.println("La suma total de los datos introducidos es -> " +Suma);
			
	}

}
