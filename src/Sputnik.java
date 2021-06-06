
public class Sputnik extends Vacunas {

	public Sputnik(Fecha fechaIngreso) {
		super(fechaIngreso);
	}
	
	@Override
	public Fecha getFecha() {
		return super.getFecha();
	}

	@Override
	public String toString() {
		return "Sputnik: Fecha de ingreso: " + fecha;
	}

	@Override
	public boolean estaVencida() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return "Sputnik";
	}

}
