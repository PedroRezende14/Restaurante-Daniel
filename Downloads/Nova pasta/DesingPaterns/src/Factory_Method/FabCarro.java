package Factory_Method;

public class FabCarro implements IFabCarro{

	@Override
	public Carro newCarro(String marca, int nCavalo) {
		
		
		if(nCavalo < 10) 
			return new Corsa(marca,nCavalo);
		else if(nCavalo==100 ) 
			return new FiatUno(marca,nCavalo);
		else
			return new Carro(marca,nCavalo);}
	}
	


