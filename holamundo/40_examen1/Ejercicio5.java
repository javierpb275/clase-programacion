//Realiza un programa java con un método que dado dos String me devuelva cual va antes alfabéticamente
//Parámetro de entrada: Dos String
//Parámetro salida: Un String 

public class Ejercicio5 {
	
	public static void main(String[] args) {

		String s1 = "Alex";
		String s2 = "Paco";

		System.out.println(firstStringAbc(s1, s2));

	}

	public static String firstStringAbc(String s1, String s2) {

		String result = "";

		for (int i = 0; i < s1.length(); i++) {

			for (int j = 0; j < s2.length(); j++) {

			if (s1.toLowerCase().charAt(i) > s2.toLowerCase().charAt(j)) 
				result = s1;
			
			else
				result = s2;

			}
			
		}

		return result;

	}

}