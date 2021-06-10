

public class Principal {

	public static void main(String[] args) {
		Fecha fTurnos = new Fecha(15, 7, 2021);
		CentroVacunacion centro = new CentroVacunacion("UNGS", 5);

//		System.out.println("------------ Creacion -------------");
//		System.out.println(centro);
//		System.out.println("-----------------------------------");
//		System.out.println();


//		centro.ingresarVacunas("Pfizer", 2, new Fecha(15,6,2021));
//
		centro.ingresarVacunas("Pfizer", 50, new Fecha(15,7,2021));
		centro.ingresarVacunas("Moderna", 20, new Fecha(1,8,2021));
		centro.ingresarVacunas("Sputnik", 50, new Fecha(15,10,2021));
		
//		System.out.println(centro.vacunasDisponibles());
//		System.out.println(centro.vacunasDisponibles("Pfizer"));
//		
//		System.out.println(centro.vacunasDisponibles("Sputnik"));
//		System.out.println(centro.vacunasDisponibles("AstraZeneca"));
//		System.out.println(centro.vacunasDisponibles("Moderna"));
//		System.out.println(centro.vacunasDisponibles("Sinopharm"));
//		System.out.println(centro.vacunasDisponibles("Pfizer"));
	
		centro.inscribirPersona(34701000, new Fecha(1, 5, 1989), false, false); // dni, fecha de nacimiento, salud y comorbilidad
		centro.inscribirPersona(29959000, new Fecha(20, 11, 1982), false, true);
		centro.inscribirPersona(24780201, new Fecha(1, 6, 1972), true, false);
		centro.inscribirPersona(29223000, new Fecha(2, 5, 1982), false, true);
		centro.inscribirPersona(13000000, new Fecha(1, 5, 1958), true, false); //mayor
		centro.inscribirPersona(13000050, new Fecha(20, 6, 1958), false, false); //mayor
//		centro.inscribirPersona(34701001, new Fecha(1, 5, 1989), false, false); // dni, fecha de nacimiento, salud y comorbilidad
//		centro.inscribirPersona(29959001, new Fecha(20, 11, 1982), false, true);
//		centro.inscribirPersona(24780202, new Fecha(1, 6, 1972), true, false);
//		centro.inscribirPersona(29223001, new Fecha(2, 5, 1982), false, true);
//		centro.inscribirPersona(13000001, new Fecha(1, 5, 1958), true, false); //mayor
//		centro.inscribirPersona(13000051, new Fecha(20, 6, 1958), false, false); //mayor
//		centro.inscribirPersona(13000052, new Fecha(20, 6, 1958), false, false); //mayor
		
		System.out.println(centro.vacunasDisponibles());
		
		centro.generarTurnos(fTurnos);
		System.out.println(centro.turnosConFecha(new Fecha(15, 7, 2021)).size());
		
//		centro.generarTurnos(new Fecha(fTurnos));
//		System.out.println(fTurnos);
//		fTurnos.avanzarUnDia();
//		System.out.println(fTurnos);
//		
//		
		
		Fecha.setFechaHoy(16,7,2021);
		
		System.out.println(centro);
		System.out.println(centro.vacunasDisponibles());
		
		centro.inscribirPersona(34701001, new Fecha(1, 5, 1989), false, false); // dni, fecha de nacimiento, salud y comorbilidad
		centro.inscribirPersona(29959001, new Fecha(20, 11, 1982), false, true);
		centro.inscribirPersona(24780202, new Fecha(1, 6, 1972), true, false);
		centro.inscribirPersona(29223001, new Fecha(2, 5, 1982), false, true);
		centro.generarTurnos(new Fecha(17,7,2021));
//		centro.generarTurnos(new Fecha(fTurnos));
//		centro.generarTurnos(fTurnos);
		

		
		//System.out.println(centro.nomb());
		
		//System.out.println(centro.chequearCapacidadporDia(fTurnos));

		System.out.println(centro);
		System.out.println(centro.vacunasDisponibles());
		
//		System.out.println(centro.vacunasDisponibles());
//		
//		centro.inscribirPersona(13000053, new Fecha(20, 6, 1958), false, false); //mayor
//		centro.generarTurnos(new Fecha(18,7,2021));
//		
//		System.out.println(centro);
		
		
		
		//System.out.println(centro.obtenerUltimaFecha(fTurnos));

//		System.out.println(centro);


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
