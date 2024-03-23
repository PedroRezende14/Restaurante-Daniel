package MercadinhoDoCurvello;

import java.sql.Date;

public class Mercadorias <T>{
	private T id;
	private float valor;
	private Date dataFabricacao;
	private Date dataVencimento;
	
	public Mercadorias(T id, float valor, Date dataFabricacao, Date dateVencimento) {
		this.id = id;
		this.valor = valor;
		this.dataFabricacao = dataFabricacao;
		this.dataVencimento = dataVencimento;
	}

	
	public T getId() {
		return id;
	}


	public void setId(T id) {
		this.id = id;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	public Date getDataFabricacao() {
		return dataFabricacao;
	}


	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}


	public Date getDataVencimento() {
		return dataVencimento;
	}


	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mercadorias [id=");
		builder.append(id);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", dataFabricacao=");
		builder.append(dataFabricacao);
		builder.append(", dataVencimento=");
		builder.append(dataVencimento);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
