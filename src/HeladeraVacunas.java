import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HeladeraVacunas {
	
	private int codVac;
	
	private HashMap<String, ArrayList<Vacunas>> vacunas;
	private HashMap<String, ArrayList<Vacunas>> vacunasVencidas;
	
	private HashMap<Integer, Vacunas> vacunas2;
	private HashMap<Integer, Vacunas> vacunasVencidas2;
	
	
	public HeladeraVacunas() {
		
		vacunas = new HashMap<String, ArrayList<Vacunas>>();
		
		vacunas2 = new HashMap<Integer, Vacunas>();
		
		vacunas.put("AstraZeneca", new ArrayList<Vacunas>());
		vacunas.put("Sputnik", new ArrayList<Vacunas>());
		vacunas.put("Sinopharm", new ArrayList<Vacunas>());
		vacunas.put("Moderna", new ArrayList<Vacunas>());
		vacunas.put("Pfizer", new ArrayList<Vacunas>());
		
		vacunasVencidas = new HashMap<String, ArrayList<Vacunas>>();
		
		vacunasVencidas2 = new HashMap<Integer, Vacunas>();
		
		vacunasVencidas.put("AstraZeneca", new ArrayList<Vacunas>());
		vacunasVencidas.put("Sputnik", new ArrayList<Vacunas>());
		vacunasVencidas.put("Sinopharm", new ArrayList<Vacunas>());
		vacunasVencidas.put("Moderna", new ArrayList<Vacunas>());
		vacunasVencidas.put("Pfizer", new ArrayList<Vacunas>());
	}
	
	
	public void vacunaVencida() {	
		for (Integer num : vacunas2.keySet()) {

			if(vacunas2.get(num).getNombre() == "Pfizer" && (Fecha.diferenciaMes(Fecha.hoy(), vacunas2.get(num).getFecha() ) >=1)) {
				vacunas2.get(num).setVencida(true);
			}
			else if(vacunas2.get(num).getNombre() == "Moderna" && (Fecha.diferenciaMes(Fecha.hoy(), vacunas2.get(num).getFecha()) >=2)) {
				vacunas2.get(num).setVencida(true);
			}
			}
		}
		
	public void ingresarVacunas2(String nombre, int cant, Fecha fechaDeEntrada) {
		if(cant < 0) {
		throw new RuntimeException("La cantidad ingresada no puede ser negativa");
	}
		for (int i = 0; i < cant; i++) {
			if (nombre == "AstraZeneca") {
				vacunas2.put(codVac, new Astra(fechaDeEntrada));
				codVac++;
			}
			else if (nombre == "Sputnik") {
				vacunas2.put(codVac, new Sputnik(fechaDeEntrada));
				codVac++;
			}
			else if (nombre == "Sinopharm") {
				vacunas2.put(codVac, new Sino(fechaDeEntrada));
				codVac++;
			}
			else if (nombre == "Moderna") {
				vacunas2.put(codVac,new Moderna(fechaDeEntrada));
				codVac++;
			}
			else if (nombre == "Pfizer") {
				vacunas2.put(codVac,new Pfizer(fechaDeEntrada));
				codVac++;
			}
			else {
				throw new RuntimeException("El nombre de la vacuna ingresada no es correcto");
			}
		}

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
		Iterator<Integer> it =  vacunas2.keySet().iterator();
		while(it.hasNext()) {
			Integer key = (Integer) it.next();
			contVacunasDisponibles ++;
		}
		return contVacunasDisponibles;
	}

	
	public int vacunasDisponibles(String nombre) {
		return vacunas.get(nombre).size();
	}
	
	public void moverVacunas() {
		for (Integer num : vacunas2.keySet()) {
			if(vacunas2.get(num).isVencida()) {
				vacunasVencidas2.put(num,vacunas2.get(num));
			}

			}
		

	}
	
	public void quitarVacunaVencida() {
		Iterator<Map.Entry<Integer,Vacunas>> iterator=vacunas2.entrySet().iterator();
		while (iterator.hasNext()){
		Map.Entry<Integer,Vacunas> entry=iterator.next();
		if(entry.getValue().isVencida()){
		iterator.remove();
		}
		}	
	}

	
	

	@Override
	public String toString() {
		return  "Cantidad de vacunas: " + vacunas2 + "Las vacunas vencidas son " +  vacunasVencidas2;
	}
	
}
