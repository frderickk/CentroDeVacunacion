import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HeladeraVacunas {
	
	private int codVac;
	
	private HashMap<Integer, Vacunas> vacunas2;
	
	private HashMap<String, Integer> vacunasVencidas3;
	
	
	public HeladeraVacunas() {
		
		vacunas2 = new HashMap<Integer, Vacunas>();
		
		vacunasVencidas3 = new HashMap<String, Integer>();
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
		if(cant <= 0) {
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
	
	public String vacunaDisponible(int edad) {
		int cont = 0;
		String vacuna = "";
		if(vacunasDisponibles("Pfizer") > 0 && cont < 1 && edad > 60) {
			vacuna = "Pfizer";
			cont++;
			asignarVacuna("Pfizer");
		}
		else if(vacunasDisponibles("Sputnik") > 0 && cont < 1 && edad > 60) {
			vacuna = "Sputnik";
			cont++;
			asignarVacuna("Sputnik");
		}
		else if(vacunasDisponibles("Moderna") > 0 && cont < 1) {
			vacuna = "Moderna";
			cont++;
			asignarVacuna("Moderna");
		}
		
		else if(vacunasDisponibles("AstraZeneca") > 0 && cont < 1) {
			vacuna = "AstraZeneca";
			cont++;
			asignarVacuna("AstraZeneca");
		}
		else if(vacunasDisponibles("Sinopharm") > 0 && cont < 1) {
			vacuna = "Sinopharm";
			cont++;
			asignarVacuna("Sinopharm");
		}
		return vacuna;		
	}
	
//	public int vacunasDisponibles() {		
//		int contVacunasDisponibles = 0;
//		Iterator<Integer> it =  vacunas2.keySet().iterator();
//		while(it.hasNext()) {
//			Integer key = (Integer) it.next();
//		if(vacunas2.containsKey(key) && vacunas2.containsValue(value))
//			contVacunasDisponibles ++;
//		}
//		return contVacunasDisponibles;
//	}
	
	public int vacunasDisponibles(String nombre) {
		int contVacunasDisponibles = 0;
		for (Integer num : vacunas2.keySet()) {
		if (vacunas2.get(num).getNombre() == nombre)
			contVacunasDisponibles ++;		
		}
		return contVacunasDisponibles;
	}
	
	public int vacunasDisponibles() {
		int contVacunasDisponibles = 0;
		for (Integer num : vacunas2.keySet()) {
		if (vacunas2.get(num).isReservada() == false)
			contVacunasDisponibles ++;		
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
	
	public void asignarVacuna(String nombre) {
		int cont = 0;
		for (Integer num : vacunas2.keySet()) {
			if (vacunas2.get(num).getNombre() == nombre && vacunas2.get(num).isReservada() == false && cont < 1) {
				vacunas2.get(num).setReservada(true);
				cont++;
			}
			}
	}
	
	public void desasignarVacuna(String nombre) {
		int cont = 0;
		for (Integer num : vacunas2.keySet()) {
			if(vacunas2.get(num).getNombre() == nombre && vacunas2.get(num).reservada && cont<1) {
				vacunas2.get(num).setReservada(false);
				cont++;
			}
		}
	}
	
	public void moverVacunas2() {
		Integer cont = 0;
		for (Integer num : vacunas2.keySet()) {
			if(vacunas2.get(num).isVencida() && vacunas2.get(num).getNombre() == "Pfizer") {
				cont ++;
				vacunasVencidas3.put("Pfizer",cont);
			}
			}
	}
	
	Map<String, Integer> reporteVacunasVencidas() {
		return vacunasVencidas3;
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
		return  "Cantidad de vacunas: " + vacunas2 + "Las vacunas vencidas son " +  vacunasVencidas3;
	}
}
