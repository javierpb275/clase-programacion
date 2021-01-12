public class Circle extends Shape {

	@Override
	public double getArea(double radio) {
		double result = 3.14d * radio * radio;
		return result;
	}

	@Override
	public double getPerimeter(double radio) {
		double result = 3.14d * 2 * radio;
		return result;
	}

}
