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
	
	//Determina si una vacuna está vencida
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
	
	//Se ingresan vacunas
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

	//Asigna vacunas según disponnibilidad en base a la edad pasada
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
	
	//Devuelve las vacunas disponibles por nombre
	public int vacunasDisponibles(String nombre) {
		int contVacunasDisponibles = 0;
		for (Integer num : vacunas.keySet()) {
			if (vacunas.get(num).getNombre() == nombre && vacunas.get(num).isReservada() == false) {
			contVacunasDisponibles ++;	
			}
		}
		return contVacunasDisponibles;
	}
	
	//Devuelve todas las vacunas disponibles
	public int vacunasDisponibles1() {
		int contVacunasDisponibles = 0;
		for (Integer num : vacunas.keySet()) {
		if (vacunas.get(num).isReservada() == false)
			contVacunasDisponibles ++;		
		}
		return contVacunasDisponibles;
	}
	
    //Setea la vacuna como asignada (reservada)
	public void asignarVacuna(String nombre) {
		int cont = 0;
		for (Integer num : vacunas.keySet()) {
			if (vacunas.get(num).getNombre() == nombre && vacunas.get(num).isReservada() == false && cont < 1) {
				vacunas.get(num).setReservada(true);
				cont++;
			}
			}
	}
	
	//Aplica la vacuna según el nombre de vacuna pasado
	public void aplicarVacuna(String nombre) {
		int cont = 0;
		for (Integer num : vacunas.keySet()) {
			if (vacunas.get(num).getNombre() == nombre && vacunas.get(num).isReservada() == true && vacunas.get(num).isAplicada() == false && cont < 1) {
				vacunas.get(num).setAplicada(true);
				cont++;
			}
			}
	}
	
	//Desasigna vacunas según el nombre dado
	public void desasignarVacuna(String nombre) {
		int cont = 0;
		for (Integer num : vacunas.keySet()) {
			if(vacunas.get(num).getNombre() == nombre && vacunas.get(num).isReservada() && cont<1) {
				vacunas.get(num).setReservada(false);
				vacunas.get(num).setAplicada(false);
				cont++;
			}
		}
	}
	
	//Mueve vacunas vencidas
	public void moverVacunas() {
		Integer cont = 0;
		for (Integer num : vacunas.keySet()) {
			if(vacunas.get(num).isVencida() && vacunas.get(num).getNombre() == "Pfizer") {
				cont ++;
				vacunasVencidas.put("Pfizer",cont);
			}
			else if(vacunas.get(num).isVencida() && vacunas.get(num).getNombre() == "Moderna") {
				cont ++;
				vacunasVencidas.put("Moderna",cont);
			}
		}
	}
	
	
	//Brinda un reporte de las vacunas vencidas
	Map<String, Integer> reporteVacunasVencidas() {
		return vacunasVencidas;
	}
	
	//Quita las cavunas vencidas
	public void quitarVacunaVencida() {
		Iterator<Map.Entry<Integer,Vacunas>> iterator=vacunas.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer,Vacunas> entry=iterator.next();
			if(entry.getValue().isVencida()){
				iterator.remove();
			}
		}	
	}
	
	//Quita la vacuna por el nombre pasado
	
	public void quitarVacuna(String nombre) {
		Integer cont = 0;
		Iterator<Map.Entry<Integer,Vacunas>> iterator=vacunas.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer,Vacunas> entry=iterator.next();
			if(entry.getValue().isAplicada() && cont<1 && entry.getValue().getNombre().equals(nombre)){
				cont++;
				iterator.remove();
			}
		}	
	}

	@Override
	public String toString() {
		return  "Cantidad de vacunas: " + vacunas + "Las vacunas vencidas son " +  vacunasVencidas;
	}
}
