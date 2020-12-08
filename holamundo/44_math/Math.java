public class Math {

	public static void main(String[] args) {

		Persona p1 = new Persona("Pepe");

		p1.push(new Calculator("calculator1"));
		p1.push(new Calculator("calculator2"));
		p1.push(new Calculator("calculator3"));

		p1.pop();

		p1.mostrarCalculadoras();

		System.out.println(p1.myCalculators[0].calculate(10.55, 'S', 9.45));

	}

}