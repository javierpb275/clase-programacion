public class App {

	public static void main(String[] args) {

		Circle c = new Circle();
		Square s = new Square();

		System.out.println(c.getArea(10d));
		System.out.println(c.getPerimeter(10d));

		System.out.println(s.getArea(4d));
		System.out.println(s.getPerimeter(4d));

	}

}
