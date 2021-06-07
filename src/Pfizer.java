
public class Pfizer extends Vacunas {


	public Pfizer(Fecha fechaIngreso) {
		super(fechaIngreso);
	}

	@Override
	public Fecha getFecha() {
		return super.getFecha();
	}

//	public boolean isVencida() {
//		return vencida;
//	}
//
//	public void setVencida(boolean vencida) {
//		this.vencida = vencida;
//	}

	@Override
	public String getNombre() {
		return "Pfizer";
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
