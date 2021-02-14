public class Nodo implements Visitable {
	
	private Vivienda vivienda;

	private String fecha;

	private Mercancia articulo;

	private Estado estado;

	public Nodo(Vivienda vivienda, Mercancia articulo) {
		this.vivienda = vivienda;
		this.articulo = articulo;
		this.fecha = "13/02/2021";
		this.estado = Estado.AUSENTE;
	}

	@Override
	public void visitar(Estado estado) {

	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Vivienda getVivienda() {
		return this.vivienda;
	}

	public void setVivienda(Vivienda vivienda) {
		this.vivienda = vivienda;
	}

	public Mercancia getArticulo() {
		return this.articulo;
	}

	public void setArticulo(Mercancia articulo) {
		this.articulo = articulo;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String toString() {
		return "" + this.vivienda + " " + this.fecha + " " + this.articulo + " " + this.estado;
	}

}