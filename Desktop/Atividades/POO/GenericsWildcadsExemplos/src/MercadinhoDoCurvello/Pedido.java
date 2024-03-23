package MercadinhoDoCurvello;

import java.util.ArrayList;
import java.util.List;

public class Pedido<T extends Mercadorias> {
	
	private List<T> listaMercadorias;
	
	public Pedido() {
		this.listaMercadorias = new ArrayList<>();
	}
	
	public void addProduto(T Mercadorias) {
		listaMercadorias.add(Mercadorias);
	}
	
	public void mostraLista() {
		for(T Mercadorias : listaMercadorias ) {
			System.out.println(Mercadorias);
		}
	}

}
