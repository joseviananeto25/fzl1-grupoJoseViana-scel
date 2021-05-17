package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import model.Biblioteca;
import model.Livro;

public class MainTest {

	@Test
	public void ct01_quando_dados_validos_cadastra_com_sucesso() {
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

	@Test
	public void ct02_cadastrar_livro_com_isbn_ja_cadastrado() {
		// dado que nao existem livros cadastrados
		Biblioteca biblioteca = new Biblioteca();
		// quando um livro é cadastrado
		Livro umLivro = new Livro();
		umLivro.setAutor("Pressman");
		umLivro.setIsbn("1111");
		umLivro.setTitulo("Engenharia de Software");
		biblioteca.save(umLivro);
		List<Livro> lista = biblioteca.getLivros();
		// entao
		Livro re = new Livro();
		re.setAutor("Pressman");
		re.setIsbn("1111");
		re.setTitulo("Engenharia de Software");
		assertTrue(re.equals(lista.get(0)));
	}
	
	@Test
	public void ct03_cadastrar_livro_com_isbn_em_branco() {
		Livro umLivro = new Livro();
		umLivro.setAutor("Pressman");
		assertEquals("Informações inválidas", umLivro.setIsbn(""));
	}
	
	@Test
	public void ct04_cadastrar_livro_com_titulo_em_branco() {
		Livro umLivro = new Livro();
		umLivro.setAutor("Pressman");
		assertEquals("Informações inválidas", umLivro.setTitulo(""));
	}

}
