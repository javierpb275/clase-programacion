public class Literal {

	public static void main(String[] args) {		
		
		byte a = (byte)1;
		short b = (short)2;
		int c = 3;
		long d = 4L;

		b = a;

		c = (int)d;


		System.out.println(b);

		System.out.println(c);

		//--------------------------------

		float variableFloat = 12.2F;
		double variableDouble = 12.2D;

		System.out.println(variableFloat);

		System.out.println(variableDouble);
		
	}

}