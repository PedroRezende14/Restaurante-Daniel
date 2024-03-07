package Singleton1;

public class FabPecaPlaca implements FabricaPeca{

	@Override
	public Peca criarPeca() {
		return new PecaPlaca();
	}


}
