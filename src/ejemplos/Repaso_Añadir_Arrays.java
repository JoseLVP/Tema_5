package ejemplos;

import java.util.Arrays;
import java.util.Scanner;


public class Repaso_Añadir_Arrays {

	public static void main(String[] args) {

		// Insertar en Arrays no ordenados

		int miArrays[] = { 1, 84, 95, 32, 45, 9, 85, 41, 49, 46, 7 }; //Creo mi Array

		System.out.println("Nuevo Array -> " +Arrays.toString(miArrays)); //Lo muestro en pantalla
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Indique el valor de extender la tabla -> "); //Solicito un nuevo valor para introducirlo en el Array
		int NuevoValor = sc.nextInt();
		
		
		miArrays = Arrays.copyOf(miArrays, miArrays.length+NuevoValor); //Copiamos el valor de la tabla con la longitud nueva
		
		for (int i = miArrays.length-NuevoValor; i<=(miArrays.length-1); i++) {
			
			System.out.print("Introduce el valor del hueco " +(i)+ " de la Tabla ->"); //Introducimos los valores mediante el for
			int IntroducirValor = sc.nextInt();
			
			miArrays[i] = IntroducirValor;
			
		}
		
		System.out.println("Los valores de la Tabla al final son -> " +Arrays.toString(miArrays));
		
		sc.close();
		
		//Yo mecanografia nose mucho, pero almenos te se escribir sin problema sin mirar siquiera 
		
	}

}
