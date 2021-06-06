import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HeladeraVacunas {
	
	private int codVac;
	
	private HashMap<Integer, Vacunas> vacunas;
	
	private HashMap<String, Integer> vacunasVencidas;
	
	
	public HeladeraVacunas() {
		
		vacunas = new HashMap<Integer, Vacunas>();
		vacunasVencidas = new HashMap<String, Integer>();
	}
	
	
	public void vacunaVencida() {	
		for (Integer num : vacunas.keySet()) {
			if(vacunas.get(num).getNombre() == "Pfizer" && (Fecha.diferenciaMes(Fecha.hoy(), vacunas.get(num).getFecha() ) >= 1)) {
				vacunas.get(num).setVencida(true);
			}
			else if(vacunas.get(num).getNombre() == "Moderna" && (Fecha.diferenciaMes(Fecha.hoy(), vacunas.get(num).getFecha()) >= 2)) {
				vacunas.get(num).setVencida(true);
			}
		}
	}
		
	
	public void ingresarVacunas(String nombre, int cant, Fecha fechaDeEntrada) {
		if(cant <= 0) {
		throw new RuntimeException("La cantidad ingresada no puede ser negativa");
	}
		for (int i = 0; i < cant; i++) {
			if (nombre == "AstraZeneca") {
				vacunas.put(codVac, new Astra(fechaDeEntrada));
				codVac++;
			}
			else if (nombre == "Sputnik") {
				vacunas.put(codVac, new Sputnik(fechaDeEntrada));
				codVac++;
			}
			else if (nombre == "Sinopharm") {
				vacunas.put(codVac, new Sino(fechaDeEntrada));
				codVac++;
			}
			else if (nombre == "Moderna") {
				vacunas.put(codVac,new Moderna(fechaDeEntrada));
				codVac++;
			}
			else if (nombre == "Pfizer") {
				vacunas.put(codVac,new Pfizer(fechaDeEntrada));
				codVac++;
			}
			else {
				throw new RuntimeException("El nombre de la vacuna ingresada no es correcto");
			}
		}
	}
	
	
	public int vacunasDisponibles() {
		int contVacunasDisponibles = 0;
		Iterator<Integer> it =  vacunas.keySet().iterator();
		while(it.hasNext()) {
			Integer key = (Integer) it.next();
			contVacunasDisponibles ++;
		}
		return contVacunasDisponibles;
	}
	
	
	public int vacunasDisponibles(String nombre) {
		int contVacunasDisponibles = 0;
		for (Integer num : vacunas.keySet()) {
			if (vacunas.get(num).getNombre() == nombre) {
			contVacunasDisponibles ++;	
			}
		}
		return contVacunasDisponibles;
	}
	
//	public void moverVacunas() {
//		for (Integer num : vacunas2.keySet()) {
//			if(vacunas2.get(num).isVencida()) {
//				vacunasVencidas2.put(num,vacunas2.get(num));
//			}
//			}
//	}
	
	public void moverVacunas() {
		Integer cont = 0;
		for (Integer num : vacunas.keySet()) {
			if(vacunas.get(num).isVencida() && vacunas.get(num).getNombre() == "Pfizer") {
				cont ++;
				vacunasVencidas.put("Pfizer",cont);
			}
		}
	}
	
	Map<String, Integer> reporteVacunasVencidas() {
		return vacunasVencidas;
	}
	
	public void quitarVacunaVencida() {
		Iterator<Map.Entry<Integer,Vacunas>> iterator=vacunas.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer,Vacunas> entry=iterator.next();
			if(entry.getValue().isVencida()){
				iterator.remove();
			}
		}	
	}

	@Override
	public String toString() {
		return  "Cantidad de vacunas: " + vacunas + "Las vacunas vencidas son " +  vacunasVencidas;
	}
}
