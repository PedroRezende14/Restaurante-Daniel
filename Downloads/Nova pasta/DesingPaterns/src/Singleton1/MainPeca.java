package Singleton1;

public class MainPeca {
	public static void main(String[] args) {
		
		FabricaPeca fab = new FabPecaMemoria();
		Peca peca = fab.criarPeca();
		System.out.println(peca.exibirInfo());
		
		fab = new FabPecaPlaca();
		peca = fab.criarPeca();
		System.out.println(peca.exibirInfo());
	}
}
