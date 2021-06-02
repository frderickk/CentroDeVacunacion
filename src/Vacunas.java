
public class Vacunas {

	protected int temperatura;
	protected String nombre;
	protected Fecha fecha;
	
	public Vacunas(int temp, String nombre, Fecha fechaIngreso) {
		this.temperatura = temp;
		this.nombre = nombre;
		this.fecha = fechaIngreso;
	}
	

	@Override
	public String toString() {
		return nombre + "la temperatura de almacenaje es: " + temperatura;
	}	
}
