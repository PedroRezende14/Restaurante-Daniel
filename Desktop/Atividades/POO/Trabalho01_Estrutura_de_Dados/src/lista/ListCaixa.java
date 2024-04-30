package lista;
import java.util.Random;
import java.util.Scanner;

import dto.Caixa;
import dto.Cliente;

public class ListCaixa {
	Random rand = new Random();
	Scanner entrada = new Scanner(System.in);
	int escolha=0;
	Caixa primeiro;
	int npessoas;
	
	public void registrarPagamento(int cpf, int valor) {
		int numeroAleatorio = rand.nextInt(100) + 1;
		int nota = (cpf/2+valor+numeroAleatorio)/2; 
		npessoas++;
		
		Caixa novoPedido = new Caixa(cpf, valor, nota );
		
		if(primeiro==null) {
			primeiro = novoPedido;
		}
		else {
			Caixa atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoPedido;
		}
		
	pagamento(valor);
	}
	public void pagamento(int valor){
		System.out.println("valor da sua compra é de " + valor);
		do {
			System.out.println("Metodo de pagamendo: \n 1 debito | 2 credido | 3 dinheiro ");
			escolha = entrada.nextInt();
		}while(1<escolha && escolha>3);
		
		if(escolha==1)
		{
			System.out.println("senha do cartao");
			escolha = entrada.nextInt();
			System.out.println("pagamento efetuado com sucesso");
			System.out.println("Obrigaado volte sempre!!");
		}
		
		if(escolha==2)
		{
			System.out.println("deseja parcelar em quantas ?\n  1x "+ valor + "\n 2x " + (valor/2) +"\n3x "+ (valor/3) +"\n 4x"+ (valor/4) + "\n 5x "+ (valor/5) );
			escolha = entrada.nextInt();
			valor = valor/escolha;
			System.out.println("senha do cartao");
			escolha = entrada.nextInt();
			System.out.println("pagamento efetuado com sucesso");
			System.out.println("Obrigaado volte sempre!!");
		}
		
		if(escolha==3)
		{
			do {
			System.out.println("valor a receber: " + valor );
			escolha = entrada.nextInt();
			valor =  valor - escolha ;
			}while(valor>0 );
			System.out.println("troco =  " + valor*-1);
			System.out.println("pagamento efetuado com sucesso");
			System.out.println("Obrigaado volte sempre!!");	
		}	
	}
		  public void emitirRecibos() {
		        Caixa atual = primeiro;
		        
		        if(atual == null) {
		        	  System.out.println("Não foi encontrado nenhum registro");
		        }
		     
		        while (atual != null) {
		            System.out.println("Recibo de pagamento:");
		            System.out.println("CPF: " + atual.cpf);
		            System.out.println("Valor: R$" + atual.valor);
		            atual.nota= atual.valor+atual.cpf;
		            System.out.println("Nota fiscal: " + atual.nota);
		            System.out.println("-------------------------------------");
		            atual = atual.proximo;
		        }
}
		  public void npessoas() {
				System.out.println(npessoas);
		  }
}