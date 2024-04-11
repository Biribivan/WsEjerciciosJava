package _12_ConstructoresMetodos_2_.EntidadCoche;

public class Coche {
	public long id;
	public String marca;
	public String modelo;
	public double precioBase;
	public int fechaMatriculacion;
	public double km;
	
	
							
	public Coche(long id, double precioBase, int fechaMatriculacion, double km) {
		super();
		this.id = id;
		this.precioBase = precioBase;
		this.fechaMatriculacion = fechaMatriculacion;
		this.km = km;
	}
	public Coche(long id, String marca, String modelo, double precioBase, int fechaMatriculacion, double km) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.precioBase = precioBase;
		this.fechaMatriculacion = fechaMatriculacion;
		this.km = km;
	}
	
	@Override
	
	public String toString() {
		return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", precioBase=" + precioBase
				+ ", fechaMatriculacion=" + fechaMatriculacion + ", km=" + km + "]";
	}
	
	public void mostrarPrecioBase() {
		System.out.println(precioBase);
	}
	
	public void mostrarFechaMatriculacion() {
		System.out.println(fechaMatriculacion);
	}
	
	public boolean fechaBisiesta() {
		int anio=fechaMatriculacion;//Buscado en Bard
		return anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0);

	}
	
	public double precioKm() {
		if (km<=10000) {
			return precioBase;
		}else if (km>=10001 && km<=50000) {
			return precioBase*0.2;
		}else {
			return precioBase*0.5;
		}	
	}
	
	public boolean kmEsPrimo() {
		if(km%2==0) { return false; }//Se hace esto primero para descartar directamente si es par		
		for(int i= 3; i*i<km;i++) {//Con el i*i, al empezar por 3 ire directamente manejando solo los impares
			if(km%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public int kmFaltan() {
		int contadorKm=0;
		if(km>=200000) {
			System.out.println("Ya se han sobrepasado los 200.000 km");	
		}else {
			for(int i=(int)km;i<=200000;i++) {//Cast dentro del for
				contadorKm++;
			}System.out.println("Los km faltantes para los 200.000 km son:" +contadorKm);	
		}return contadorKm;
	}
	
	public int contCaracteresMarcaModelo() {
		System.out.println(marca.length()); 
		return modelo.length();			 
	}
	
	public double diferenciaKm(Coche coche) {
		double diferencia = 0;
		if(this.km >= coche.km) {
			diferencia = km - coche.km;
			return diferencia;
		}else {
			diferencia= coche.km - km  ;
			return diferencia;
		}	
	}
	
	public double esMasCaro (Coche coche) {
		if (this.precioBase>coche.precioBase) {
			return precioBase;
		}else {
			return coche.precioBase;
		}
	}
}
