package ED_05_BucleFor;
/*
 * Calcular la suma de los números pares del 1 al 50.
 */
public class _07_ {
	public static void main(String[] args) {
		int suma=0;
		for(int i=0;i<=50; i += 2) {
			suma +=i;					
		}
		System.out.println("La suma de los numero spares hasta el numero 50 es de: "+ suma);
	}
}
