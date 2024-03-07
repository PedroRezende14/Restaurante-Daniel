package Builder1;

public class Funcionario {
	
	private boolean doenca=false;
	private String tpSangue;
	private int idade;
	private float salario;
	
	
	public Funcionario temDoenca(boolean doenca) {
		this.doenca = doenca;
		
		if(doenca){
			System.out.println("Procure um medic");
		}
			return this;
	}

	public Funcionario qTpSangue (String tpSangue) {
		this.tpSangue=tpSangue;
		return this;
	} 
	public Funcionario qIdade (int idade) {
		this.idade=idade;
		return this;
	}
	public Funcionario qSalario (float salario){
		this.salario=salario;
		return this;
	}

	public boolean isDoenca() {
		return doenca;
	}

	public void setDoenca(boolean doenca) {
		this.doenca = doenca;
	}

	public String getTpSangue() {
		return tpSangue;
	}

	public void setTpSangue(String tpSangue) {
		this.tpSangue = tpSangue;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [doenca=");
		builder.append(doenca);
		builder.append(", tpSangue=");
		builder.append(tpSangue);
		builder.append(", idade=");
		builder.append(idade);
		builder.append(", salario=");
		builder.append(salario);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}	
	
}
