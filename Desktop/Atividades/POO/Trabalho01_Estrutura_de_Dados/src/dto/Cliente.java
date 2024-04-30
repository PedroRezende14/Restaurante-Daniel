package dto;

public class Cliente {
	public String nome;
	 public int idade;
	 public int cpf;
	public Cliente proximo;
	
	public Cliente(String nome, int idade, int cpf) {
		this.nome=nome;
		this.idade=idade;
		this.cpf =cpf;
		 this.proximo = null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}
