
public abstract class Vacunas {

	protected Fecha fecha;
	protected String nombre;
	protected boolean vencida;
	public Vacunas(Fecha fechaIngreso) {
		this.fecha = fechaIngreso;
		this.vencida = false;
	}

	public boolean isVencida() {
		return vencida;
	}

	public void setVencida(boolean vencida) {
		this.vencida = vencida;
	}

	public Fecha getFecha() {
		return fecha;
	}

	@Override
	public String toString() {
		return "Vacuna: " + getNombre() + fecha + "Estoy vencida?" + vencida;
	}

	abstract public String getNombre();
	
}
