//Construir un programa que pida al usuario una serie de números enteros,
//os almacene en un array, y obtenga el máximo y el mínimo de los valores
// almacenados.

 import java.util.Scanner;
 public class Pruebas {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int numbers[] =  new int [6];

		

		for (int i = 0; i < numbers.length; i++) {

			System.out.println("Tell me the " + i +"º" + " number");
			numbers[i] = teclado.nextInt();

		}

		int biggest = numbers[0];
        int smallest = numbers[0];

		 
        for(int i = 0; i< numbers.length; i++) {

            if(numbers[i] > biggest)
                biggest = numbers[i];

            else if (numbers[i] < smallest)
                smallest = numbers[i];

        }

                System.out.println("Largest Number is : " + biggest);
                System.out.println("Smallest Number is : " + smallest);
	}

}

	