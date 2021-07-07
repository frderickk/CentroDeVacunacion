public class Moderna extends Vacunas {
	
	private Fecha fechaVencimiento;
	private Fecha fechaAux;
	
	public Moderna(Fecha fechaIngreso) {
		super(fechaIngreso);
		fechaAux = new Fecha(fechaIngreso.dia() , fechaIngreso.mes() , fechaIngreso.anio());
		for (int i = 0; i < 60; i++) {
			fechaAux.avanzarUnDia();
		}
		this.fechaVencimiento = fechaAux;
	}
	
	@Override
	public String getNombre() {
		return "Moderna";
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
