
public class Moderna extends Vacunas {
	
	private Fecha contVencida;
	private Fecha fechaVencimiento;

	public Moderna(Fecha fechaIngreso) {
		super(fechaIngreso);
		contVencida =new Fecha(fechaIngreso.dia() , fechaIngreso.mes() , fechaIngreso.anio());
		for (int i = 0; i < 60; i++) {
			contVencida.avanzarUnDia();
		}
		this.fechaVencimiento = contVencida;
	}

	@Override
	public Fecha getFecha() {
		return super.getFecha();
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean estaVencida() {
		if(Fecha.hoy().compareTo(fechaVencimiento) >=0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String getNombre() {
		return "Moderna";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((fechaVencimiento == null) ? 0 : fechaVencimiento.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moderna other = (Moderna) obj;
		if (fechaVencimiento == null) {
			if (other.fechaVencimiento != null)
				return false;
		} else if (!fechaVencimiento.equals(other.fechaVencimiento))
			return false;
		return true;
	}
	
}
