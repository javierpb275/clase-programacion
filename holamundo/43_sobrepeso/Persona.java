public class Persona {

	protected String nombre;
	protected double altura;
	protected double peso;
	protected double imc;

	public Persona(String nombre, double altura, double peso) {
		this.nombre = nombre;
		this.altura = altura;
		this.peso = peso;
		imc = 0;
	}

	public void mostrarDatos() {
		System.out.println("Me llamo " + this.nombre);
		System.out.println("Mido " + this.altura + "m");
		System.out.println("Peso " + this.peso + "kg");
		System.out.println("Mi indice de masa corporal es de " + this.imc);
	}

	public String toString() {

		return "Nombre: " + nombre + ", Altura: " + altura + ", Peso: " + peso + ", IMC: " + imc;

	}

}