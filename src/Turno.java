
public class Turno {
	
	private Persona persona;
	private Vacunas vacuna; 
	private Fecha fecha;
	
	public Turno(Persona persona, Vacunas vacuna, Fecha fecha) {
		this.persona = persona;
		this.vacuna = vacuna;
		this.fecha = fecha;

	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Vacunas getVacuna() {
		return vacuna;
	}

	public void setVacuna(Vacunas vacuna) {
		this.vacuna = vacuna;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

}
