import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b;
		
		do {

			System.out.println("Select the first number:");
			
			a = sc.nextInt();

			System.out.println("Select the second number:");
			
			b = sc.nextInt();

			if (a > b) {
				System.out.println(a + " is higher");
				System.out.println(b + " is lower");
			}

			else if (b > a) {
				System.out.println(b + " is higher");
				System.out.println(a + " is lower");	
			}		


		} while(a != b);

		System.out.println("Both numbers are equal!");

	}

}