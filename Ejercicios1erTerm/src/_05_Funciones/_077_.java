package _05_Funciones;
/*
 * Ej07. Crear una función que imprima la media de tres números (parámetros de entrada) 
Una vez creada la función, llamar a la función 2 veces desde el método "main" con parámetros de entrada diferentes.
 */
public class _077_ {

	public static void main(String[] args) {
		double mediaC=media(10, 41, 23);
		System.out.println("La media de los valores es " +mediaC);
		mediaC=media(12, 45, 74);
		System.out.println("La media de los valores es " +mediaC);
		
	}
	public static double media(double num1,double num2,double num3) {		
		double mediaC= (num1+num2+num3)/3;
		return mediaC;
		
	}

}
