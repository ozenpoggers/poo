package exercicio_extra_ptUm;

public class Revista extends ItemBiblioteca {

	private int numero;
	private String periodicidade;
	private String editora;
	
	public String detalhes() {
		return " | Periodicidade " + periodicidade +
			   " | Numero: " + numero + 
			   " | Editora: " + editora;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPeriodicidade() {
		return periodicidade;
	}

	public void setPeriodicidade(String periodicidade) {
		this.periodicidade = periodicidade;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

}
