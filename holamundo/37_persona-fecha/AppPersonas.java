public class AppPersonas {

	public static void main(String[] args) {

		Persona p1 = new Persona("Luis", "Suarez", new Fecha(2, 12, 2020));
		Persona p2 = new Persona("Luis", "Suarez", new Fecha(2, 12, 2020));
		Persona p3 = new Persona();

		p1.mostrarDatos();

		if (p1.equals(p2)) {
			System.out.println("Son iguales");
		}
		
	}

}
