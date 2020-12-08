public class Persona {

	String name;
	int calculatorCounter;
	Calculator[] myCalculators;

	public Persona(String name) {
		this.name = name;
		this.calculatorCounter = 0;
		this.myCalculators = new Calculator[10];
	}

	public void push(Calculator c) {

		myCalculators[calculatorCounter] = c;

		calculatorCounter++;

		}

	public Calculator pop() {

		Calculator result = myCalculators[calculatorCounter-1];

		myCalculators[calculatorCounter-1] = null;

		calculatorCounter--;

		return result;

		}

	public void mostrarCalculadoras() {
		System.out.println("Calculadoras de " + this.name + ":");

		for (int i = 0; i < calculatorCounter; i++) {

			System.out.println(myCalculators[i]);
			
		}
		
	}

	public String toString() {

		return "Nombre: " + name;

	}

}