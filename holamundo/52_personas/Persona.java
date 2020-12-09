import java.util.Random;

public class Persona {

	Random random; 

	String nombre;
	int edad;
	int dni;
	double peso;
	double altura;
	char sexo;

	public Persona() {
		this.nombre = "persona";
		this.edad = 0;
		this.peso = 0.0;
		this.altura = 0.0;
		this.sexo = 'H';
	}

	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = 0.0;
		this.altura = 0.0;
		this.sexo = sexo;
	}

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
	}

	public int calcularIMC() {
		double imc = this.peso / this.altura;
		int resultado = 0;

		if (imc < 20)
			resultado = -1;
		else if (imc >= 20 && imc <= 25)
			resultado = 0;
		else
			resultado = 1;

		return resultado;
	}

	public boolean esMayorDeEdad() {
		return (this.edad >= 18) ? true : false;
	}

	public void comprobarSexo(char sexo) {
		if (this.sexo != sexo)
			System.out.println("No soy " + sexo + ", soy " + this.sexo);
		else
			System.out.println("Sí, soy " + this.sexo);
	}

	public String toString() {
        return "nombre: " + nombre + ", edad: " + edad +  ", sexo: " + sexo + 
        ", peso: " + peso +  ", altura: " + altura + ", dni:" + dni;
    }

    public void generaDNI() {
    	random = new Random();
    	this.dni = random.nextInt((99999999 - 00000000) + 1) + 00000000;
    }

}