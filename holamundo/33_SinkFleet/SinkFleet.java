import java.util.Random;
import java.util.Scanner;

public class SinkFleet {

	public static void main(String[] args) {

		//Tablero
		char[][] tablero = new char[10][10];

		initializeToA(tablero);

		ponerBarcoHorizontal(tablero, 3, 5, 8);

		mostrarTablero(tablero);




	
	}	

	public static void initializeToA(char[][] tablero) {

		for (int r = 0; r < tablero.length; r++) 
			for (int c = 0; c < tablero[0].length; c++) 
			tablero[r][c] = 'A';

	}

	public static void mostrarTablero(char[][] tablero) {

		for(int i = 0; i< tablero.length; i++) {

    		for(int j = 0; j< tablero[0].length; j++) {

        	System.out.print(tablero[i][j]);
        	System.out.print(" ");

    		}

    		System.out.print("\n");

		}
		
	}

	public static void ponerBarcoHorizontal(char[][] tablero, int ci, int cf, int f) {

		for(int c = ci; c <= cf; c++) 
			tablero[f][c] = 'B';

	}

	
}
