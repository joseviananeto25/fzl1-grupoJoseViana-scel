package model;

public class Livro {

	private String isbn;
	private String titulo;
	private String autor;

	public String getIsbn() {
		return isbn;
	}

	public String setIsbn(String isbn) {
		String mensagem = null;
		if ("".equals(isbn)) {
			mensagem = "Informações inválidas";
		} else {
			this.isbn = isbn;
		}

		return mensagem;

	}

	public String getTitulo() {
		return titulo;
	}

	public String setTitulo(String titulo) {
		String mensagem = null;
		if ("".equals(titulo)) {
			mensagem = "Informações inválidas";
		} else {
			this.titulo = titulo;
		}

		return mensagem;
	}

	public String getAutor() {
		return autor;
	}

	public String setAutor(String autor) {
		String mensagem = null;
		if ("".equals(autor)) {
			mensagem = "Informações inválidas";
		} else {
			this.autor = autor;
		}

		return mensagem;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (autor == null) {
			if (other.autor != null)
				return false;
		} else if (!autor.equals(other.autor))
			return false;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}

}
