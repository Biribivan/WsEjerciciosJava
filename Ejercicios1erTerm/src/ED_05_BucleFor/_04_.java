package ED_05_BucleFor;
/*
 * Ejercicio 4:Sumar los primeros 100 números naturales.
 */
public class _04_ {
	public static void main(String[] args) {
		int suma=0;
		for( int i=1; i <=100; i++) {
			suma+=i;	
		}
		System.out.println("La suma de los primeros 100 numeros naturales es: " +suma);
	}
}
