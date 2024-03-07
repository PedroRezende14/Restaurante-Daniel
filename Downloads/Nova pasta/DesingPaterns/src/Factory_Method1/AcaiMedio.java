package Factory_Method1;

public class AcaiMedio implements IAcai{

	@Override
	public void ml() {
		acai.setMl(500);
	}

	public void granola() {
		acai.setGranola(true);
	}

	public void pacoca() {
		acai.setPacoca(true);
	}

	public void banana() {
		acai.setBanana(false);
	}
	
}