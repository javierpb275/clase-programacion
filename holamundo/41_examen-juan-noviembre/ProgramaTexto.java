/**
*	@author Juan_Pardiñas_Bárbara
*
*	- Incluye dos metodos de prueba con diferentes textos que llaman a todos
*	  los metodos
*
*/

public class ProgramaTexto {

	//Example with no text added
	public static void textWithNoInfo (Texto text1) {
		/*
    	*	Calling methods with no info
    	*/

    	System.out.println("\n--Metodo de prueba con poca informacion: \n");

    	//Print 0
    	System.out.println("Numero de lineas: " + text1.numeroLineas());

    	//Print the size of the text (23 with the example 'Hola esto es una prueba')
    	System.out.println("Numero de caracteres en la frase 'Hola esto es una prueba': " 
    		+ text1.tamanoLinea("Hola esto es una prueba"));

    	//Print 0
    	System.out.println("Tamano sin texto anadido: " 
    		+ text1.tamano());

    	//Return true if not exceed the maxCharactersExample variable
    	System.out.println("Se puede anadir el texto 'Prueba 1?': " 
    		+ text1.sePuedeAnadir("Prueba 1"));

    	//Return true if not exceed the maxCharactersExample variable and add the line
    	System.out.println("No excede el limite de caracteres y anade el texto 'PrUeba 2': " 
    		+ text1.anadirLinea("PrUeba 2"));

    	//Count 3 vocals with the text 'PrUeba 2'
    	System.out.println("Numero de vocales del texto anterior: " 
    		+ text1.contarVocales());

    	//Count 5 non vocals with the line 'PrUeba 2'
    	System.out.println("Numero de no vocales del texto anterior: " 
    		+ text1.contarNoVocales());

    	//Print the lines ('PrUeba 2' with the example)
    	System.out.println("\n--Mostrando todas las lineas: ");
    	text1.mostrar();
	}

	//Example with more lines and text
	public static void textWithInfo (Texto text2) {
		/*
    	*	Calling methods with more info
    	*/

    	System.out.println("\n--Metodo de prueba con mas informacion: \n");

    	//Add some lines
    	text2.anadirLinea("PrUeba 1 con mas texto");
    	text2.anadirLinea("PrUeba 2 menor");
    	text2.anadirLinea("PrUeba 3 AnaDiendo Mas MaYusculas");
    	text2.anadirLinea("PrUeba 4");
    	text2.anadirLinea("PrUeba 5");

    	//Print the lines
    	System.out.println("\n--Mostrando todas las lineas: ");
    	text2.mostrar();

    	//Print the number of lines
    	System.out.println("\nNumero de lineas: " + text2.numeroLineas());

    	//Print the number of characters
    	System.out.println("Numero de caracteres total: " + text2.tamano());

    	//Ask if two text can be added with the limit of characters
    	System.out.println("Se puede anadir el texto 'hola1' cuando el numero maximo" 
    		+ " de caracteres es 90?: " + text2.sePuedeAnadir("hola1"));
    	System.out.println("Y el texto 'Hola!, que tal?' ?: " 
    		+ text2.sePuedeAnadir("Hola!, que tal?"));

    	//Count the number of vocals
    	System.out.println("Vocales en total: " 
    		+ text2.contarVocales());

    	//Count the number of non vocals
    	System.out.println("Numero de no vocales: " 
    		+ text2.contarNoVocales());

	}


    public static void main (String[] args) {

    	//Local Variables
    	Texto text1;
    	Texto text2;
    	int maxCharactersExample1;
    	int maxCharactersExample2;


    	//Initialization
    	maxCharactersExample1 = 40;
    	maxCharactersExample2 = 90;
    	text1 = new Texto(maxCharactersExample1);
    	text2 = new Texto(maxCharactersExample2);

    	//Call example methods
    	textWithNoInfo(text1);
    	textWithInfo(text2);
    	
    	
    }

}
