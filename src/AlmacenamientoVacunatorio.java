import java.util.ArrayList;
import java.util.HashMap;

public class AlmacenamientoVacunatorio {
	
	private HashMap<String, ArrayList<Vacunas>> vacunas;
	private int vacunasDisponibles;
	
	public AlmacenamientoVacunatorio() {
		
		this.vacunasDisponibles = 0;
		
		vacunas = new HashMap<String, ArrayList<Vacunas>>();
		
	}
	

}
