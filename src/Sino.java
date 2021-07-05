
public class Sino extends Vacunas {

	public Sino(Fecha fechaIngreso) {
		super(fechaIngreso);
	}
	
	@Override
	public String getNombre() {
		return "Sinopharm";
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
