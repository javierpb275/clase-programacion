/**
*	@author Juan_Pardiñas_Bárbara
*/

public class ComandoIncorrecto extends Exception {

	public static final String MENSAJE = "Has introducido un comando incorrecto! Revisa la sintaxis!";

	public ComandoIncorrecto () {
		super();
	}

	public ComandoIncorrecto (String mensaje) {
		super(mensaje);
	}
}