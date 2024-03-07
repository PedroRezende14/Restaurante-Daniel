package Builder;

public class Endereco {
	
	private String rua;
	private int numero;
	private int cep;
	private String barrio;
	private String cidade;
	
	public Endereco naRua(String rua) {
		this.rua = rua;
		return this;
	}
	
	public Endereco noNumero(int numero){
		this.numero=numero;
		return this;
	}
	
	public Endereco noCep (int cep) {
		this.cep=cep;
		return this;
	}
	public Endereco noBairro(String bairro) {
		this.barrio= bairro;
		return this;
	}
	public Endereco naCidade(String cidade) {
		this.cidade=cidade;
		return this;		
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Endereco [rua=");
		builder.append(rua);
		builder.append(", numero=");
		builder.append(numero);
		builder.append(", cep=");
		builder.append(cep);
		builder.append(", barrio=");
		builder.append(barrio);
		builder.append(", cidade=");
		builder.append(cidade);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}	
