package _02_OperadoresYConstantes;
/*
 * Ejercicio: Calculo del área de un circulo
 * 
Crea un programa en Java que calcule el área de un circulo. 
PI se debe declarar como constante. Se tiene que investigar la formula del calculo del area.
 */
public class _03_CálculoAreaCirculo_ {
	public static void main(String[] args) {

		final double NUMERO_PI = 3.1416;
		float r= 25.34f;
		
		double area= NUMERO_PI*r*r;
		
		System.out.println(area);
	}
}
