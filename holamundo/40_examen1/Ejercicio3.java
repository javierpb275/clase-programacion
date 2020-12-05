//Realiza un programa con un método que devuelva la media de todos los valores de un array.
//Parámetro de entrada: Un array de n elementos
//Parámetros salida: double
public class Ejercicio3 {

	public static void main(String[] args) {

		double myArray[] = new double[3];
		myArray[0] = 5.57;
		myArray[1] = 7.83;
		myArray[2] = 9.90;

		System.out.println(myArrayAverage(myArray));

	}

	public static double myArrayAverage(double[] myArray) {

		double sum = 0;

		for (int i = 0; i < myArray.length; i++) 
			sum += myArray[i];
		
		double average = sum / myArray.length;

		return average;

	}

}