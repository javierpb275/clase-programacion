public class Soldador extends Persona {

	String titulo;

	@Override
	public String getDatos() {
		return super.getDatos() + " " + titulo;
	}

}
