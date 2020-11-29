import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("");

		System.out.println("Write 1st text:");
		String text1 = sc.nextLine();

		System.out.println("");

		System.out.println("Write 2nd text:");
		String text2 = sc.nextLine();

		System.out.println("");

		if (text1.equals(text2))
			System.out.println("They are equal!");
		else
			System.out.println("They are NOT equal!");

	}

}