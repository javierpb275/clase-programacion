/**
*	@author Juan_Pardiñas_Bárbara
*/

import java.util.ArrayList;
import java.util.List;

public abstract class Lienzo {

	//Final Variables
	private final int TABLERO_TAMANO = 9;
	private final int ALMACEN_TAMANO = 2;

	//Global Variables
	protected char[][] tableroLienzo;
	protected char[][][] almacenLienzo;

	//Constructor
	public Lienzo () {
		inicializar();
	}

	//Initialize method
	private void inicializar () {

		this.tableroLienzo = new char[TABLERO_TAMANO][TABLERO_TAMANO];
		this.almacenLienzo = new char[ALMACEN_TAMANO][TABLERO_TAMANO][TABLERO_TAMANO];

		//Tablero
		for (int a = 0; a < this.tableroLienzo.length; a++){
			for (int b = 0; b < this.tableroLienzo[0].length; b++){
				this.tableroLienzo[a][b] = ' ';
			}//For b
		}//For a

		//Almacenes
		for (int a = 0; a < 2; a++) {
			for (int b = 0; b < this.almacenLienzo[0].length; b++){
				for (int c = 0; c < this.almacenLienzo[0][0].length; c++){
					this.almacenLienzo[a][b][c] = this.tableroLienzo[b][c];
				}//For c
			}//For b
		}//For a

	}

	//Prints in the console the values
	public void mostrar () {

		System.out.println("\n");
		System.out.println("***************Tablero***************");

		for (int a = 0; a < this.tableroLienzo.length; a++){
			System.out.print("\n| ");
			for (int b = 0; b < this.tableroLienzo[0].length; b++){
				System.out.print(this.tableroLienzo[a][b] + " | ");

			}//For b
		}//For a
	}

	//Method that interacts with the user
	public abstract void interactua ();

}