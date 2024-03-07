package Factory_Method1;

public class Main {

	public static void main(String[] args) {
	
		DAcai ad = new DAcai(new AcaiSimples());
		ad.construirAcai();
		Acai a1 = ad.getAcai();
		System.out.println(a1);
		
		ad = new DAcai(new AcaiMedio());
		ad.construirAcai();
		Acai a2 = ad.getAcai();
		System.out.println(a2);
		
		ad = new DAcai(new AcaiTop());
		ad.construirAcai();
		Acai a3 = ad.getAcai();
		System.out.println(a3);
	}
}
