import java.util.Random;
import java.util.Scanner;

public class Matriz2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//Two dimensional array:
		int[][] twoD_arr = new int[10][10];

		initializeRandom(twoD_arr);

		diagonal(twoD_arr);

		showMultidimensionalArray(twoD_arr);

		System.out.println("Tell me the number you want to count:");

		int number = sc.nextInt();

		countNumberInArray(twoD_arr, number);
	
	}	

	public static void initializeTo0(int[][] twoD_arr) {

		for (int r = 0; r < twoD_arr.length; r++) {
			for (int c = 0; c < twoD_arr[0].length; c++) {
			twoD_arr[r][c] = 0;
			}
		}

	}

	public static void initializeRandom(int[][] twoD_arr) {

		Random rand = new Random(System.nanoTime());

		for (int r = 0; r < twoD_arr.length; r++) {

			for (int c = 0; c < twoD_arr[0].length; c++) {

			twoD_arr[r][c] = rand.nextInt(10);

			}
		}


	}

	public static void showMultidimensionalArray(int[][] twoD_arr) {

		for(int i = 0; i< twoD_arr.length; i++) {

    		for(int j = 0; j< twoD_arr[0].length; j++) {

        	System.out.print(twoD_arr[i][j]);
        	System.out.print(" ");

    		}

    		System.out.println(" ");

		}

	}

	public static int countNumberInArray(int[][] twoD_arr, int number) {

		int counter = 0;

		for(int i = 0; i< twoD_arr.length; i++) {

    		for(int j = 0; j< twoD_arr[0].length; j++) {

    			if (twoD_arr[i][j] == number) 
    				counter++;

    		}

		}

		System.out.println("Found " + counter + " times the number " + number);

		return counter;

	}

	public static void diagonal(int[][] twoD_arr) {

		for(int i = 0; i< twoD_arr.length; i++) {

    		twoD_arr[i][i] = 0;

		}
	}
}
