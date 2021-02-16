public class App {

	public static void main(String[] args) {
		
		SuperArray sa = new SuperArray();
		
		sa.mostrar();
		
		sa.aumentarUno();
		
		try {
			sa.restarUno();
		} catch (NoSePuedeRestar e) {
			e.printStackTrace();
		}
		
		sa.ponMenorACero();
		
		sa.intercambia(1, 2);
		
		System.out.println();
		
		sa.mostrar();

	}

}