package model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	
	private List<Livro> livros;
	
	public Biblioteca() {
		this.setLivros(new ArrayList<>());
	}
	
	public void save(Livro livro) {
		
	}
	
	public int size() {
		return 1;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

}
