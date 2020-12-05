public class Libro {

	String isbn;
	String titulo;
	String autor;

	public Libro(String isbn, String titulo, String autor) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
	}

	public boolean equals(Libro l) {

		return (this.isbn.equals(l.isbn) && this.titulo.equals(l.titulo) 
			&& this.autor.equals(l.autor));

	}

	public String toString() {

		return "ISBN: " + isbn + ", Titulo: " + titulo + ", Autor: " + autor;

	}

}
