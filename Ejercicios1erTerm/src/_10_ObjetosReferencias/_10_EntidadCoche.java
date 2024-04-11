package _10_ObjetosReferencias;

public class _10_EntidadCoche {

	public static void imprimirCoche(Coche c) {
		
			//En esta función con parámetro de entrada Coche (del main) llamado 'c' y lo usamos para imprimir
			//Luego lo invocamoos en el método main paasando entre paréntesis el nombre del objete tantas veces como objetos haiga.
			System.out.println("---------------------------");
			System.out.println("Marca: " +c.marca);
			System.out.println("Modelo: " +c.modelo);
			System.out.println("Matricula: " +c.matricula);
			System.out.println("Peso: " +c.peso);
			System.out.println("Antiguedad: " +c.antiguedad);
			System.out.println("¿Es eléctrico?: " +c.esElectrico);
			
		
	}
	public static void main(String[] args) {
		
		Coche c1=new Coche();
		c1.marca="Michubisi";
		c1.modelo="Lancer";
		c1.matricula="2345 L";
		c1.peso=1546.46;
		c1.antiguedad=4;
		c1.esElectrico=false; //No hace falta pq por defecto es false
		imprimirCoche(c1);
		
		Coche c2=new Coche();
		c2.marca="Tesla";
		c2.modelo="Model3";
		c2.matricula="23564 L";
		c2.peso=1934.76;
		c2.antiguedad=3;
		c2.esElectrico=true; //Aqui si hace falta cambiar el valor
		imprimirCoche(c2);
		
		Coche c3=new Coche();
		c3.marca="Mercedes";
		c3.modelo="Gt4";
		c3.matricula="6545 J";
		c3.peso=1866.96;
		c3.antiguedad=7;
		c3.esElectrico=false; //No hace falta pq por defecto es false
		imprimirCoche(c3);
	}
}
