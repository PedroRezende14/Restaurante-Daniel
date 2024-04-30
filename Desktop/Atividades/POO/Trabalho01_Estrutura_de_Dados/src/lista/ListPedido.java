package lista;

import dto.Pedido;

public class ListPedido {
	
	 Pedido primeiro;
	 
	 public ListPedido(){
		 this.primeiro=null;
	 }

	   
	    public void registrarPedido(int numero, String descricao) {
	        Pedido novoPedido = new Pedido(numero, descricao);
	        if (primeiro == null) {
	            primeiro = novoPedido;
	        } else {
	            Pedido atual = primeiro;
	            while (atual.proximo != null) {
	                atual = atual.proximo;
	            }
	            atual.proximo = novoPedido;
	        }
	    }

	    public void alterarPedido(int numero, String novaDescricao) {
	        Pedido atual = primeiro;
	        while (atual != null) {
	            if (atual.numero == numero) {
	                atual.descricao = novaDescricao;
	                return;
	            }
	            atual = atual.proximo;
	        }

	        System.out.println("Pedido não encontrado.");
	    }

	    public void cancelarPedido(int numero) {
	        if (primeiro == null) {
	            System.out.println("Lista de pedidos vazia.");
	            return;
	        }

	        if (primeiro.numero == numero) {
	            primeiro = primeiro.proximo;
	            return;
	        }

	        Pedido anterior = primeiro;
	        Pedido atual = primeiro.proximo;
	        while (atual != null) {
	            if (atual.numero == numero) {
	                anterior.proximo = atual.proximo;
	                return;
	            }
	            anterior = atual;
	            atual = atual.proximo;
	        }

	        System.out.println("Pedido não encontrado.");
	    }

	    public void consultarPedidos() {
	        if (primeiro == null) {
	            System.out.println("Lista de pedidos vazia.");
	            return;
	        }

	        System.out.println("Pedidos realizados:");
	        Pedido atual = primeiro;
	        while (atual != null) {
	            System.out.println("Numero: " + atual.numero + ", Pedido: " + atual.descricao);
	            atual = atual.proximo;
	        }
	    }
	    
	    public Pedido localizarPedido(int numero) {
	        Pedido atual = primeiro;
	        while (atual != null) {
	            if (atual.numero == numero) {
	            	System.out.println("Numero: " + atual.numero + ", Pedido: " + atual.descricao);
	                return atual;
	            }
	            atual = atual.proximo;
	        }
	        return null;
	        }

}

