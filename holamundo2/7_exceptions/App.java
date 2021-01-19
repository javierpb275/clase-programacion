
public class App {

	public static void main(String[] args) {

		int totalInicial = 11000;
		int participantes = 0;
		int totalPersona = 0;


		try {

			totalPersona = calcula(totalInicial, participantes);

		} catch(NumberFormatException e) {

			System.out.println("error 1");

		} catch(ArithmeticException e) {

			System.out.println("error 2");
			
		} catch(Exception e) {

			System.out.println("error 3");
			
		}

	}

	public static int calcula(int totalInicial, int participantes) throws Exception {
		if (participantes < 0 || participantes > 20)
			throw new Exception();

		return totalInicial / participantes;
	}

}

