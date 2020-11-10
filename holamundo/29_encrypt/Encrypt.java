public class Encrypt {

	public static void main(String[] args) {

		int number = 5;

		if (args.length == 2) {

		if (args[0].equals("E")) {
			String encryptedText = encryptText(args[1], number);
			System.out.println(encryptedText);
		}

		else if (args[0].equals("D")) {
			String decipheredText = decipherText(args[1], number);
			System.out.println(decipheredText);
			}

		}

		else
			System.out.println("Please, type the right info!");	
	
	}	

	public static String encryptText(String text, int number){

		String result = "";
		char letter;

		for (int i = 0; i < text.length(); i++) {

			letter = text.charAt(i);

			letter = (char)(letter + number); 

			result = result + letter;
	
		}

		return result;
	}

	public static String decipherText(String text, int number){

		String result = "";
		char letter;

		for (int i = 0; i < text.length(); i++) {

			letter = text.charAt(i);

			letter = (char)(letter - number); 

			result = result + letter;
	
		}

		return result;
	}

}
