import java.util.Scanner;

public class Bubble {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		int warehouse[] = {34, 56, 10, 5, 22, 13, 109, 200, 1};

		int aux;

		boolean exchanged;

		do {

			exchanged = false;

			for (int i = 0; i < (warehouse.length - 1); i++) {

				if (warehouse[i] > warehouse[i+1]) {

					aux = warehouse[i];

					warehouse[i] = warehouse[i+1];

					warehouse[i+1] = aux;

					exchanged = true;

				}

			}

		} while(exchanged);
			
		
			for (int i = 0; i < (warehouse.length - 1); i++) {

			System.out.println(warehouse[i]);	

			}

	}

}