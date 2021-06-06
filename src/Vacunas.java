
public abstract class Vacunas {

	protected Fecha fecha;
	protected String nombre;
	
	public Vacunas(Fecha fechaIngreso) {
		this.fecha = fechaIngreso;
	}

	public Fecha getFecha() {
		return fecha;
	}

	@Override
	public String toString() {
		return "Vacuna: ";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		return true;
	}

	abstract public boolean estaVencida();
	
	abstract public String getNombre();
	
	
	
}
