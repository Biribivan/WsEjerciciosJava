package matematicas;
/**
 * Esta Clase que contiene los Métodos sumar, restar, multiplicar y dividir
 * permite realizar las operaciones básicas pasando por parametro dos valores de tipo Double
 * 
 */
public class ClaseMatematicas {
	
	public static double sumar(double n1,double n2) {
		double suma = n1 + n2;
		return suma ;		
	}
	
	public static double restar(double n1,double n2) {
		double resta = n1 - n2;
		return resta;
		
	}
			
	
	public static double multi(double n1,double n2) {
		double multi = n1 * n2;
		return multi;
		
	}
	public static double dividir(double n1,double n2) {
		double div = n1 / n2;
		return div;
		
	}
}
