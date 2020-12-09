public class Personas {

	public static void main(String[] args) {

		Persona p1 = new Persona("Pepe", 40, 'H', 70.0, 1.80);

		p1.generaDNI();

		p1.comprobarSexo('M');

		System.out.println(p1.esMayorDeEdad());

		System.out.println(p1);

		System.out.println(p1.calcularIMC());
		
	}

}