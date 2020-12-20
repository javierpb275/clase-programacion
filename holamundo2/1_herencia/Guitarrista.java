public class Guitarrista extends Musico {

	String nombreGuitarra;

	@Override
	public String getNombreApellidos() {
		return nombre + ":" + apellidos;
	}

}
