import java.util.Scanner;

public class FindWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("");

		System.out.println("Write some text:");
		String text = sc.nextLine();

		System.out.println("Tell me the 'word' you want to find:");
		String word = sc.nextLine();

		int position = 0;

		int counter = 0;

		System.out.println("");

		while((word.length() > 0) && (position >= 0) 
			&& (position < text.length())) {

			position = text.indexOf(word, position);

			if (position >= 0) {

				counter++;
				position++;

			}

		}

		System.out.println("Found: " + counter + " time(s)");

	}

}