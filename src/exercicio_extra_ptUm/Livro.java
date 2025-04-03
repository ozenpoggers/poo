package exercicio_extra_ptUm;

public class Livro extends ItemBiblioteca {

	private String autor;
	private String isbn;
	private Integer numeroPaginas;
	
	public Livro(String autor, String isbn, int numeroPaginas) {
		this.autor = autor;
		this.isbn = isbn;
		this.numeroPaginas = numeroPaginas;
	}
	
	public String detalhes() {
		return " | Autor: " + autor + 
			   " | ISBN: " + isbn + 
			   " | Paginas: " + numeroPaginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

}
