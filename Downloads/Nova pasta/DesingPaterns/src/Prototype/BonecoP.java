package Prototype;

public class BonecoP extends LojaP {
	
	protected BonecoP(BonecoP BonecoP) {
		this.valorCompra = BonecoP.getValorCompra();
	}

	public BonecoP() {
		valorCompra = 0.0;
	}
	
	@Override
	public String exibirInfo() {
		return "Modelo: Boneco Lucas neto valor " + getValorCompra();
	}

	@Override
	public LojaP clonar() {
		return new BonecoP (this);
	}
}
