import java.util.ArrayList;
import java.util.HashMap;

public class HeladeraVacunas {
	
	private HashMap<String, ArrayList<Vacunas>> vacunas;
	private int vacunasDisponibles;
	
	public HeladeraVacunas() {
		
		this.vacunasDisponibles = 0;
		
		vacunas = new HashMap<String, ArrayList<Vacunas>>();
		vacunas.put("AstraZeneca", new ArrayList<Vacunas>());
		vacunas.put("Sputnik", new ArrayList<Vacunas>());
		vacunas.put("Sinopharm", new ArrayList<Vacunas>());
		vacunas.put("Moderna", new ArrayList<Vacunas>());
		vacunas.put("Pfizer", new ArrayList<Vacunas>());		
	}
	
	public void vacunasNuevas(String nombre, int cant, Fecha fechaDeEntrada) {
		if (cant < 0) {
			throw new RuntimeException("La cantidad ingresada no puede ser negativa");
		}
		for (int i = 0; i < cant; i++) {
			if (nombre == "AstraZeneca") {
				vacunas.get(nombre).add(new Astra(fechaDeEntrada));
			}
			else if (nombre == "Sputnik")
				vacunas.get(nombre).add(new Sputnik(fechaDeEntrada));
			else if (nombre == "Sinopharm")
				vacunas.get(nombre).add(new Sino(fechaDeEntrada));
			else if (nombre == "Moderna")
				vacunas.get(nombre).add(new Moderna(fechaDeEntrada));
			else if (nombre == "Pfizer")
				vacunas.get(nombre).add(new Pfizer(fechaDeEntrada));
			else
				throw new RuntimeException("El nombre de la vacuna ingresada no es correcto");
		}
		
	}
	
	public int vacunasDisponibles() {
		this.vacunasDisponibles = 0;
		vacunas.forEach((key, value)-> {
			for(Vacunas vacuna: value) {
				this.vacunasDisponibles ++;
			}
		});
		return vacunasDisponibles;
	}

	@Override
	public String toString() {
		return  "Cantidad de vacunas: " + vacunasDisponibles;
	}
	
}
