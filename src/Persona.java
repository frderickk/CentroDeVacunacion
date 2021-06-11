
public class Persona //implements Comparable<Persona> 
{
	//fecha de vacunacion depende la implementacion
	private boolean trabajadorDeSalud, comorbilidades, vacunado;
	private String prioridad;
	private String vacunaAsignada;
	private Fecha fechaDeTurno;
	private Fecha fechaDeNacimiento;
	private int dni;

	//Constructor para Persona
	public Persona(int dni, Fecha fecha2, Boolean salud, Boolean comorbilidad) {
		this.fechaDeNacimiento = fecha2;
		this.trabajadorDeSalud = salud;
		this.comorbilidades = comorbilidad;
		this.dni = dni;
	}

	public int edad() {
		return  Fecha.diferenciaAnios(Fecha.hoy(), fechaDeNacimiento);
		
	}

	public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
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

	public String getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}

	public String getVacunaAsignada() {
		return vacunaAsignada;
	}

	public void setVacunaAsignada(String vacunaAsignada) {
		this.vacunaAsignada = vacunaAsignada;
	}
	
	public Fecha getFecha() {
		return fechaDeTurno;
	}

	public void setFecha(Fecha fecha) {
		this.fechaDeTurno = fecha;
	}
	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	
//	boolean esMenorDe60() {
//		if (this.fechaDeNacimiento < 60) {
//			return true;
//		}
//		return false;
//	}
	
//	void asignarVacuna(Integer dni) {
//		if(esMenorDe60()) {
//			System.out.println("Pfizer o Sputnik");
//		}
//		else {
//			System.out.println("Cualquiera");
//		}
//	}
	
//	Vacunas verVacunaAsignada() {
//		return vacunaAsignada.get(dni);
//	}
	
//	public int compareTo(Persona o) {
//		return o.getDni()-this.getDni();
//	}


	@Override
	public String toString() {
		return "" + prioridad + vacunaAsignada + fechaDeTurno;
	}
	
}
