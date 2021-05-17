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
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public boolean equals(Object obj) {
		
		return true;
	}
	
	

}
