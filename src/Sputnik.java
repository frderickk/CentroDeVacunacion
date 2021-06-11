
public class Sputnik extends Vacunas {

	public Sputnik(Fecha fechaIngreso) {
		super(fechaIngreso);
	}
	
	@Override
	public String getNombre() {
		return "Sputnik";
	}
	
	@Override
	public Fecha getFecha() {
		return null;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}