/**
*	@author Juan_Pardiñas_Bárbara
*/

public class CoordenadaIncorrecta extends Exception {

	public static final String MENSAJE = "Has introducido mal las coordenadas! Comprueba la sintaxis del comando!";

	public CoordenadaIncorrecta () {
		super();
	}

	public CoordenadaIncorrecta (String mensaje) {
		super(mensaje);
	}
}