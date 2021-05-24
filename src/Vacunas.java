
public class Vacunas {

	protected int temperatura, cantidad;
	
	public Vacunas(int cantidad) {
		this.cantidad = cantidad;
	}
	
	void agregarVacuna() {
		cantidad++;
	}
	
	void vacunaAplicada() {
		cantidad--;
	}
	
	int stock() {
		return cantidad;
	}

	@Override
	public String toString() {
		return "Vacunas "+ cantidad;
	}
	
	
}
