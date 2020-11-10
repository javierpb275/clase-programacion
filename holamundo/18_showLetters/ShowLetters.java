import java.util.Scanner;

public class ShowLetters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("");

		System.out.println("Write some text:");
		String text = sc.nextLine();

		int textLength = text.length();

		int textLengthMinus1 = textLength - 1;

		char firstLetter = text.charAt(0);
		char lastLetter = text.charAt(textLengthMinus1);

		System.out.println("");

		System.out.println("First Letter: " + firstLetter);

		System.out.println("Last Letter: " + lastLetter);

	}

}