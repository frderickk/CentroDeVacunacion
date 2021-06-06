import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HeladeraVacunas {
	
	private HashMap<String, ArrayList<Vacunas>> vacunas;
	private HashMap<String, ArrayList<Vacunas>> vacunasVencidas;
	
	public HeladeraVacunas() {
		
		vacunas = new HashMap<String, ArrayList<Vacunas>>();
		vacunas.put("AstraZeneca", new ArrayList<Vacunas>());
		vacunas.put("Sputnik", new ArrayList<Vacunas>());
		vacunas.put("Sinopharm", new ArrayList<Vacunas>());
		vacunas.put("Moderna", new ArrayList<Vacunas>());
		vacunas.put("Pfizer", new ArrayList<Vacunas>());
		
		vacunasVencidas = new HashMap<String, ArrayList<Vacunas>>();
		vacunasVencidas.put("AstraZeneca", new ArrayList<Vacunas>());
		vacunasVencidas.put("Sputnik", new ArrayList<Vacunas>());
		vacunasVencidas.put("Sinopharm", new ArrayList<Vacunas>());
		vacunasVencidas.put("Moderna", new ArrayList<Vacunas>());
		vacunasVencidas.put("Pfizer", new ArrayList<Vacunas>());
	}
	
	public void ingresarVacunas(String nombre, int cant, Fecha fechaDeEntrada) {
		if (cant <= 0) {
			throw new RuntimeException("La cantidad ingresada no puede ser negativa");
		}
		for (int i = 0; i < cant; i++) {
			if (nombre == "AstraZeneca") {
				vacunas.get(nombre).add(new Astra(fechaDeEntrada));
			}
			else if (nombre == "Sputnik") {
				vacunas.get(nombre).add(new Sputnik(fechaDeEntrada));
			}
			else if (nombre == "Sinopharm") {
				vacunas.get(nombre).add(new Sino(fechaDeEntrada));
			}
			else if (nombre == "Moderna") {
				vacunas.get(nombre).add(new Moderna(fechaDeEntrada));
			}
			else if (nombre == "Pfizer") {
				vacunas.get(nombre).add(new Pfizer(fechaDeEntrada));
			}
			else {
				throw new RuntimeException("El nombre de la vacuna ingresada no es correcto");
			}
		}
	}
	
	
	public int vacunasDisponibles() {
		int contVacunasDisponibles = 0;
		for (String nombre : vacunas.keySet()) {
			contVacunasDisponibles += vacunas.get(nombre).size();
		}
		return contVacunasDisponibles;
	}
	
	public int vacunasDisponibles(String nombre) {
		return vacunas.get(nombre).size();
	}
	
	public void moverVacunas() {
		for (String nombreVacuna : vacunas.keySet()) {
		ArrayList<Vacunas> lista = vacunas.get(nombreVacuna);
		Iterator<Vacunas> it = lista.iterator();
			while (it.hasNext()) {
				if(it.next().estaVencida()) {
					it.remove();
					vacunasVencidas.put(nombreVacuna, vacunasVencidas.get(nombreVacuna));
				}
			}
		}
	}
	

	@Override
	public String toString() {
		return  "Cantidad de vacunas: ";
	}
	
}
