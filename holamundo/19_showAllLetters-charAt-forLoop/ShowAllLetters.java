import java.util.Scanner;

public class ShowAllLetters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("");

		System.out.println("Write some text:");
		String text = sc.nextLine();

		int textLength = text.length();

		System.out.println("");

		for (int i = 0; i < textLength; i++) {

			System.out.println(text.charAt(i));

		}

	}

}