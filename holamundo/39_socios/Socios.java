public class Socios {

	public static void main(String[] args) {

		Socio s1 = new Socio("Ana", "Perez");

		s1.movimientos.push(new Apunte(100, true, "Ingreso personal", "03/12/2020"));

		s1.movimientos.push(new Apunte(100, false, "Gasto personal", "02/12/2020"));

		s1.movimientos.mostrar();

		System.out.println("El total es " + s1.movimientos.totalApuntes());

	}

}
