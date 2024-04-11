package _05_Funciones;
/*
 * Ej04. Crear una función que dados los catetos de un triángulo rectángulo (parámetros de entrada), 
 * calcular su hipotenusa (parámetros de salida).  

Una vez creada la función, llamar a la función 2 veces desde el método "main" con parámetros de entrada diferentes
 */
public class _04_ {

	public static void main(String[] args) {
		double hipotenusa=hipotenusa(10, 25);
		System.out.println("La hi`potenusa es " +hipotenusa);
		hipotenusa=hipotenusa(24,63);
		System.out.println("La hi`potenusa es " +hipotenusa);
		
		hipotenusa=hipotenusa2(24,63);
		System.out.println("La hi`potenusa es " +hipotenusa);
	}
	
	public static double hipotenusa(double cateto1, double cateto2) {
		double cat1Cua=cateto1*cateto1;
		double cat2Cua=cateto2*cateto2;
		double sumaCatetos=cat2Cua+cat1Cua;
		double hipotenusa=  Math.sqrt(sumaCatetos);
		return hipotenusa;
	}
	//TODO CON FUNCIONES
	public static  double hipotenusa2(double cateto1, double cateto2) {
		double cateto1Cuadrado= calcularCuadrado(cateto1);
		double cateto2Cuadrado= calcularCuadrado(cateto2);
		double sumaCatetos=sumar(cateto1Cuadrado, cateto2Cuadrado);
		double hipotenusa= calcularHipotenusa(sumaCatetos);
		return hipotenusa;
	}
	public static double calcularHipotenusa(double sumaCatetos) {		
		return  Math.sqrt(sumaCatetos);
	}
	public static double sumar(double n1, double n2) {		
		return n1 + n2;
	}
	public static double calcularCuadrado(double cateto) {
		return cateto * cateto;
	}

}
