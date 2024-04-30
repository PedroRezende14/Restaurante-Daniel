package dto;

public class Pedido {
	
	public int numero;
	public String descricao;
    public Pedido proximo;

    public Pedido(int numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
        this.proximo = null;
    }
	

}
