package _02_OperadoresYConstantes;
/*
 * Ejercicio: Cálculo de Interés Simple

Escribe un programa en Java que calcule el interés simple ganado en una inversión. 
Calcula y muestra el interés simple utilizando la fórmula: interes = principal * tasa * tiempo.
 */
public class _04_CalculoInteresSimple_ {

	public static void main(String[] args) {
		double principal= 10;
		double tasa= 0.4;
		double tiempo= 56;
		
		final double interes= principal + tasa * tiempo;
		
		System.out.println(interes);
	}

}
