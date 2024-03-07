package Factory_Method;

public class Carro implements ICarro {
	
	private String marca;
	private int nCavalo;
	
	public Carro(String marca, int nCavalo) {
		setMarca(marca);
		setnCavalo(nCavalo);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getnCavalo() {
		return nCavalo;
	}

	public void setnCavalo(int nCavalo) {
		this.nCavalo = nCavalo;
	}
	
	
}
