import java.util.HashMap;
import java.util.Date;

public class Vacunatorio {
	
	private int capacidad;
	private HashMap<Integer, Persona> inscriptos;
	private String nombre;
//	private HashMap<Integer, Persona> turno;
//	private HashMap<Integer, Persona> listaespera;
//  private HashMap<Integer, Persona> vacunados;

	public Vacunatorio(String n, int capa) {
		this.capacidad = capa;
		inscriptos = new HashMap<Integer, Persona>();
		this.nombre = n;
//		vacunaAsignada = new HashMap<Integer, Vacunas>();
	}

	//metodo para inscribir personas
	void inscripcion(int dni, String nom, String ape, int edad, char salud, char comorbilidad) {
		if(inscriptos.containsKey(dni)) {
			throw new RuntimeException("Esta persona ya ha sido inscripta");
		}
		inscriptos.put(dni, new Persona(nom, ape, edad, salud, comorbilidad));
	}

	//metodo para asginar turno 
	void asignarTurnos(Date d) {
		//chequear lista de espera, la primera vez nos da 0.
		//ver stock general == true sigue si es == false > listadeespera
		//inscriptos.get(dni).getPrioridad();
		//asignarVacuna();
		//verificarCapacidad();
		//turno (Date)
	}
	
	public void definirPrioridad() {
//		if(inscriptos.get(dni).getTrabajadorDeSalud() == 'y') {
//			this.prioridad = '1';
//		}
//		if(this.tieneComorbilidades() == true) {
//			this.prioridad = '2';
//		}
//		if(this.esMenorDe60() == false) {
//			this.prioridad = '3';
//		}
//		else {
//			this.prioridad = '4';
//		}
	}
	
	void asignarVacuna() {
//      ver stock individual == true asginar vacuna y sigue, si es false > ponerEnListaDeESpera();
//		for (Integer iterable_element : iterable) {
//			
//		}
//		if(inscriptos.get(dni).getEdad() < 60) {
//			System.out.println("P y S");
//		}
//		else {
//			System.out.println("Cualquiera");
//		}
	}
	
	//metodo que nos da una lista de vacunados
	void reporteVacunados(Date d) {
		
	}
	
	//metodo que nos da una lista con los turnos del dia
	void reporteTurnosDelDia(Date d) {
		
	}
	
	void ponerEnListaEspera() {
		
	}
	
	//metodo que nos da una lista con las personas restantes por vacunar
	void listaEspera() {
		
	}

	@Override
	public String toString() {
		return "" + inscriptos;
	}
	
	
	
}
