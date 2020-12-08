import java.util.Scanner;

 public class Pruebas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		double f;

		for (int i = 0 ; i <= 300 ; i++) {

			f = (5.0/9.0) * (i - 32);
			System.out.print(" " + f + ",");

		}

	}	
}