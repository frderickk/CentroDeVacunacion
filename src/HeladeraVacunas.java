import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HeladeraVacunas {
	
	private int codVac;
	private HashMap<Integer, Vacunas> vacunas;
	private HashMap<String, Integer> vacunasVencidas;
	
	
	/**
	* Constructor de heladera
	*/
	public HeladeraVacunas() {
		vacunas = new HashMap<Integer, Vacunas>();
		vacunasVencidas = new HashMap<String, Integer>();
	}
	

	/**
	 * Ingresa la vacuna a la heladera y le pasa un codigo para diferenciarlas
	 * @param nombre de la vacuna
	 * @param cantidad de vacunas
	 * @param fecha de entrada a la heladera
	 */
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
	
	
	/**
	 * Muestra la cantidad de vacunas disponibles por tipo en la heladera y verificamos
	 * que no este reservada para una persona
	 * @param nombre de la vacuna
	 * @return cantidad de la vacuna ingresada
	 */
	public int vacunasDisponibles(String nombre) {
		int contVacunasDisponibles = 0;
		for (Integer num : vacunas.keySet()) {
			if (vacunas.get(num).getNombre() == nombre && vacunas.get(num).isReservada() == false) {
			contVacunasDisponibles ++;	
			}
		}
		return contVacunasDisponibles;
	}
		
		
	/**
	 * Indica la cantidad total de vacunas disponibles en la heladera
	 * @return cantidad total de vacunas
	 */
	public int vacunasDisponibles() {
		int contVacunasDisponibles = 0;
		for (Integer num : vacunas.keySet()) {
		if (vacunas.get(num).isReservada() == false)
			contVacunasDisponibles ++;		
		}
		return contVacunasDisponibles;
	}

	
	/**
	 * Se ingresa la edad, verifica si hay vacunas disponibles por tipo y si se cumple se asigna la vacuna
	 * con el metodo asignarVacuna()
	 * @param edad de la persona
	 * @return vacuna correspondiente
	 */
	public String asignarVacunaDisponibles(int edad) {
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
	
	
    /**
     * Setea la vacuna del stock como asignada
     * @param nombre de la vacuna
     */
	private void asignarVacuna(String nombre) {
		int cont = 0;
		for (Integer num : vacunas.keySet()) {
			if (vacunas.get(num).getNombre() == nombre && vacunas.get(num).isReservada() == false && cont < 1) {
				vacunas.get(num).setReservada(true);
				cont++;
			}
		}
	}
	
	
	/**
	 * Setea la vacuna del stock como aplicada
	 * @param nombre de la vacuna
	 */
	public void aplicarVacuna(String nombre) {
		int cont = 0;
		for (Integer num : vacunas.keySet()) {
			if (vacunas.get(num).getNombre() == nombre && vacunas.get(num).isReservada() == true && vacunas.get(num).isAplicada() == false && cont < 1) {
				vacunas.get(num).setAplicada(true);
				cont++;
			}
		}
	}
	
	
	/**
	 * Elimina la vacuna aplicada a la persona
	 * @param nombre de la vacuna
	 */
	public void quitarVacunaAplicada(String nombre) {
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
	
	
	/**
	 * Devuelve la vacuna a la heladera de la persona que no asistio al turno
	 * @param nombre de la vacuna
	 */
	public void devolverVacuna(String nombre) {
		int cont = 0;
		for (Integer num : vacunas.keySet()) {
			if(vacunas.get(num).getNombre() == nombre && vacunas.get(num).isReservada() && cont<1) {
				vacunas.get(num).setReservada(false);
				vacunas.get(num).setAplicada(false);
				cont++;
			}
		}
	}
		
		
	/**
	 * Si la vacuna estuviera vencida la elimina
	 */
	public void quitarVacunaVencida() {
		Iterator<Map.Entry<Integer,Vacunas>> iterator=vacunas.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<Integer,Vacunas> entry=iterator.next();
			if(entry.getValue().estaVencida()){
				iterator.remove();
			}
		}
	}
	
	
	/**
	 * Mueve la vacuna vencida a un diccionario que reporta vacunas vencidas
	 */
	public void moverVacunasVencidas() {
		Integer cont = 0;
		for (Integer num : vacunas.keySet()) {
			if(vacunas.get(num).estaVencida()) {
				cont ++;
				vacunasVencidas.put(vacunas.get(num).getNombre(),cont);
			}
		}
	}

	
	/**
	 * @return Brinda un reporte de la situacion de las vacunas vencidas
	 */
	Map<String, Integer> reporteVacunasVencidas() {
		return vacunasVencidas;
	}

	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n\n                      --------------Heladeras------------ \n\n");
		sb.append("                             Vacunas Disponibles: "+ vacunasDisponibles() +"\n\n");
		sb.append("                             Vacunas Vencidas: "+ vacunasVencidas.size() + "\n\n");
		return sb.toString();	
	}
}
