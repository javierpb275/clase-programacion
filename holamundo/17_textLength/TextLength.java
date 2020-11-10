import java.util.Scanner;

public class TextLength {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Write some text:");
		String text = sc.nextLine();

		System.out.println("");

		System.out.println("Text: " + text);

		System.out.println("Text length: " + text.length());

	}

}