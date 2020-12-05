public class Lista {

	Libro[] listaLibros;
	int contador;

	public Lista() {
		this.listaLibros = new Libro[100];
		this.contador = 0;
		}

	public void push(Libro l) {

		listaLibros[contador] = l;

		contador++;

		}

	public Libro pop() {

		Libro resultado = listaLibros[contador-1];

		listaLibros[contador-1] = null;

		contador--;

		return resultado;

		}

	public void mostrar() {

		for (int i = 0; i < contador; i++) {

			System.out.println(listaLibros[i]);
			
		}

	}

}
