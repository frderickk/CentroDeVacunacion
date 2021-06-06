
public class Pfizer extends Vacunas {

	private Fecha contVencida;
	private Fecha fechaVencimiento;

	public Pfizer(Fecha fechaIngreso) {
		super(fechaIngreso);
		contVencida = new Fecha(fechaIngreso.dia(), fechaIngreso.mes(), fechaIngreso.anio());
		for (int i = 0; i < 30; i++) {
			contVencida.avanzarUnDia();
		}
		this.fechaVencimiento = contVencida;
	}

	@Override
	public Fecha getFecha() {
		return super.getFecha();
	}
	
	@Override
	public boolean estaVencida() {
		if (Fecha.hoy().compareTo(fechaVencimiento) >= 0) {
			return true;
		} else {
			return false;
		}
	}
	

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return "Pfizer";
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
		Pfizer other = (Pfizer) obj;
		if (fechaVencimiento == null) {
			if (other.fechaVencimiento != null)
				return false;
		} else if (!fechaVencimiento.equals(other.fechaVencimiento))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
