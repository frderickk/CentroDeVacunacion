
public class main {

	public static void main(String[] args) {
		
		Vacunatorio vacunatorio = new Vacunatorio();
		
		Pfizer pfizer = new Pfizer(100);
		
//		vacunatorio.inscripcion(36495959, "Federico", "Farias", 29, 'n', 'n');
//		vacunatorio.inscripcion(12345678, "Elias", "Espinillo", 23, 'n', 'n');
		vacunatorio.inscripcion(90878653, "Pepe", "Pepito", 76, 'n', 'n');

		System.out.println(vacunatorio);
		
		pfizer.agregarVacuna();
		
		System.out.println(pfizer);

	}
}
