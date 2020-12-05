//Realiza un programa java con un método que dado un String me devuelva su inverso (ejemplo hola -> aloh)
//Parametro de entrada Un String
//Parametro salida String
public class Ejercicio4 {

	public static void main(String[] args) {

		String text = "Whatever";

		System.out.println(reverseText(text));

		System.out.println(reverseText2(text));

	}

	public static String reverseText(String text) {

		String result = " ";

		for (int i = text.length() - 1; i >= 0; i--) {

			result += text.charAt(i);
			
		}

		return result;

	}

	public static String reverseText2(String text) {

		String result = " ";

		int i = text.length() - 1;

		while(i >= 0) {
			result += text.charAt(i);
			i--;
		}

		return result;

	}




}