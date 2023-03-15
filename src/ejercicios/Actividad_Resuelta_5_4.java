package ejercicios;

public class Actividad_Resuelta_5_4 {

	public static void main(String[] args) {

		int max = 0;
		
		int Tabla1[] = {5,69,43,24,51,61,67};
		
		for (int i : Tabla1) {
			
			if (i > max) {
				
				max = i;
				
			}
			
		}
		System.out.println("El numero mayor de la tabla es -> " +max);
		
	}

}
