import java.util.Objects;

public class JefeProyecto extends Empleado{
	private double primaEconomica;

	@Override
	public String toString() {
		return "JefeProyecto [primaEconomica=" + primaEconomica + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(primaEconomica);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JefeProyecto other = (JefeProyecto) obj;
		return Double.doubleToLongBits(primaEconomica) == Double.doubleToLongBits(other.primaEconomica);
	}

	public double getPrimaEconomica() {
		return primaEconomica;
	}

	public void setPrimaEconomica(double primaEconomica) {
		double salarioTotal = getSueldoBase() + getPrimaEconomica();
		this.primaEconomica = primaEconomica;
	}


	
	
}
