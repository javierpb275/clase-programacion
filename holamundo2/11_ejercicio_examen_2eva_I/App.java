public class App {
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora("3+4-3*2*9-1*5+3");

		try {

			System.out.println(calculadora.getResultado());

		} catch(Exception e) {

			System.out.println("Expresion Erronea");

		}

	}
}
