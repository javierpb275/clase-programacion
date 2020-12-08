/**
*	@author Juan_Pardiñas_Bárbara
*/

public class AlmacenIncorrecto extends Exception {

	public static final String MENSAJE = "Has introducido un numero de almacen incorrecto! Recuerda que solo hay 2 disponibles! El 0 y el 1";

	public AlmacenIncorrecto () {
		super();
	}

	public AlmacenIncorrecto (String mensaje) {
		super(mensaje);
	}
}