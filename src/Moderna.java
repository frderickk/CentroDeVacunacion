public class Moderna extends Vacunas {
	
	private Fecha fechaVencimiento;
	private Fecha aux;
	
	public Moderna(Fecha fechaIngreso) {
		super(fechaIngreso);
		aux =new Fecha(fechaIngreso.dia() , fechaIngreso.mes() , fechaIngreso.anio());
		for (int i = 0; i < 60; i++) {
			aux.avanzarUnDia();
		}
		this.fechaVencimiento = aux;
	}
	
	@Override
	public String getNombre() {
		return "Moderna";
	}

	@Override
	public Fecha getFecha() {
		return super.getFecha();
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
	public String toString() {
		return super.toString();
	}
}
