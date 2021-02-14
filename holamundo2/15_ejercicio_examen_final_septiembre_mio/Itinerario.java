public class Itinerario {
	
	private Nodo[] arrayDeNodos;

	private final int TOTAL_NODOS = 20;

	private int contador;

	public Itinerario(){
		this.arrayDeNodos = new Nodo[TOTAL_NODOS];
		this.contador = 0;
	}

	public void addNodo(Nodo nodo) throws ItinerarioLleno {
		if (this.contador == TOTAL_NODOS) {	
			throw new ItinerarioLleno();
		} else{
			this.arrayDeNodos[contador] = nodo;
			this.contador++;
		}
	}

	public int countNodos() {
		return this.contador;
	}

	public void modificaEstadoNodo(int numNodo, Estado estado) {
		this.arrayDeNodos[numNodo].setEstado(estado);
	}

	public void muestraNodo(int numNodo) {
		System.out.println(this.arrayDeNodos[numNodo]);
	}

	public void borrarTodosNodos() {
		for (int i = 0; i < this.contador; i++) {
			this.arrayDeNodos[i] = null;
		}
		this.contador = 0;
	}

	public void cuentaEntregados() {
		int contador = 0;
		for (int i = 0; i < this.contador; i++) {
			if (this.arrayDeNodos[i].getEstado() == Estado.ENTREGADO)
			System.out.println(this.arrayDeNodos[i]);
			contador++;
		}
		System.out.println("Nodos Entregados: " + contador);
	}

	public void calculaTotal() {
		int dineroRecaudado = 0;
		for (int i = 0; i < this.contador; i++) {
			if (this.arrayDeNodos[i].getEstado() == Estado.ENTREGADO)
			dineroRecaudado += this.arrayDeNodos[i].getArticulo().getPrecio();
		}
		System.out.println("Dinero Recaudado: " + dineroRecaudado);
	}


	public Nodo[] getArrayDeNodos() {
		return this.arrayDeNodos;
	}

	public void setArrayDeNodos(Nodo[] arrayDeNodos) {
		this.arrayDeNodos = arrayDeNodos;
	}

	public int getContador() {
		return this.contador;
	}


}