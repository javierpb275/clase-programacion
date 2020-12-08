/**
*	@author Juan_Pardiñas_Bárbara
*
*	He tenido que poner las vocales para comprobar en mayusculas y minusculas debido
*	a que desconozco un metodo para caracteres que compruebe ignorando estos parametros
*	como, por ejemplo, el de Strings 'equalIgnoreCase' (el cual no puedo usar debido a que
*	aún poniendo las vocales en un array de Strings, al recoger con 'charAt()' intenta
*	comparar un caracter con un string). Si hubiese podido buscar informacion estoy seguro
*	que podría haber encontrado alguna forma mejor que utilizar 3 bucles anidados.
*
*/



public class Texto {

	//Final variables
	private static final int MAX_LINES = 10;
	private static final char[] VOCALS = {'A','E','I','O','U','a','e','i','o','u'};

	//Variables
	private int maxCharacters;
	private String[] textArray;
	private int numberOfLines;

	//Constructor
	public Texto (int maxCharacters) {
		this.textArray = new String[MAX_LINES];
		this.numberOfLines = 0;
		this.maxCharacters = maxCharacters;
	}

	//Getters
	public int getMaxCharacters () {
		return this.maxCharacters;
	}

	public String getText (int textLine) {
		return this.textArray[textLine];
	}


	//Method that returns the number of lines in the object
	public int numeroLineas () {
		return this.numberOfLines;
	}

	//Method that returns the number of characters in a line
	public int tamanoLinea (String linea) {
		return linea.length();
	}

	//Method that returns the number of characters of the whole text
	public int tamano () {

		//Local Variable
		int totalCharacters;

		//Initialization
		totalCharacters = 0;

		//Bucle that plus the characters of the lines in a local variable
		for (int a = 0; a < numeroLineas(); a++) {
			totalCharacters = totalCharacters + tamanoLinea (this.textArray[a]);
		}

		return totalCharacters;
	}

	//Method that returns true if a new line can be created
	public boolean sePuedeAnadir (String linea){

		/*
		* Check two things:
		* 	- If the number of lines is less than the max
		* 	- If the number of total characters will be not exceed
		*/

		if (this.numberOfLines < 10 && 
			(tamanoLinea (linea) <= (getMaxCharacters() - tamano()))){

			return true;
		} else {

			return false;
		}
	}

	//Method that add a line and returns a boolean
	public boolean anadirLinea (String linea) {

		//Call 'sePuedeAnadir' method to check before add the string to the array
		if (sePuedeAnadir (linea)){

			this.textArray[this.numberOfLines] = linea;
			this.numberOfLines++;

			return true;

		} else {
			return false;
		}

	}

	//Method that count the vocals of the whole text
	public int contarVocales () {

		//Local variable
		int totalVocals;

		//Initialization
		totalVocals = 0;

		//Nested bucles that compares every character of every line with the vocals list
		for (int a = 0; a < numeroLineas(); a++) {
			for (int b = 0; b < this.textArray[a].length(); b++) {
				for (int c = 0; c < 10; c++) {
					if (this.textArray[a].charAt(b) == (this.VOCALS[c])) {
						totalVocals++;
					}
				}
			}
		}
		
		return totalVocals;
	}

	//Method that return the non vocal characters
	public int contarNoVocales () {
		return tamano() - contarVocales();
	}

	//Method that shows the whole text
	public void mostrar () {

		System.out.println();

		//Bucle that prints every line in the console
		for (int a = 0; a < numeroLineas(); a++){
			System.out.println(getText(a));
		}
	}
}