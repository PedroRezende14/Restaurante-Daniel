package Builder1;

public class Main {
	public static void main(String[] args) {
		Funcionario f =new Funcionario();
		f.qIdade(18);
		f.qSalario(100);
		f.qTpSangue("A+");
		f.temDoenca(true);
		
		System.out.println(f);
	}

}
