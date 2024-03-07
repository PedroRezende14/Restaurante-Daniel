package Factory_Method;

public class FiatUno extends Carro implements ICarro{

	public FiatUno(String marca, int nCavalo) {
		super(marca, nCavalo);
	}
	
	public String info() {
		return "Mega super iper pontente ";
	}

}
