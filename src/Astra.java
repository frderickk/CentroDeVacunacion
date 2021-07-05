
public class Astra extends Vacunas {

	public Astra(Fecha fechaIngreso) {
		super(fechaIngreso);
	}

	@Override
	public String getNombre() {
		return "AstraZeneca";
	}

	@Override
	public Fecha getFecha() {
		return null;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean estaVencida() {
		return false;
	}
}
