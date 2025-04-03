package exercicio_extra_ptUm;

public class ItemBiblioteca {
	
	private String titulo;
	private Integer ano;
	private boolean disponivel;
	
	public String detalhes2() {
		return " | Titulo: " + titulo + 
			   " | Ano: " + ano + 
			   " | Disponivel: " + disponivel;
	}
	public void emprestar() {
		
	}
	
	public void devolver() {
		
	}
	
	public String detalhes() {
		return "";
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	
	

}
