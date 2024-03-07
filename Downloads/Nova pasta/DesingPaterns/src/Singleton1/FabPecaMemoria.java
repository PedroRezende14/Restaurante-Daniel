package Singleton1;

public class FabPecaMemoria implements FabricaPeca{

	@Override
	public Peca criarPeca() {
		return new PecaMemoria();
	}

}
