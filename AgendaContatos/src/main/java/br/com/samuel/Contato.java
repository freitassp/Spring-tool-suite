package br.com.samuel;

public class Contato {
	private String id;
	private String nome;
	private String telefone;
	
	
	
	public Contato(String id, String nome, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	
	public Contato() {
			}
	
	public boolean isNovo() {
		
		return id == null;
	}



	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

}
