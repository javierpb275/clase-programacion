public class App {

	public static void main(String[] args) {

		Electrician e1 = new Electrician("Oficial1", 100);

		System.out.println(e1.getYearlySalary());

		Plumber p1 = new Plumber(12, 100);

		System.out.println(p1.getYearlySalary());

	}

}
