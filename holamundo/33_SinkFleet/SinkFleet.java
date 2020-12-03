import java.util.Random;
import java.util.Scanner;

public class SinkFleet {

	public static void main(String[] args) {

		char[][] tablero = new char[10][10];

		initializeToA(tablero);

		ponerBarcoHorizontal(tablero, 3, 5, 8);

		ponerBarcoVertical(tablero, 2, 4, 6);

		disparo2(tablero, "A3");

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

	public static void ponerBarcoHorizontal(char[][] tablero, int f, int ci, int cf) {

		if(ci > cf) {
			int aux;
			aux = ci;
			ci = cf;
			cf = aux;
		}

		for(int c = ci; c <= cf; c++) 
			tablero[f][c] = 'B';

	}

	public static void ponerBarcoVertical(char[][] tablero, int c, int fi, int ff) {

		if(fi > ff) {
			int aux;
			aux = fi;
			fi = ff;
			ff = aux;
		}

		for(int f = fi; f <= ff; f++) 
			tablero[f][c] = 'B';

	}

	public static void disparo(char[][] tablero, int fila, int columna) {

		if (tablero[fila][columna] == 'A')
			tablero[fila][columna] = 'X';
		else if (tablero[fila][columna] == 'B')
			tablero[fila][columna] = 'T';

	}

	public static boolean estaHundido(char[][] tablero) {

		boolean hundido = true;

		for (int r = 0; r < tablero.length; r++) 
			for (int c = 0; c < tablero[0].length; c++) {

			if (tablero[r][c] == 'B')
				hundido = false;

			}

		return hundido;

	}

	public static void disparo2(char[][] tablero, String coordenada) {

		char c1 = coordenada.charAt(0);
		char c2 = coordenada.charAt(1);

		int d1 = (int) (c1 - 'A');
		int d2 = (int) (c2 - '0');

		disparo(tablero, d1, d2);

	}

}
