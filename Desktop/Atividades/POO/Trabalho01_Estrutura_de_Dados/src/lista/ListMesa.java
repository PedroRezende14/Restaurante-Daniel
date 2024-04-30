package lista;

import dto.Mesa;

public class ListMesa {
	int aux=0;
	 Mesa primeira;
	    public ListMesa() {
	        this.primeira = null;
	    }

	    public void adicionarMesa(int numero) {
	        Mesa novaMesa = new Mesa(numero);
	        novaMesa.proxima = primeira;
	        primeira = novaMesa;
	    }

	    public void reservaMesa(int numero) {
	        Mesa atual = primeira;
	        while (atual != null) {
	            if (atual.numero == numero) {
	                if (!atual.ocupada) {
	                    atual.ocupada = true;
	                    System.out.println("Mesa " + numero + " alocada para cliente.");
	                } else {
	                    System.out.println("Mesa " + numero + " já está ocupada.");
	                }
	                return;
	            }
	            atual = atual.proxima;
	        }
	        System.out.println("Mesa " + numero + " não encontrada.");
	    }

	    public void liberarMesa(int numero) {
	        Mesa atual = primeira;
	        while (atual != null) {
	            if (atual.numero == numero) {
	                if (atual.ocupada) {
	                    atual.ocupada = false;
	                    System.out.println("Mesa " + numero + " liberada.");
	                } else {
	                    System.out.println("Mesa " + numero + " já está livre.");
	                }
	                return;
	            }
	            atual = atual.proxima;
	        }
	        System.out.println("Mesa " + numero + " não encontrada.");
	    }

	    public void consultarMesas() {
	        Mesa atual = primeira;
	        System.out.println("Mesas ocupadas:");
	        while (atual != null) {
	            if (atual.ocupada) {
	                System.out.println("Mesa " + atual.numero);
	                aux++;
	            }
	            atual = atual.proxima;
	            aux =0;
	        }
	        atual = primeira;
	        System.out.println("Mesas disponíveis:");
	        while (atual != null) {
	            if (!atual.ocupada) {
	                System.out.println("Mesa " + atual.numero);
	                aux++;
	            }
	            atual = atual.proxima;
	            aux =0;
	        }
	    }

}
