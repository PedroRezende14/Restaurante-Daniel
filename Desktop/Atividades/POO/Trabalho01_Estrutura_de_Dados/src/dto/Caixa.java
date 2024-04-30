package dto;

public class Caixa {
	public int cpf;
	public int valor;
	public int nota;
	public Caixa proximo;
	
	
	public Caixa(int cpf, int valor, int nota) {
		this.valor=valor;
		this.cpf =cpf;
		 this.proximo = null;
	}

	
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
}
