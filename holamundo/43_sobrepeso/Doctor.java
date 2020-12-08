public class Doctor extends Persona {

	public Doctor(String nombre, double altura, double peso) {
		super(nombre, altura, peso);

	}

	public double averiguarImc(Persona p) {

		double result = p.peso / p.altura;

		return result;
	}

	public void analisisImc(Persona p) {

		if (p.imc < 16) 
			System.out.println(p.nombre + ", debemos ingresarte.");
		else if (p.imc >= 16 && p.imc < 18)
			System.out.println(p.nombre + ", tienes bajo peso.");
		else if (p.imc >= 18 && p.imc < 25)
			System.out.println(p.nombre + ", tienes un peso normal.");
		else
			System.out.println(p.nombre + ", tienes sobrepeso.");
	}

}