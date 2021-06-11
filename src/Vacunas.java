
public abstract class Vacunas {

	protected Fecha fecha;
	protected String nombre;
	protected boolean vencida;
	protected boolean reservada;
	protected boolean aplicada;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (aplicada ? 1231 : 1237);
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + (reservada ? 1231 : 1237);
		result = prime * result + (vencida ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vacunas other = (Vacunas) obj;
		if (aplicada != other.aplicada)
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (reservada != other.reservada)
			return false;
		if (vencida != other.vencida)
			return false;
		return true;
	}

	public boolean isAplicada() {
		return aplicada;
	}

	public void setAplicada(boolean aplicada) {
		this.aplicada = aplicada;
	}

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
