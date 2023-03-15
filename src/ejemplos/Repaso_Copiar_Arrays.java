package ejemplos;

import java.util.Arrays;
import java.util.Scanner;


public class Repaso_Copiar_Arrays {

	public static void main(String[] args) {

		// Insertar en Arrays no ordenados

		int miArrays[] = { 1, 84, 95, 32, 45, 9, 85, 41, 49, 46, 7 }; //Creo mi Array

		System.out.println("Nuevo Array -> " +Arrays.toString(miArrays)); //Lo muestro en pantalla
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Indique el valor a Insertar -> "); //Solicito un nuevo valor para introducirlo en el Array
		int NuevoValor = sc.nextInt();
		
		miArrays = Arrays.copyOf(miArrays, miArrays.length+1); //Copio el mismo Array sobre si mismo pero le añado +1 a la longitud
		
		miArrays[miArrays.length-1]=NuevoValor; //Introduzco el valor introducido en el hueco vacio nuevo de la tabla
		
		System.out.println("Nuevo Array -> " +Arrays.toString(miArrays)); //Imprimo de nuevo la tabla con el valor nuevo introducido
		
		sc.close();
		
	}

}
