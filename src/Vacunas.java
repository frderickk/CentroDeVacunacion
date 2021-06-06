
public abstract class Vacunas {

	protected Fecha fecha;
	protected String nombre;
	protected boolean vencida;
	protected boolean reservada;
	
	
	public Vacunas(Fecha fechaIngreso) {
		this.fecha = fechaIngreso;
		this.vencida = false;
		this.reservada = false;
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

	public boolean isReservada() {
		return reservada;
	}

	public void setReservada(boolean reservada) {
		this.reservada = reservada;
	}

	@Override
	public String toString() {
		return "Vacuna: " + getNombre() + fecha + "Estoy vencida?" + vencida;
	}

	abstract public String getNombre();
	
}
