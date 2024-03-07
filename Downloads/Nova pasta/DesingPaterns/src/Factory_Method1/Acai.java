package Factory_Method1;

public class Acai {
	private int ml = 300;
	private boolean granola = false;
	private boolean pacoca = false;
	private boolean banana = false;
	
	
	public int getMl() {
		return ml;
	}


	public void setMl(int ml) {
		this.ml = ml;
	}


	public boolean isGranola() {
		return granola;
	}


	public void setGranola(boolean granola) {
		this.granola = granola;
	}


	public boolean isPacoca() {
		return pacoca;
	}


	public void setPacoca(boolean pacoca) {
		this.pacoca = pacoca;
	}


	public boolean isBanana() {
		return banana;
	}


	public void setBanana(boolean banana) {
		this.banana = banana;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Acai [ml=");
		builder.append(ml);
		builder.append(", granola=");
		builder.append(granola);
		builder.append(", pacoca=");
		builder.append(pacoca);
		builder.append(", banana=");
		builder.append(banana);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
