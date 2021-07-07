
public class Persona {
	
	private int dni, prioridad;
	private Fecha fechaDeNacimiento, fechaDeTurno;
	private boolean trabajadorDeSalud, comorbilidades;
	private String  vacunaAsignada;
	
	
	/**
	* Constructor de persona
	* Recibe como parametros el DNI, la fecha de nacimiento
	* si es trabajador de salud y si tiene comorbilidades
	*/
	public Persona(int dni, Fecha fechaDeNacimiento, Boolean comorbilidad, Boolean trabajadorDeSalud) {
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.trabajadorDeSalud = trabajadorDeSalud;
		this.comorbilidades = comorbilidad;
		this.dni = dni;
	}
	
	
	/**
	 * Getters y setters de Persona
	 */
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	
	/**
	 * Calculamos la edad en base a la fecha de nacimiento y la diferencia con la fecha actual
	 */
	public int edad() {
		return  Fecha.diferenciaAnios(Fecha.hoy(), fechaDeNacimiento);
	}

	public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public Fecha getFecha() {
		return fechaDeTurno;
	}

	public void setFecha(Fecha fecha) {
		this.fechaDeTurno = fecha;
	}

	public boolean getTrabajadorDeSalud() {
		return trabajadorDeSalud;
	}

	public void setTrabajadorDeSalud(boolean trabajadorDeSalud) {
		this.trabajadorDeSalud = trabajadorDeSalud;
	}

	public boolean getComorbilidades() {
		return comorbilidades;
	}

	public void setComorbilidades(boolean comorbilidades) {
		this.comorbilidades = comorbilidades;
	}

	public int getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}

	public String getVacunaAsignada() {
		return vacunaAsignada;
	}

	public void setVacunaAsignada(String vacunaAsignada) {
		this.vacunaAsignada = vacunaAsignada;
	}
	
	
	/**
	 * hashCode y equals de Persona verificando con el numero de DNI
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dni;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (dni != other.dni)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona []";
	}
}
