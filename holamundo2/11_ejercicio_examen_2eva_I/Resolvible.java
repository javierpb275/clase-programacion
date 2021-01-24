public interface Resolvible {

	public boolean expresionEsCorrecta(String expresion) 
		throws ExpresionIncorrecta, ExpresionMuyLarga, ExpresionVacia;

	public int getResultado() 
		throws ExpresionIncorrecta, ExpresionMuyLarga, ExpresionVacia;

}
