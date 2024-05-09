
public class Empleado {
	private String id;
	private String dni;
	private String nombre;
	private double sueldoBase;
	
//	List <Empleado> listaEmpleado
	
	public Empleado() {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
	}
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", sueldoBase=" + sueldoBase + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
}
