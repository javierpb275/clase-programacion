import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		int option;

		int yourOption;

		do {

		showMenu();

		option = sc.nextInt();

		yourOption = chooseOption(option);

		getOption(yourOption);

		} while(yourOption != 3);

	}

	public static void showMenu() {
		System.out.println("1. Option 1");
		System.out.println("2. Option 2");
		System.out.println("3. EXIT");
	}

	public static int chooseOption(int option) {
		return option;
	}

	public static void getOption(int option) {
		if (option == 1)
			System.out.println("You've chosen option: " + option);
		else if (option == 2)
			System.out.println("You've chosen option: " + option);
		else if (option == 3)
			System.out.println("EXIT");
		else
			System.out.println("Please, choose a right option");
	}

}