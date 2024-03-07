package Singleton;

public class FabricaFuncionarioLimpeza implements FabricaDeFuncionario{
	@Override
	public Funcionario novoFuncionario() {
		return new FuncionarioLimpeza();
	}
}
