package MercadinhoDoCurvello;

import java.sql.Date;

public class LojinhaMain2 {

	public static void main(String[] args) {
		
		
		Mercadorias<String> Banana = new Mercadorias<>("B1b1b1", 50, new Date(11), new Date(0));
		Mercadorias<String> ProblemasPsicologicos = new Mercadorias<>("Nao realizar as atividades", 00, new Date(12), new Date(20)); 
		Mercadorias<Integer> Agua = new Mercadorias<>(1, 00, new Date(12), new Date(20)); 
		Mercadorias<String> Banana_verde = new Mercadorias<>("B11", 50, new Date(11), new Date(0));
		Mercadorias<Integer> Agua_com_Gas = new Mercadorias<>(1, 00, new Date(12), new Date(20)); 
		
		Pedido <Mercadorias> pedidoDonaMarlene = new Pedido<>();
		pedidoDonaMarlene.addProduto(Agua);
		pedidoDonaMarlene.addProduto(Banana);
		pedidoDonaMarlene.mostraLista();
		System.out.println("");
		
		Pedido <Mercadorias> pedidoSeuCurvello = new Pedido<>();
		pedidoSeuCurvello.addProduto(Agua_com_Gas);
		pedidoSeuCurvello.addProduto(Banana_verde);
		pedidoSeuCurvello.addProduto(Agua);
		pedidoSeuCurvello.mostraLista();
		System.out.println("");
		
		Pedido <Mercadorias> pedidoSeuRezende = new Pedido<>();
		pedidoSeuRezende.addProduto(ProblemasPsicologicos);
		pedidoSeuRezende.mostraLista();
		
	}

}
