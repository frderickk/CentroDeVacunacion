import java.util.Date;

public class Persona //implements Comparable<Persona> 
{
	//fecha de vacunacion depende la implementacion
	private int edad;
	private String nombre, apellido;
	private char trabajadorDeSalud, comorbilidades;
	private char prioridad;
	private String vacunaAsignada;
	private Date fecha;
		
	public Persona(String nom, String ape, int edad, Character salud, Character comorbilidad) {
		this.nombre = nom;
		this.apellido = ape;
		this.edad = edad;
		this.trabajadorDeSalud = salud;
		this.comorbilidades = comorbilidad;
	}
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public char getTrabajadorDeSalud() {
		return trabajadorDeSalud;
	}

	public void setTrabajadorDeSalud(char trabajadorDeSalud) {
		this.trabajadorDeSalud = trabajadorDeSalud;
	}

	public char getComorbilidades() {
		return comorbilidades;
	}

	public void setComorbilidades(char comorbilidades) {
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
	
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean esTrabajadorDeSalud() {
		switch (Character.toLowerCase(this.trabajadorDeSalud)) {
		case 'y': {
			return true;
		}
		case 'n': {
			return false;
		}
		default:
			throw new IllegalArgumentException("Tiene que ser Y para si y N para no");
		}
	}
	
	public boolean tieneComorbilidades() {
		switch (Character.toLowerCase(this.comorbilidades)) {
		case 'y': {
			return true;
		}
		case 'n': {
			return false;
		}
		default:
			throw new IllegalArgumentException("Tiene que ser Y para si y N para no");
		}
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
