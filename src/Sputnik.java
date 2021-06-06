
public class Sputnik extends Vacunas {

	public Sputnik(Fecha fechaIngreso) {
		super(fechaIngreso);
	}
	
	@Override
	public String getNombre() {
		return "Sputnik";
	}

	@Override
	public String toString() {
		return "Sputnik: Fecha de ingreso: " + fecha;
	}

	@Override
	public Fecha getFecha() {
		return null;
	}

}
