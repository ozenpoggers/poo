package exercicio_extra_ptUm;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		String nomeAutor
			= JOptionPane.showInputDialog("Informe o nome do autor:");
		
		Livro l1 = new Livro(nomeAutor, "12345", 50);
		l1.setTitulo("Java 2 para Web");
		l1.setAno(2077);
		System.out.println(l1.detalhes());
		System.out.println(l1.detalhes2());
		
		Revista r1 = new Revista();
		r1.setTitulo("Naruto");
		r1.setPeriodicidade("Semanal");
		r1.setEditora("Abril");
		r1.setNumero(4);
		r1.setAno(2077);
		System.out.println(r1.detalhes());
		System.out.println(r1.detalhes2());
		
		Usuario u1 = new Usuario();
		u1.setNome("Molina");
		u1.setIdUsuario(1);
		
		u1.emprestarItem(r1);
		u1.emprestarItem(l1);
		
		
		
		
	}

}
