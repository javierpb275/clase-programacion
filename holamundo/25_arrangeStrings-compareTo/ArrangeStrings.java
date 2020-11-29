import java.util.Scanner;

public class ArrangeStrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);

		String classroom[] = {
			"Juan",
			"Pepe",
			"Paco",
			"Alba",
			"Laura",
		};

		String aux;

		boolean exchanged;

		do {

			exchanged = false;

			for (int i = 0; i < (classroom.length - 1); i++) {

				if (classroom[i].compareTo(classroom[i+1]) > 0) {

					aux = classroom[i];

					classroom[i] = classroom[i+1];

					classroom[i+1] = aux;

					exchanged = true;

				}

			}

		} while(exchanged);
			
		
			for (int i = 0; i < (classroom.length - 1); i++) {

			System.out.println(classroom[i]);	

			}

	}

}