package Abstract_Factory1;

public class MainPassagem {
    public static void main(String[] args) {

        AgenciaViagensFactory factory = new PacoteViagemFactory();
        Passagem passagem = factory.criarPassagem();
        Hospedagem hospedagem = factory.criarHospedagem();

        System.out.println("Detalhes do Pacote de Viagem:");
        System.out.println(passagem.getDescricao());
        System.out.println(hospedagem.getDescricao());
    }
}