package Abstract_Factory;

public class Fabrica implements Obra{

	@Override
	public ICasa criarCasa() {
		return new Casa();
	}

	@Override
	public IPredio criarPredio() {
		return new Predio();
	}

}
