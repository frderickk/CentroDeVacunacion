
public class Astra extends Vacunas {

	public Astra(Fecha fechaIngreso) {
		super(fechaIngreso);
	}

	@Override
	public Fecha getFecha() {
		return super.getFecha();
	}

	@Override
	public String toString() {
		return "Astra: Fecha de ingreso: " + fecha;
	}

	@Override
	public boolean estaVencida() {
		return false;
	}

	@Override
	public String getNombre() {
		return "AstraZeneca";
	}
	
}
