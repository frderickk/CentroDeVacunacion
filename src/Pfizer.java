public class Pfizer extends Vacunas {
	
	private Fecha fechaVencimiento;
	private Fecha fechaAux;

	public Pfizer(Fecha fechaIngreso) {
		super(fechaIngreso);
		fechaAux = new Fecha(fechaIngreso.dia() , fechaIngreso.mes() , fechaIngreso.anio());
		for (int i = 0; i < 30; i++) {
			fechaAux.avanzarUnDia();
		}
		this.fechaVencimiento = fechaAux;
	}
	
	@Override
	public String getNombre() {
		return "Pfizer";
	}
	
	@Override
	public boolean estaVencida() {
		if(Fecha.hoy().compareTo(fechaVencimiento) >= 0) {
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
