package Prototype;

public class Main {

	public static void main(String[] args) {
		
		BonecoP Boneco = new BonecoP();
		LojaP BonecoNovo = Boneco.clonar();
		BonecoNovo.setValorCompra(10);
		LojaP BonecoVei = Boneco.clonar();
		BonecoVei.setValorCompra(50);
		System.out.println(BonecoNovo.exibirInfo());
		System.out.println(BonecoVei.exibirInfo());
		
	}

}
