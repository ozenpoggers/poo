package exercicio_extra_ptUm;

import java.util.ArrayList;

public class Usuario {

	private String nome;
	private int idUsuario;
	private ArrayList<ItemBiblioteca> itensEmprestados 
				= new ArrayList<ItemBiblioteca>();
	
	public boolean emprestarItem(ItemBiblioteca item) {
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

}
