package Prototype1;


public class RoupaP extends LojaP {
	
	protected RoupaP(RoupaP RoupaP) {
		this.valorCompra = RoupaP.getValorCompra();
	}

	public RoupaP() {
		valorCompra = 0.0;
	}
	
	@Override
	public String exibirInfo() {
		return "Valor da Roupa " + getValorCompra();
	}

	@Override
	public LojaP clonar() {
		return new RoupaP (this);
	}
}

