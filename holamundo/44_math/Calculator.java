public class Calculator {
	String name;

	public Calculator(String name) {
		this.name = name;
	}

	public double calculate(double n1, char operation, double n2) {

		double result = 0;

		if (operation == 'S' || operation == 's') 
			result = n1 + n2;
		else if (operation == 'R' || operation == 'r') 
			result = n1 - n2;
		else if (operation == 'M' || operation == 'm') 
			result = n1 * n2;
		else if (operation == 'D' || operation == 'd') 
			result = n1 / n2;
		else 
			System.out.println("Wrong information. The operation options are: S, R, M, or D");

		return result;

	}

	public String toString() {

		return name;

	}



}