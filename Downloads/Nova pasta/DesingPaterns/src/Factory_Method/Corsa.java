package Factory_Method;

public class Corsa extends Carro implements ICarro{

	public Corsa(String marca, int nCavalo) {
		super(marca, nCavalo);
	}
	
	public String info() {
		return	"POTENTE";
	}

}
