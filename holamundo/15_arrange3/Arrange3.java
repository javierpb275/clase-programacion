import java.util.Scanner;

public class Arrange3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n1, n2, n3;
		int a1, a2, a3;
		int option;
		
		do {

			System.out.println("");

			System.out.println("Select the first number:");
			n1 = sc.nextInt();

			System.out.println("Select the second number:");
			n2 = sc.nextInt();

			System.out.println("Select the third number:");
			n3 = sc.nextInt();

			//Arrange and show:

			//get a1
			if ((n1 <= n2) && (n1 <= n3))
				a1 = n1;
			else if ((n2 <= n1) && (n2 <= n3))
				a1 = n2;
			else
				a1 = n3;

			//get a3
			if ((n1 >= n2) && (n1 >= n3))
				a3 = n1;
			else if ((n2 >= n1) && (n2 >= n3))
				a3 = n2;
			else
				a3 = n3;

			//get a2
			a2 = (n1 + n2 + n3) - (a1 + a3);

			System.out.println("");

			System.out.println("Result: " + a1 + ", " + a2 + ", " + a3);

			System.out.println("");

			System.out.println("Press 1 to repeat");
			option = sc.nextInt();

		} while(option == 1);	

	}

}