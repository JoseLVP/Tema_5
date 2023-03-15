package ejercicios;

import java.util.Arrays;

public class Actividad_Resuelta_5_7 {

	public static void main(String[] args) {

		int Tabla1[] = new int [25];
		

		for (int i = 0; i < Tabla1.length; i++) {
			Tabla1[i]=(int)(Math.random()*25+1);
		}
		System.out.println(Arrays.toString(Tabla1));
		
		int Repetidos[] = BuscarRepetidos(Tabla1);
		Arrays.sort(Repetidos);
		System.out.println(Arrays.toString(Repetidos));
		
	}

	static int[] BuscarRepetidos (int[]Tabla1) {
		
		int Temporal[] = new int [0];
		
		for (int Elemento : Tabla1) {
			if (!Buscar(Temporal, Elemento)) {
				Temporal=Arrays.copyOf(Temporal, Temporal.length+1);
				Temporal[Temporal.length-1]=Elemento;
			}
		}
		
		
		
		return Temporal;
		
	}
	
	static boolean Buscar(int[] Temporal, int Elemento) {
		
		boolean Indicador = false;
		
		for (int i=0; i<Temporal.length; i++) {
			if (Temporal[i]==Elemento) {
				Indicador = true;
			}
		}
		
		
		
		return Indicador;
	}
	
}
