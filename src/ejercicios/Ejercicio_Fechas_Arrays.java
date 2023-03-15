package ejercicios;

import java.util.Scanner;

public class Ejercicio_Fechas_Arrays {

	public static void main(String[] args) {
		
		
		System.out.println("Introduce el Dia de tu Nacimiento ");
		Scanner sc = new Scanner(System.in);
		int Dia = sc.nextInt();
		
		System.out.println("Introduce el Mes de tu Nacimiento");
		int Mes = sc.nextInt();
		
		String Tabla1[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		System.out.println("Indica el Año que Naciste");
		int Año = sc.nextInt();
		
		System.out.println("Tu fecha de Nacimiento es -> " +Dia+ " de " +Tabla1[Mes-1]+ " del año " +Año);
		
		
	}

}
