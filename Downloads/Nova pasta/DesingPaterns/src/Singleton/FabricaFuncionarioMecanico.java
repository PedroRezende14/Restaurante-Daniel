package Singleton;

public class FabricaFuncionarioMecanico implements FabricaDeFuncionario{

	public Funcionario novoFuncionario() {
		return new FuncionarioMecanico();
	}
}
