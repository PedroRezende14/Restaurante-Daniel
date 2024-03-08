package Prototype1;

import Prototype.LojaP;

public class Main {

	public static void main(String[] args) {
		RoupaP Roupa = new RoupaP();
		Prototype1.LojaP RoupaNovo = Roupa.clonar();
		RoupaNovo.setValorCompra(10);
		Prototype1.LojaP RoupaVei = Roupa.clonar();
		RoupaVei.setValorCompra(50);
		System.out.println(RoupaNovo.exibirInfo());
		System.out.println(RoupaVei.exibirInfo());

	}

}
