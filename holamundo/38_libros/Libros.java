public class Libros {

	public static void main(String[] args) {

		Lista lista = new Lista();
		Libro s1 = new Libro("101011", "aaaaa", "bbbb");
		Libro s2 = new Libro("103345", "cccccc", "ddddd");

		lista.push(s1);
		lista.push(s2);

		lista.pop();

		lista.mostrar();

	}

}
