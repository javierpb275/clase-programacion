//Pedir 10 números al usuario, guardarlos en un array y luego mostrarlos por pantalla
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int myArray[] = new int[10];

		for (int i = 0; i < myArray.length; i++) {

			System.out.println("Tell me a number:");

			myArray[i] = sc.nextInt();

			System.out.println("");
			
		}

		System.out.println("");

		for (int i = 0; i < myArray.length; i++) {

			System.out.print(myArray[i] + " ");

		}

	}
}