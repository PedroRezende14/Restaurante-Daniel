package Main;
import dto.*;
import java.util.Scanner;

import lista.ListCaixa;
import lista.ListClient;
import lista.ListFuncionario;
import lista.ListMesa;
import lista.ListPedido;

public class Escolhas {
	View v = new View();
	Scanner entrada = new Scanner(System.in);

	ListClient lc = new ListClient();
	ListFuncionario lf = new ListFuncionario();
	ListPedido lp = new ListPedido();
	ListMesa lm = new ListMesa();
	ListCaixa lcl = new ListCaixa();
	int opc=0;

	public void Escolha() {
		int saida=0;
		int entra=0;
		String continua;
		String pedido;
		String funcao;
		String nome;
		int idade;
		int cpf;
		int cpfAntigo;
		int nPedido;
		int n;
		int fila=0;
		while(opc!=100) {
			v.menu();
			System.out.println("Selecione uma opcao");
			opc=entrada.nextInt();
			
			
			switch(opc) {
            	case 1:
            		if(fila>0) {
            			fila--;
            		}
            		
            		entra++;
            		System.out.print(" Idade: ");
            		idade = entrada.nextInt();
            	
            		System.out.print(" Cpf: ");
            		cpf = entrada.nextInt();
            		
            		System.out.print(" Nome: ");	
            		nome = entrada.nextLine();
            		nome = entrada.nextLine();
            		lc.cadastrarCliente (nome, idade, cpf);
            		System.out.println("");
            		
            		System.out.println("1 para continuar");
            		continua = entrada.next();
            		break;
            		
            	case 2:
            		System.out.print("Qual o cpf do cliente: ");
            		cpf = entrada.nextInt();
            		lc.removerCliente(cpf);
            		
            		System.out.println("1 para continuar");
            		continua = entrada.next();
            		break;
            		
            	case 3:
            		System.out.print("Cpf Antigo: ");
            		cpfAntigo = entrada.nextInt();
            		System.out.println("");
            		System.out.print("Nome: ");
            		nome = entrada.nextLine();
            		nome = entrada.nextLine();
            		System.out.print(" Idade: ");
            		idade = entrada.nextInt();
            		System.out.print(" Cpf: ");
            		cpf = entrada.nextInt();
            		lc.atualizarCliente(cpfAntigo, nome, idade, cpf);
            		System.out.println("1 para continuar");
            		continua = entrada.next();
            		break;
            		
            	case 4:
            		lc.consultarClientes();
            		System.out.println("1 para continuar");
            		continua = entrada.next();
            		break;
            		
            	case 5:
            		System.out.print("Nome: ");
            		nome = entrada.nextLine();
            		nome = entrada.nextLine();
            		System.out.print(" Funcao: ");
            		funcao = entrada.nextLine();
            		System.out.print(" Cpf: ");
            		cpf = entrada.nextInt();
            		lf.cadastrarFuncionario(nome, funcao, cpf);
            		System.out.println("1 para continuar");
            		continua = entrada.next();
            		break;
            		
            	case 6:
            		System.out.print("Qual o cpf do Funcionario: ");
            		cpf = entrada.nextInt();
            		lf.removerFuncionario(cpf);
            		System.out.println("1 para continuar");
            		continua = entrada.next();
            		break;
            		
            	case 7:
            		System.out.print("Cpf Antigo: ");
            		cpfAntigo = entrada.nextInt();
            		System.out.println("");
            		System.out.print("Nome: ");
            		nome = entrada.nextLine();
            		nome = entrada.nextLine();
            		System.out.print(" Funcao: ");
            		funcao = entrada.nextLine();;
            		System.out.print(" Cpf: ");
            		cpf = entrada.nextInt();
            		lf.atualizarFuncionario(cpfAntigo, nome, funcao, cpf);
            		System.out.println("1 para continuar");
            		continua = entrada.next();
            		break;
            		
            	case 8:
            		lf.consultarFuncionarios();
            		System.out.println("1 para continuar");
            		continua = entrada.next();
            		break;
            		
            	case 9:
              		System.out.print(" Numero do pedido: ");
            		nPedido = entrada.nextInt();
            		System.out.print(" Qual o pedido: ");
            		pedido = entrada.nextLine();
            		pedido = entrada.nextLine();
            		lp.registrarPedido(nPedido, pedido);
            		System.out.println("1 para continuar");
            		continua = entrada.next();
            		break;
            		
            	case 10:
            		System.out.print(" Numero do pedido: ");
            		nPedido = entrada.nextInt();
            		lp.cancelarPedido(nPedido);
            		System.out.println("1 para continuar");
            		continua = entrada.next();
            		break;
            		
            	case 11:
            		System.out.print(" Numero do pedido: ");
            		nPedido = entrada.nextInt();
            		System.out.print(" Qual o pedido: ");
            		pedido = entrada.nextLine();
            		pedido = entrada.nextLine();
            		lp.alterarPedido(nPedido, pedido);
            		System.out.println("1 para continuar");
            		continua = entrada.next();
            		break;
            		
            	case 12:
            		lp.consultarPedidos();
            		System.out.println("1 para continuar");
            		continua = entrada.next();
            		break;
            		
            	case 13:
            		System.out.print(" Numero do pedido: ");
            		nPedido = entrada.nextInt();
            		lp.localizarPedido(nPedido);
            		System.out.println("1 para continuar");
            		continua = entrada.next();
            		break;
            		
            	case 14:
            		System.out.print("Numero da mesa ");
            		n = entrada.nextInt();
            		System.out.println("");
            		lm.adicionarMesa(n);
            		System.out.println("1 para continuar");
            		continua = entrada.next();
            		break;
            	case 15:
            		System.out.print("Numero da mesa a qual quer reservar ");
            		n = entrada.nextInt();
            		System.out.println("");
            		lm.reservaMesa(n);
            		System.out.println("1 para continuar");
            		continua = entrada.next();
            		break;
            	case 16:
            		System.out.print("Numero da mesa a qual quer Liberar ");
            		n = entrada.nextInt();
            		System.out.println("");
            		lm.liberarMesa(n);
            		System.out.println("1 para continuar");
            		continua = entrada.next();
            		break;
            	case 17:
            		lm.consultarMesas();
            		System.out.println("1 para continuar");
            		continua = entrada.next();
            		break;
            	case 18:
            		if(entra>=1) {
	            		saida++;
	            		entra--;
	            		System.out.print(" qual o seu ");
	            		System.out.print(" Cpf: ");
	            		cpf = entrada.nextInt();
	            		System.out.print(" valor: ");
	            		idade = entrada.nextInt();
	            		lcl.registrarPagamento(cpf, idade);
	            		continua = entrada.next();
            		}
            		break;
            	case 19:
            		lcl.emitirRecibos();
            		System.out.println("1 para continuar");
            		continua = entrada.next();
            		break;
            	case 20:
            		System.out.print("Numero de atendimentos foi de: "+ saida);
            		System.out.println("\n 1 para continuar");
            		continua = entrada.next();
            		break;
            	case 21:
            		lm.consultarMesas();
            		System.out.println("1 para continuar");
            		continua = entrada.next();
            		break;
            	case 22:
            		System.out.print("Numero de pessoas no estaurante : "+ entra);
            		System.out.println("\n 1 para continuar");
            		continua = entrada.next();
            		break;
            	case 23:	
            		
            		if(fila ==0) {
            			System.out.print("Quantas pessoas estão na fila: ");
            			fila = entrada.nextInt();
            		}
            		System.out.println("\n Numero de pessoas na fila do  restaurante : "+ fila);
            			
            		System.out.print("Deseja modificar a fila 1-sim, 2-nao ");
            			int es = entrada.nextInt();
            			if(es==1) {
            				System.out.print("Quantas pessoas estão na fila: ");
                			fila = entrada.nextInt();
            			}

            		
            		System.out.println("\n 1 para continuar");
            		continua = entrada.next();
            		break;
            	case 24:	
            		opc=100;
            		break;
            	default:
            	
			}
		}

		
       
        
	}
}
