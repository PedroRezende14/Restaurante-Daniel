package Abstract_Factory;

public class Main {

	public static void main(String[] args) {
		Fabrica f = new Fabrica();
		Casa c = (Casa) f.criarCasa();
		Predio p = (Predio) f.criarPredio();
		
		c.exibirInfo();
		p.exibirInfo();
	}

}
