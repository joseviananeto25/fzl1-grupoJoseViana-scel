package test;

import org.junit.Test;

public class MainTest {

	@Test
	void ct01_quando_dados_validos_cadastra_com_sucesso() {
		// dado que nao existem livros cadastrados
		Biblioteca biblioteca = new Biblioteca();
		// quando um livro é cadastrado
		Livro umLivro = new Livro();
		umLivro.setAutor("Pressman");
		umLivro.setIsbn("1111");
		umLivro.setTitulo("Engenharia de Software");
		biblioteca.save(umLivro);
		// entao o total de livros cadastrados igual 1
		assertEquals(1, biblioteca.size());
	}

}
