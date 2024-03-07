package Builder;

public class Main1 {
	public static void main(String[] args) {
		Endereco end = new Endereco();
	
		end.naRua("x");
		end.noNumero(195);
		System.out.println(end);
	}
}