import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class CentroVacunacion {
	
	private int capacidad;
	private HashMap<Integer, Persona> inscriptos;
	private String nombre;
	private HashMap<Integer, Persona> turno;
    private HashMap<Integer, Persona> vacunados;
    
    private HashMap<Integer, Vacunas> vacunas; //Stock
	
	private int vacPfizerVen;
	private int vacModernaVen;
	
	private int codVac;
	
	private int stockPfizer;
	private int stockAstra;
	private int stockSputnik;
	private int stockModerna;
	private int stockSino;
	

	/**
	* Constructor.
	* recibe el nombre del centro y la capacidad de vacunación diaria.
	* Si la capacidad de vacunación no es positiva se debe generar una excepción.
	* Si el nombre no está definido, se debe generar una excepción.
	*/
	public CentroVacunacion(String nombreVacunatorio, int capacidadDiaria) {
		this.capacidad = capacidadDiaria;
		inscriptos = new HashMap<Integer, Persona>();
		vacunas = new HashMap<Integer, Vacunas>();
		this.nombre = nombreVacunatorio;
		
		if(capacidadDiaria < 0) {
			throw new RuntimeException("El centro no tiene capacidad");
		}
//		vacunaAsignada = new HashMap<Integer, Vacunas>();
	}

	
	/**
	* Se inscribe una persona en lista de espera.
	* Si la persona ya se encuentra inscripta o es menor de 18 años, se debe
	* generar una excepción.
	* Si la persona ya fue vacunada, también debe generar una excepción.
	*/
	//metodo para inscribir personas
	void inscribirPersona(int dni, Fecha fechaDeNacimiento, Boolean salud, Boolean comorbilidad) {
		if(inscriptos.containsKey(dni)) {
			throw new RuntimeException("Esta persona ya ha sido inscripta");
		}

		 if (Fecha.diferenciaAnios(Fecha.hoy(), fechaDeNacimiento) < 18) {
			throw new RuntimeException("Esta persona es menor de edad");
		}
		 if(vacunados.containsKey(dni)) {
			 throw new RuntimeException("Esta persona ya ha sido vacunada");
		 }
		 else {
			 inscriptos.put(dni, new Persona(fechaDeNacimiento, salud, comorbilidad));
		 	}
		 }



	
	/**
	* Primero se verifica si hay turnos vencidos. En caso de haber turnos
	* vencidos, la persona que no asistió al turno debe ser borrada del sistema
	* y la vacuna reservada debe volver a estar disponible.
	*
	* Segundo, se deben verificar si hay vacunas vencidas y quitarlas del sistema.
	*
	* Por último, se procede a asignar los turnos a partir de la fecha inicial
	* recibida según lo especificado en la 1ra parte.
	* Cada vez que se registra un nuevo turno, la vacuna destinada a esa persona
	* dejará de estar disponible. Dado que estará reservada para ser aplicada
	* el día del turno.
	*
	*
	*/
	//metodo para asginar turno 
	void generarTurnos(Fecha fechaInicial) {
		//chequear lista de espera, la primera vez nos da 0.
		//ver stock general == true sigue si es == false > listadeespera
		//inscriptos.get(dni).getPrioridad();
		//asignarVacuna();
		//verificarCapacidad();
		//turno (Date)
	}
	
	public void definirPrioridad() {
//		if(inscriptos.get(dni).getTrabajadorDeSalud() == true) {
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
//	}
	
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
	
	
	/**
	* Devuelve un Diccionario donde
	* - la clave es el dni de las personas vacunadas
	* - Y, el valor es el nombre de la vacuna aplicada.
	*/
	//metodo que nos da una lista de vacunados
	Map<Integer, String> reporteVacunacion() {
		return reporteVacunacion();
	}
	
	
	/**
	* Devuelve una lista con los dni de las personas que tienen turno asignado
	* para la fecha pasada por parámetro.
	* Si no hay turnos asignados para ese día, se debe devolver una lista vacía.
	* La cantidad de turnos no puede exceder la capacidad por día de la ungs.
	*/
	//metodo que nos da una lista con los turnos del dia
	List<Integer> turnosConFecha(Fecha fecha) {
		return turnosConFecha(fecha);
	}
	
	void ponerEnListaEspera() {
		
	}
	
	
	/**
	* Devuelve una lista con los DNI de todos los inscriptos que no se vacunaron
	* y que no tienen turno asignado.
	* Si no quedan inscriptos sin vacunas debe devolver una lista vacía.
	*/
	//metodo que nos da una lista con las personas restantes por vacunar
	List <Integer> listaDeEspera() {
		return listaDeEspera();
	}
	
	
	/**
	* Dado el DNI de la persona y la fecha de vacunación
	* se valida que esté inscripto y que tenga turno para ese dia.
	* - Si tiene turno y está inscripto se debe registrar la persona como
	* vacunada y la vacuna se quita del depósito.
	* - Si no está inscripto o no tiene turno ese día, se genera una Excepcion.
	*/
	//si se presenta, se cambia el boolean a vacunado
	void vacunarInscripto(int dni, Fecha fechaVacunacion) {	
		//leer lista "turno"
		//verificar que se haya presentado
		//Si se present�,cambiar el boolean a vacunado
		//Sino, lo sacamos del sistema y se devuelve la vacuna al stock
	}
	
	
	/**
	* Solo se pueden ingresar los tipos de vacunas planteados en la 1ra parte.
	* Si el nombre de la vacuna no coincidiera con los especificados se debe generar
	* una excepción.
	* También se genera excepción si la cantidad es negativa.
	* La cantidad se debe
	* sumar al stock existente, tomando en cuenta las vacunas ya utilizadas.
	*/
	void ingresarVacunas(String nombre, int cant, Fecha fechaDeEntrada) {
		if (nombre == "AstraZeneca") {
			int cantidad = 0;
			while(cantidad <= cant) {
				vacunas.put(codVac, new Astra(fechaDeEntrada));
				cantidad ++;
				codVac ++;
			}
		}
		if (nombre == "Sputnik") {
			int cantidad = 0;
			while(cantidad <= cant) {
				vacunas.put(codVac, new Sputnik(fechaDeEntrada));
				cantidad ++;
				codVac ++;
			}
		}
		if (nombre == "Moderna") {
			int cantidad = 0;
			while(cantidad <= cant) {
				vacunas.put(codVac, new Moderna(fechaDeEntrada));
				cantidad ++;
				codVac ++;
			}
		}
		if (nombre == "Sinopharm") {
			int cantidad = 0;
			while(cantidad <= cant) {
				vacunas.put(codVac, new Sino(fechaDeEntrada));
				cantidad ++;
				codVac ++;
			}
		}
		if (nombre == "Pfizer") {
			int cantidad = 0;
			while(cantidad <= cant) {
				vacunas.put(codVac, new Pfizer(fechaDeEntrada));
				cantidad ++;
				codVac ++;
			}
		}
	}
	
//	void refrigeracionApropiada(int temperaturaHeladera , String vacuna) {
//		//recibe una temperatura de la heladera, con la vacuna que almacena
//		//si la temperatura de la heladera no es igual a la de la vacuna, vence la vacuna
//		//env�a una advertencia de que esas vacunas no est�n a temperatura correcta
//	}
//	
	
	/**
	* Devuelve en O(1) un Diccionario:
	* - clave: nombre de la vacuna
	* - valor: cantidad de vacunas vencidas conocidas hasta el momento.
	*/
	Map<String, Integer> reporteVacunasVencidas() {
		//se chequea con la fecha si venci�
		return reporteVacunasVencidas();
	}
	
	
	/**
	* total de vacunas disponibles no vencidas sin distinción por tipo.
	*/
	int vacunasDisponibles() {
		return 1;
	}
	
	
	/**
	* total de vacunas disponibles no vencidas que coincida con el nombre de
	* vacuna especificado.
	*/
	int vacunasDisponibles(String nombre) {
		return 1;
	}
	

	@Override
	public String toString() {
		return "" + vacunas;
	}
	
	
	
}
