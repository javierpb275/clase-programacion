public class App {

	public static void main(String[] args) {
		
		Guitarrista g1 = new Guitarrista();

		g1.nombre = "luis";
		g1.apellidos = "fernandez";

		System.out.println(g1.getNombreApellidos());
	}

}

