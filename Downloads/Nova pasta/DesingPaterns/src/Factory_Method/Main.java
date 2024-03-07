package Factory_Method;

public class Main {
	public static void main(String[] args) {
		FabCarro fb = new FabCarro();
		Carro c1 = fb.newCarro("Fiat", 100);
		Carro c2 = fb.newCarro("bananao", 1);
		Carro c3 = fb.newCarro("bananao", 1000000000);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
