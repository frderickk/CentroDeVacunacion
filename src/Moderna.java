
public class Moderna extends Vacunas {
	

	public Moderna(Fecha fechaIngreso) {
		super(fechaIngreso);
	}

	@Override
	public Fecha getFecha() {
		return super.getFecha();
	}
	
	@Override
	public String getNombre() {
		return "Moderna";
	}

	public boolean isVencida() {
		return vencida;
	}

	public void setVencida(boolean vencida) {
		this.vencida = vencida;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
