import java.util.ArrayList;
import java.util.List;

public class Director extends Empleado{
	List<Empleado> listaACargo = new ArrayList<Empleado>();
	
	public double salarioTotalDirector () {
		//El salario total de los directores será su sueldo 
		//base más 100 euros por cada empleado que este a su cargo
		int incentivoEmpleadosACargo = listaACargo.size();
		double salarioTotal = getSueldoBase() + (incentivoEmpleadosACargo *100);
		return salarioTotal;
	}

	@Override
	public String toString() {
		return "Director [listaACargo=" + listaACargo + ", toString()=" + super.toString() + ", getId()=" + getId()
				+ ", getDni()=" + getDni() + ", getNombre()=" + getNombre() + ", getSueldoBase()=" + getSueldoBase()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
