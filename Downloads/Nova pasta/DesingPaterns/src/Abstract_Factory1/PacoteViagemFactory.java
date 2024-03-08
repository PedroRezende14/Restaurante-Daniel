package Abstract_Factory1;

class PacoteViagemFactory implements AgenciaViagensFactory {
	
    public Passagem criarPassagem() {
    
    	return new PassagemAviao();
    
    }

    public Hospedagem criarHospedagem() {
    
    	return new Hotel();
    
    }
}