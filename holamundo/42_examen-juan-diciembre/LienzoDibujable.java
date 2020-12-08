/**
*	@author Juan_Pardiñas_Bárbara
*/
import java.util.Scanner;

public class LienzoDibujable extends Lienzo implements Dibujable {

	//Constructor
	public LienzoDibujable () {
		super();
	}

	//Method that interacts with the user
	public void interactua () {

		//Keyboard
		Scanner teclado = new Scanner (System.in);
		//Variables
		String entradaTeclado;

		do {
			//Prints the info
			mostrar();

			System.out.println("\n\nEjecuta la orden que desesees escribiendola: ");
			System.out.println("- Dibuja x,y");
			System.out.println("- Borra x,y");
			System.out.println("- Guarda numeroAlmacen (0 o 1)");
			System.out.println("- Recupera numeroAlmacen");
			System.out.println("- FIN\n");
			System.out.print("Escribe orden: ");

			//Get next user keyboard inputs
			entradaTeclado = teclado.nextLine();

			//Try to convert the String to a readable command and execute it
			try {
				ejecutaComando(entradaTeclado);
			} catch (CoordenadaIncorrecta e) {
				System.out.println(e.getMessage());
			} catch (ComandoIncorrecto e) {
				System.out.println(e.getMessage());
			} catch (AlmacenIncorrecto e) {
				System.out.println(e.getMessage());
			}
			
			//If the input equals "Fin" stops the bucle
		} while (!entradaTeclado.equalsIgnoreCase("FIN"));
		

	}

	//Method that set '*'
	public void dibuja (int x, int y) {
		this.tableroLienzo[x][y] = '*';
	}

	//Method that set ' '
	public void borra (int x, int y) {
		this.tableroLienzo[x][y] = ' ';
	}

	//Method that saves the 'Lienzo' in the almacen
	public void guarda (int almacen) {

		for (int a = 0; a < this.almacenLienzo[0].length; a++){
			for (int b = 0; b < this.almacenLienzo[0][0].length; b++){
				this.almacenLienzo[almacen][a][b] = this.tableroLienzo[a][b];
			}//For b
		}//For a
	}

	//Method that recovers a 'Lienzo' from the almacen
	public void recupera (int almacen) {

		for (int a = 0; a < this.almacenLienzo[0].length; a++){
			for (int b = 0; b < this.almacenLienzo[0][0].length; b++){
				this.tableroLienzo[a][b] = this.almacenLienzo[almacen][a][b];
			}//For b
		}//For a

	}

	//Method that reads a String and executes a command
	public void ejecutaComando (String comando) throws CoordenadaIncorrecta, ComandoIncorrecto, AlmacenIncorrecto {

		//Variables
		int x;
		int y;
		char checkCharacters;
		int counter;
		boolean finTexto;
		String textoComando;

		//Initialization
		counter = 0;
		checkCharacters = 'a';
		finTexto = false;
		textoComando = " ";


		//While command to get the number of characters of the command
		while (comando.length() > counter && !finTexto) {
			checkCharacters = comando.charAt(counter);
			if (checkCharacters == ' '){
				finTexto = true;
			}
			counter++;
		}

		//Si el bucle sale por el boolean se debe restar 1
		if (finTexto){
			counter--;
		}

		//Set the text of the command to uppercase
		if (comando.length() > 0){
			textoComando = comando.substring(0,counter).toUpperCase();
		}

		
		//Switch with the different commands
		switch (textoComando) {

			case "DIBUJA":
				try {
					x = Integer.parseInt(comando.substring(7,8));									
					y = Integer.parseInt(comando.substring(9,10));
					dibuja (x, y);
				} catch (NumberFormatException e) {
					throw new CoordenadaIncorrecta(CoordenadaIncorrecta.MENSAJE);
				} catch (StringIndexOutOfBoundsException e) {
					throw new ComandoIncorrecto(ComandoIncorrecto.MENSAJE);
				}
				break;

			case "BORRA":
				try {
					x = Integer.parseInt(comando.substring(6,7));									
					y = Integer.parseInt(comando.substring(8,9));
					borra (x, y);
				} catch (NumberFormatException e) {
					throw new CoordenadaIncorrecta(CoordenadaIncorrecta.MENSAJE);
				} catch (StringIndexOutOfBoundsException e) {
					throw new ComandoIncorrecto(ComandoIncorrecto.MENSAJE);
				}
				break;

			case "GUARDA":
				try {
					x = Integer.parseInt(comando.substring(7,8));									
					guarda (x);
				} catch (NumberFormatException e) {
					throw new AlmacenIncorrecto(AlmacenIncorrecto.MENSAJE);
				} catch (StringIndexOutOfBoundsException e) {
					throw new ComandoIncorrecto(ComandoIncorrecto.MENSAJE);
				}
				break;

			case "RECUPERA":
				try {
					x = Integer.parseInt(comando.substring(9,10));									
					recupera (x);
				} catch (NumberFormatException e) {
					throw new AlmacenIncorrecto(AlmacenIncorrecto.MENSAJE);
				} catch (StringIndexOutOfBoundsException e) {
					throw new ComandoIncorrecto(ComandoIncorrecto.MENSAJE);
				}
				break;

			case "FIN":
				System.out.println("\nHasta pronto!");
				break;

			default:
				throw new ComandoIncorrecto(ComandoIncorrecto.MENSAJE);

		}

	}

}