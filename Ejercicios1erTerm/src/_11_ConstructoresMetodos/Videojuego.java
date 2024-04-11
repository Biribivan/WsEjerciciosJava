package _11_ConstructoresMetodos;

public class Videojuego {

	String id;
	String nombre;
	int puntuacion;
	double precio;
	String fechaCreacion;
	boolean esDeSegundaMano;
	
	
	public Videojuego () {
		this.fechaCreacion = "01/01/1970";
	}
	
	public Videojuego (String id, String nombre, int puntuacion, double precio, String fechaCreacion, boolean esDeSegundaMano) {
		this.id=id;
		this.nombre=nombre;
		this.puntuacion=puntuacion;
		this.precio=precio;
		this.fechaCreacion=fechaCreacion;
		this.esDeSegundaMano=esDeSegundaMano;
	}
	
	public Videojuego (String nombre, String fechaCreacion) {
		this.nombre=nombre;
		this.fechaCreacion=fechaCreacion;
	}
	
	public void mostrarDatos() {
		System.out.println(this);
	}
	
	public void mostrarNombrePuntuacion () {
		System.out.println("Nombre: " +nombre +", Puntuación: " +puntuacion);
	}
	
	public double precioEnLibras () {
		return precio *0.86;
	}
	
	public double descuentoSegundaMano() {
		if(esDeSegundaMano) {
			return precio * 0.7;
		}else
		return precio;
	}
	
	public boolean esApto() {
		if(puntuacion>=5) {
			return true;
		}else {
			return false;
		}
	}
	
	public int mostrarNumerosNaturales() {
		for(int i =  puntuacion;i ==10; i++) {
			System.out.println(i);
		}
		return puntuacion;
	}
	
	public boolean esMasCaro (Videojuego v){
		return false;
	}
	
	public void cambiarFormatoFecha() {
		String fechaDefecto= "01/01/1970";
		String []fechaDividida =fechaDefecto.split("/");
		String nuevaFecha = fechaDividida[2] +"-" + fechaDividida[1] + "-" +fechaDividida[0];
		System.out.println(nuevaFecha);
	}	
}

