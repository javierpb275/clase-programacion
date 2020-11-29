public class Conditional2 {

	public static void main(String[] args) {

		double nota = 6.59;


		if (nota < 5)
			System.out.println("Suspenso");

		else if ((nota > 5) && (nota < 6))
			System.out.println("Aprobado");

		else if ((nota >= 6) && (nota < 7))
			System.out.println("Bien");

		else if ((nota >= 7) && (nota < 9))
			System.out.println("Notable");

		else 
			System.out.println("Sobresaliente");
		
	}

}