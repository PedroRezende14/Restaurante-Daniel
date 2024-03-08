package Prototype1;

public abstract class LojaP {
	
	
	protected double valorCompra;
	public abstract String exibirInfo();
	public abstract LojaP clonar();
	public double getValorCompra() {
		return valorCompra;
}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
		}
	}
