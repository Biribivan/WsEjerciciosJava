package _06_Funciones2;
/*
 * Crea una clase llamada "FiguraGeometrica" que tenga varios métodos 
 * sobrecargados para calcular el área de diferentes figuras
 *  geométricas, como un cuadrado, un círculo y un triángulo. 
 *  Cada método de cálculo debe tomar los parámetros necesarios 
 *  para calcular el área de la figura correspondiente. 
 *  Una vez creadas las funciones se invocarán desde el método 'main'.
 */
public class _02_FiguraGeometrica {

	public static void main(String[] args) {
		figuras(5.0,6.6,4.2, 9.6,8.4);
		figuras(7,6,9,12,11);

	}
	public static double figuras(double lado1, double lado2, double radio, double base, double altura) {
		double cuadrado= lado1*lado2;
		double circulo= Math.PI*radio*radio;
		double triangulo= (base*altura)/2;
		System.out.println("---------Cuadrado------------");
		System.out.println("El area del cuadrado es " +cuadrado);
		System.out.println("------------------------------");
		
		System.out.println("---------Circulo------------");
		System.out.println("El área del circulo es " +circulo);
		System.out.println("------------------------------");
		
		System.out.println("---------Triángulo------------");
		System.out.println("El área del triángulo es " +triangulo);
		System.out.println("------------------------------");
		return 0;
	}
	
	public static int figuras(int lado1, int lado2, int radio, int base, int altura) {
		double cuadrado= lado1*lado2;
		double circulo= Math.PI*radio*radio;
		double triangulo= (base*altura)/2;
		System.out.println("---------Cuadrado------------");
		System.out.println("El area del cuadrado es " +cuadrado);
		System.out.println("------------------------------");
		
		System.out.println("---------Circulo------------");
		System.out.println("El área del circulo es " +circulo);
		System.out.println("------------------------------");
		
		System.out.println("---------Triángulo------------");
		System.out.println("El área del triángulo es " +triangulo);
		System.out.println("------------------------------");
		return 0;
	}

}
