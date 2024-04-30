package lista;
import dto.*;

public class ListClient {
	Cliente primeiro;
	public int nCliente;
	public ListClient() {
        this.primeiro = null;
    }

	public void cadastrarCliente(String nome, int idade, int cpf) {
		Cliente novoCliente = new Cliente(nome, idade, cpf);
		
		if(primeiro==null) {
			primeiro = novoCliente;
		}
		else {
			Cliente atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoCliente;
		}
		nCliente++;
	}
	
	public void removerCliente(int cpf) {
        if (primeiro == null) {
            System.out.println("Lista de clientes vazia.");
            return;
        }

        if (primeiro.cpf==cpf) {
            primeiro = primeiro.proximo;
            return;
        }

        Cliente anterior = primeiro;
        
        Cliente atual = primeiro.proximo;
        while (atual != null) {
            if (atual.cpf==cpf) {
                anterior.proximo = atual.proximo;
                return;
            }
            anterior = atual;
            atual = atual.proximo;
        }
        System.out.println("Cliente n encontrado");
    }
	
	public void atualizarCliente(int cpfAntigo, String novoNome,int novaIdade, int novoCpf) {
		 Cliente atual = primeiro;
		 while (atual != null) {
			 if (atual.cpf==cpfAntigo) {
				 atual.nome=novoNome;
				 atual.cpf=novoCpf;
				 atual.idade=novaIdade;
				 return;
			 }
			 atual=atual.proximo;
		 }
		 System.out.println("Cliente n ncontrado");
	}
	
	 public void consultarClientes() {
	        if (primeiro == null) {
	            System.out.println("Lista de clientes vazia.");
	            return;
	        }

	        System.out.println("Clientes cadastrados:");
	        Cliente atual = primeiro;
	        while (atual != null) {
	            System.out.println("Nome: " + atual.nome + " Cpf: " + atual.cpf + " Idade " + atual.idade);
	            atual = atual.proximo;
	        }
	 }
	 public void nClientes() {
		 System.out.println(nCliente);
	 }
}


