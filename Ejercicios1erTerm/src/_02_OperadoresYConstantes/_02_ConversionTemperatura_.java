package _02_OperadoresYConstantes;
/*
 * Ejercicio: Conversión de Temperatura
 * 
Crea un programa en Java que convierta una temperatura en grados Fahrenheit
 a grados Celsius. Utiliza la fórmula: celsius = (fahrenheit - 32) * 5 / 9.
 */
public class _02_ConversionTemperatura_ {

	public static void main(String[] args) {
		float celsius = 10f;
		final float fahrenheit= 5/9;
		double temperatura=celsius = (fahrenheit - 32) * 5 / 9;
		System.out.println( "La temperatura es de " +temperatura +"ºC");

	}

}
