
public class Astra extends Vacunas {

	public Astra(Fecha fechaIngreso) {
		super(fechaIngreso);
	}

	@Override
	public String toString() {
		return "Astra: Fecha de ingreso: " + fecha;
	}

	@Override
	public String getNombre() {
		return "AstraZeneca";
	}


	@Override
	public Fecha getFecha() {
		return null;
	}
	
}
