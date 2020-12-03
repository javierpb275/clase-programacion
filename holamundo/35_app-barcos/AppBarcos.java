import java.util.Scanner;

public class AppBarcos {

	public static void main(String[] args) {

		Barco[] myArray = new Barco[10];
		Scanner sc = new Scanner(System.in);
		Barco aux;

		for (int i = 0; i < myArray.length; i++) {

			aux = new Barco();

			System.out.println("Nombre:");
			aux.nombre = sc.nextLine();
			System.out.println("Matricula:");
			aux.matricula = sc.nextLine();

			myArray[i] = aux;
			
		}

		for (int i = 0; i < myArray.length; i++) {

			myArray[i].mostrar();
			
		}


		
	}

}
