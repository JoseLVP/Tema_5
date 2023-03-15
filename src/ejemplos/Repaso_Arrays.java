package ejemplos;

import java.util.Arrays;
import java.util.Scanner;

public class Repaso_Arrays {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int Comensales;

		// Indica el numero de Comensales

		

		do {

			System.out.println("Introduzca el Numero de Comensales [Max 6]");

			Comensales = sc.nextInt();
			
			if (Comensales >= 1 && Comensales <= 6) {
				break;													//Todo esta parte del programa se utiliza para validar que el numero de
			}															//Clientes sean exactamente lo que nostros buscamos, sin que sean mas o menos 
																		//De los posibles 
			System.err.println("Introduzca un valor valido");
			
		} while (Comensales <= 0 || Comensales > 6);

		//Creamos un Array con la longitud que indicamos al introducir los comensales
		
		int Tabla1[] = new int [Comensales];
		
		System.out.println(Arrays.toString(Tabla1));
		
		System.out.println(" #1 - Solo Carne");
		System.out.println(" #2 - Mixto");
		System.out.println(" #3 - Falafel");
		
		System.out.println();
		
		
		for (int i = 0; i <= Tabla1.length-1; i++) {
			
			System.out.println("Cliente " +(i+1)+ " Seleccione el Menu deseado");
			int Seleccion = sc.nextInt();
			
			Tabla1 [i] = Seleccion;
			
			if (Seleccion >=4) {
				System.err.println("Introduzca un Menu Valido\n");
				
				i--;
			}
			
			
			
			
			
		}
		
		
		int Cambiar = 0;
		
		while (Cambiar == 0) {
			
			for(int j = 0; j<=Tabla1.length-1; j++) {
				
				if (Tabla1[j] ==1) {
					System.out.println("El Cliente " +(j+1)+ " Ha pedido el Solo Carne");
				}
				if (Tabla1[j] ==2) {
					System.out.println("El Cliente " +(j+1)+ " Ha pedido el Mixto");
				}
				if (Tabla1[j] ==3) {
					System.out.println("El Cliente " +(j+1)+ " Ha pedido el Falafel");
				}
				
			}
			
			System.out.println("\nDesea alguien cambiar su pedido? #1 - No | #2 - Si");
			
			int Final = sc.nextInt();
			if (Final == 1) {
				Cambiar = 1;
			}
			
			if (Final == 2) {
				
				System.err.println("Que menu desea cambiar? ");
				int Cambio1 = sc.nextInt();
				System.err.println("Por que Menu desea cambiarlo?");
				int Cambio2 = sc.nextInt();
				
				Tabla1[Cambio1-1] = Cambio2;
			
			}
			
		}
		
		System.out.println("El pedido final queda ->\n ");
		
		for(int j = 0; j<=Tabla1.length-1; j++) {
			
			if (Tabla1[j] ==1) {
				System.out.println("El Cliente " +(j+1)+ " Ha pedido el Solo Carne");
			}
			if (Tabla1[j] ==2) {
				System.out.println("El Cliente " +(j+1)+ " Ha pedido el Mixto");
			}
			if (Tabla1[j] ==3) {
				System.out.println("El Cliente " +(j+1)+ " Ha pedido el Falafel");
			}
		
	}

}
}
