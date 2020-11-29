import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = -1;

		while(number != 0) {

			System.out.println("Select a number:");

			number = sc.nextInt();

			if (number != 0) {

				if (number % 2 == 0)
					System.out.println("It's even");
				else
					System.out.println("It's odd");
			}

		}

		System.out.println("EXIT");

	}

}