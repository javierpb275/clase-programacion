import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {

		String word = readWord();

		char myArray[] = initializeArray(word);

		eraseScreen();

		char letter;

		do {

			showArray(myArray);

			letter = readLetter();

			System.out.println("");

			fillLine(myArray, word, letter);

			eraseScreen();

		} while(!scoreAll(myArray, word));

		System.out.println("Congratulations! You've won. The word was: " + word);
		

	}	

	

	public static String readWord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell me the word: ");
		String word = sc.nextLine();
		return word;
	}

	public static char[] initializeArray(String word) {
		char myArray[] = new char[word.length()];

		for (int i = 0; i < word.length(); i++) 
			myArray[i] = '-';
		
		return myArray;
	}

	public static void showArray(char[] myArray) {
		for (int i = 0; i < myArray.length; i++) 
			System.out.print(myArray[i]);
	}

	public static void eraseScreen() {
		for (int i = 0; i < 50; i++) 
			System.out.println("");
	}

	public static char readLetter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell me the letter: ");
		char letter = sc.next().charAt(0);
		return letter;
	}

	public static void fillLine(char[] myArray, String word, char letter) {
		for (int i = 0; i < word.length(); i++) {
			if (letter == word.charAt(i))
				myArray[i] = letter;
		}
	}

	public static boolean scoreAll(char[] myArray, String word) {
		//turn myArray into String:
		String word2 = "";
		for (int i = 0; i < myArray.length; i++) 
			word2 += myArray[i];

		return word.equals(word2);	
	}

	public static boolean scoreAll2(char[] myArray) {
		boolean line = false;
		for (int i = 0; i < myArray.length; i++) {
			if(myArray[i] == '-')
				line = true;
		}

		return !line;	
	}

}
