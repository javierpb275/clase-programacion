public class Sobrepeso {

	public static void main(String[] args) {

		Persona p = new Persona("Pepe", 2, 70);

		Doctor d = new Doctor("Paco", 1.70, 65.5);

		p.imc = d.averiguarImc(p);

		p.mostrarDatos();

		d.analisisImc(p);

	}

}