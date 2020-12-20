public class Complejos {

	public static void main(String[] args) {
		
		Complejo c1 = new Complejo();
		Complejo c2 = new Complejo(5.0, 0.3);

		c1.asignar(5.0, 0.3);

		c1.sumar();
		c2.sumar();
		
		System.out.println(c1);
		System.out.println(c2);

		System.out.println(c1.equals(c2));

	}
}
