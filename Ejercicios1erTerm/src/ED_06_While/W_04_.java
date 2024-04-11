package ED_06_While;
/*
 * Sumar los primeros 100 números naturales.
 */
public class W_04_ {
	public static void main(String[] args) {
		int suma=0;
		int contador=1;
		while(suma<=100) {
			suma+=contador;
			contador++;
			System.out.println("La suma de los primeros 100 números naturales es: "+suma);
		}
	}
}
