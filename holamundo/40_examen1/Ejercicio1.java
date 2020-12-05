//Imprimir los 100 primeros numeros impares:
public class Ejercicio1 {

	public static void main(String[] args) {

		int counter = 0;
		int number = 0;

		do {

			if (number % 2 != 0) {
				System.out.print(number + " ");
				counter++;
			}

			number++;

		} while(counter < 100);


	}

}