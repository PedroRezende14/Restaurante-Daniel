package Singleton;

public class MainFuncionario {
	public static void main ( String [] args ) {
		FabricaDeFuncionario fun = new FabricaFuncionarioLimpeza();
		Funcionario Funcionario = fun.novoFuncionario();
		System.out.println(Funcionario.exibirInfo());
		
		fun = new FabricaFuncionarioMecanico();
		Funcionario = fun.novoFuncionario();
		System.out.println(Funcionario.exibirInfo());
	}
}
