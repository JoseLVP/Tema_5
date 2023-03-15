package ejemplos;

public class Ejemplo_Arrays {

	public static void main(String[] args) {
		
		double datos[] = new double [10];
		System.out.println(datos);
		double datos2[] = datos;
		System.err.println(datos2);
		
		datos[2]= 5.5;
		System.out.println(datos[2]+"-"+datos2[2]);
		datos2[2]=6.5;
		System.err.println(datos[2]+"-"+datos2[2]);
		
		/*Ambos arrays hacen referencia al mismo espacio de memoria, por lo que al modificar uno, se modifican los 2, sin importar donde
		donde lo modifiquemos */
		
	}

}
