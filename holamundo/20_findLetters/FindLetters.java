import java.util.Scanner;

public class FindLetters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("");

		System.out.println("Write some text:");
		String text = sc.nextLine();

		int textLength = text.length();
		int vowelCounter = 0;
		char letter;

		System.out.println("");

		for (int i = 0; i < textLength; i++) {

			letter = text.charAt(i);
			letter = Character.toUpperCase(letter);

			if ((letter == 'A') || (letter == 'E') || (letter == 'I') 
				|| (letter == 'O') || (letter == 'U'))
				vowelCounter++;

		}

		System.out.println("'Vowels': " + vowelCounter);
		System.out.println("'Consonants': " + (textLength - vowelCounter));

	}

}