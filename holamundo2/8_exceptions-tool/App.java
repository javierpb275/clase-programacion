import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Tool t1 = new Tool();

		t1.setName("hammer");

		int errors = 0;

		int price;

		for (int i = 0; i < 10; i++) {
			System.out.println("Tell me the price:");
			price = sc.nextInt();

		try {

			t1.setPrice(price);

		} catch(Exception e) {

			errors++;

		}
				
	}

		if (errors == 0)
			System.out.println("OK");
		else 
			System.out.println("There has been " + errors + " errors");

	}

}
