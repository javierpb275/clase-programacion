public class Square extends Shape {

	@Override
	public double getArea(double side) {
		double result = side * side;
		return result;
	}

	@Override
	public double getPerimeter(double side) {
		double result = side * 4;
		return result;
	}

}
