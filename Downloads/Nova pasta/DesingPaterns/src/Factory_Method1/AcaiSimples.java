package Factory_Method1;

public class AcaiSimples implements IAcai{

	@Override
	public void ml() {
		acai.setMl(300);
	}

	public void granola() {
		acai.setGranola(true);
	}

	public void pacoca() {
		acai.setPacoca(false);
	}

	public void banana() {
		acai.setBanana(false);
	}
	
}
