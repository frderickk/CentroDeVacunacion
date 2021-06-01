
public class Persona //implements Comparable<Persona> 
{
	//fecha de vacunacion depende la implementacion
	private int edad;
	private String nombre, apellido;
	private boolean trabajadorDeSalud, comorbilidades, vacunado;
	private char prioridad;
	private String vacunaAsignada;
	private Fecha fecha;
	
	
	//Constructor Persona
	public Persona(String nom, String ape, Integer edad, Boolean salud, Boolean comorbilidad) {
		this.nombre = nom;
		this.apellido = ape;
		this.edad = edad;
		this.trabajadorDeSalud = salud;
		this.comorbilidades = comorbilidad;
		//this.vacunado = vacunado;
	}
	
	//Constructor 2 para Persona
	public Persona(Fecha fecha2, Boolean salud, Boolean comorbilidad) {
		this.fecha = fecha2;
		this.trabajadorDeSalud = salud;
		this.comorbilidades = comorbilidad;
	}

	public int getEdad() {
		return edad;
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	public void setEdad(int edad) {
		this.edad = edad;
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

	public char getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(char prioridad) {
		this.prioridad = prioridad;
	}
	
	public String getVacunaAsignada() {
		return vacunaAsignada;
	}

	public void setVacunaAsignada(String vacunaAsignada) {
		this.vacunaAsignada = vacunaAsignada;
	}
	
	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	
	boolean esMenorDe60() {
		if (this.edad < 60) {
			return true;
		}
		return false;
	}
	
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
		return "" + nombre + " " + apellido  + ", " +  edad + " años";
	}
	
}
