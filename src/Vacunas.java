
public class Vacunas {

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
}
