package dto;

public class Funcionario {
	public String funcao;
	public int cpf;
	public String nome;
	public Funcionario proximo;
	
	public Funcionario(String nome, String funcao, int cpf) {
		this.nome=nome;
		this.funcao=funcao;
		this.cpf =cpf;
		 this.proximo = null;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
