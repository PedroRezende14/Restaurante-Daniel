package lista;
import dto.*;
public class ListFuncionario {
	Funcionario primeiro;

	public ListFuncionario() {
		this.primeiro= null;
	}
	public void cadastrarFuncionario(String nome, String funcao, int cpf) {
		Funcionario novoFuncionario = new Funcionario(nome, funcao, cpf);
		
		if(primeiro==null) {
			primeiro = novoFuncionario;
		}
		else {
			Funcionario atual = primeiro;
			while (atual.proximo!=null) {
				atual = atual.proximo;
			}
			atual.proximo= novoFuncionario;
		}
	}
	public void removerFuncionario(int cpf) {
        if (primeiro == null) {
            System.out.println("Lista de Funcionarios vazia.");
            return;
        }

        if (primeiro.cpf==cpf) {
            primeiro = primeiro.proximo;
            return;
        }

        Funcionario anterior = primeiro;
        
        Funcionario atual = primeiro.proximo;
        while (atual != null) {
            if (atual.cpf==cpf) {
                anterior.proximo = atual.proximo;
                return;
            }
            anterior = atual;
            atual = atual.proximo;
        }
        System.out.println("Funcionario n encontrado");
    }
	public void atualizarFuncionario(int cpfAntigo, String novoNome,String novaFuncao, int novoCpf) {
		 Funcionario atual = primeiro;
		 while (atual != null) {
			 if (atual.cpf==cpfAntigo) {
				 atual.nome=novoNome;
				 atual.cpf=novoCpf;
				 atual.funcao=novaFuncao;
				 return;
			 }
			 atual=atual.proximo;
		 }
		 System.out.println("Funcionario n ncontrado");
	}
	
	 public void consultarFuncionarios() {
	        if (primeiro == null) {
	            System.out.println("Lista de Funcionarios vazia.");
	            return;
	        }

	        System.out.println("Funcionarios cadastrados:");
	        Funcionario atual = primeiro;
	        while (atual != null) {
	            System.out.println("Nome: " + atual.nome + " Cpf: " + atual.cpf + " Funcao " + atual.funcao);
	            atual = atual.proximo;
	        }
	
	 }
}
