package Factory_Method1;

public interface IAcai {
	
	Acai acai = new Acai();
	
	public void ml ();
	public void granola();
	public void pacoca();
	public void banana();
	public default Acai build() {
		return acai;
	}


}
