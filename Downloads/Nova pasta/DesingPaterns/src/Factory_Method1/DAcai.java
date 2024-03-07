package Factory_Method1;

public class DAcai {
	protected IAcai builder;
	public DAcai(IAcai acaibuilder) {
		this.builder = acaibuilder;
	}
	public void construirAcai() {
		builder.banana();
		builder.granola();
		builder.pacoca();
		builder.ml();
	}
	public Acai getAcai() {
		return builder.build();
	}
}
