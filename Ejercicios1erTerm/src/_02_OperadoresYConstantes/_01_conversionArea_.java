package _02_OperadoresYConstantes;
/*
 * Ejercicio: Calculadora de Área y Perímetro
 * 
Crea un programa en Java que calcule el área y el perímetro de un rectángulo. 
Instrucciones:
Declara dos variables para la longitud y el ancho del rectángulo. Calcula el área del rectángulo utilizando la fórmula: área = longitud * ancho.
Calcula el perímetro del rectángulo utilizando la fórmula: perímetro = 2 * (longitud + ancho).
Muestra los resultados (área y perímetro) en la consola de salida.
Se deben cambiar las variables LONGITUD y ANCHO para calcular el área y el perímetro de diferentes rectángulos. 
 */
public class _01_conversionArea_ {

	public static void main(String[] args) {
		int longitud = 20;
		int ancho=8;
		
		int area= longitud * ancho;
		System.out.println(area);
		
		int P= 2*(area);
		System.out.println(P);
		
		
		longitud = 34;
		ancho= 21;
		area= longitud * ancho;
		P= 2*(area);
		System.out.println(area);
		System.out.println(P);
		

	}

}
