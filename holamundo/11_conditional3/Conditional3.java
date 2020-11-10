import java.util.Scanner;

public class Conditional3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Choose an option:");

		System.out.println("1. Add");
		System.out.println("2. Delete");
		System.out.println("3. Exit");

		int option = s.nextInt();

		switch(option) {
			case 1:
			System.out.println("You've selected Add");
			break;
			case 2:
			System.out.println("You've selected Delete");
			break;
			case 3:
			System.out.println("You've selected Exit");
			break;
			default:
			System.out.println("Choose a correct option");
			break;
		}

	}

}