

public class Principal {

	public static void main(String[] args) {
		Fecha fTurnos = new Fecha(15, 7, 2021);
		CentroVacunacion centro = new CentroVacunacion("UNGS", 5);

		System.out.println("------------ Creacion -------------");
		System.out.println(centro);
		System.out.println("-----------------------------------");
		System.out.println();

		centro.ingresarVacunas("Pfizer", 2, new Fecha(15,1,2021));
		centro.ingresarVacunas("Pfizer", 1, new Fecha(1,6,2021));
		
		System.out.println(centro.vacunasDisponibles());
		
//		System.out.println(centro.vacunasDisponibles("Sputnik"));
//		System.out.println(centro.vacunasDisponibles("AstraZeneca"));
//		System.out.println(centro.vacunasDisponibles("Moderna"));
//		System.out.println(centro.vacunasDisponibles("Sinopharm"));
//		System.out.println(centro.vacunasDisponibles("Pfizer"));
	
		centro.inscribirPersona(34701000, new Fecha(1, 5, 1989), false, false); // dni, fecha de nacimiento, salud y comorbilidad
		centro.inscribirPersona(29959000, new Fecha(20, 11, 1982), false, true);
		centro.inscribirPersona(24780201, new Fecha(1, 6, 1972), true, false);
		centro.inscribirPersona(29223000, new Fecha(2, 5, 1982), false, true);
		centro.inscribirPersona(13000000, new Fecha(1, 5, 1958), true, false);
		centro.inscribirPersona(13000050, new Fecha(20, 6, 1958), false, false);
		
		centro.vacunasVencidas();
		
		//System.out.println(centro.nomb());
		
		System.out.println(centro);

//		centro.generarTurnos(fTurnos);
//
//		System.out.println("-------------- Turnos -------------");
//		System.out.println(centro.turnosConFecha(fTurnos));
//		System.out.println("-----------------------------------");
//		System.out.println();
//		
//		centro.vacunarInscripto(24780201, fTurnos);
//		centro.vacunarInscripto(13000000, fTurnos);
//
//		System.out.println("------------- Centro --------------");
//		System.out.println(centro);
//		System.out.println("-----------------------------------");

	}
}
