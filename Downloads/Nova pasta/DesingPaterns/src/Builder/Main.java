package Builder;

public class Main {

	public static void main(String[] args) {
		Endereco end = new Endereco();
	
		end.naRua("x");
		end.noNumero(195);
		end.noCep(11);
		end.naCidade("rio do sul");
		end.noBairro("barragem");
		System.out.println(end);
		
		
	}
}
