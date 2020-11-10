public class CodigoChar {

	public static void main(String[] args) {		
		
		char a = 'z';//122
		char b = '\u007A';//122(hexadecimal) or z(char) 

		int c = (int)a;
		int d = (int)b;

		System.out.println(c);
		System.out.println(d);

		//---------------------------------------

		char z = '\u007A';//z (hexadecimal)

		System.out.println(z);

		//--------------------------------------

		char number = '7';//55

		int codeNumber = (int)number;

		System.out.println(codeNumber);







	}

}