package Factory_Method1;

public class AcaiTop implements IAcai{

	@Override
	public void ml() {
		acai.setMl(700);
	}

	public void granola() {
		acai.setGranola(true);
	}

	public void pacoca() {
		acai.setPacoca(true);
	}

	public void banana() {
		acai.setBanana(true);
	}
	
}