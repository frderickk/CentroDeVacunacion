
public class Vacunas {

	protected Fecha fecha;
	
	public Vacunas(Fecha fechaIngreso) {
		this.fecha = fechaIngreso;
	}
	
	public Fecha getFecha() {
		return fecha;
	}

	@Override
	public String toString() {
		return "la temperatura de almacenaje es: ";
	}	
}
