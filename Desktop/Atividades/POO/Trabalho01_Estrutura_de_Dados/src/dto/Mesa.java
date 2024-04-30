package dto;

public class Mesa {
    public int numero;
    public boolean ocupada;
    public Mesa proxima;

    public Mesa(int numero) {
        this.numero = numero;
        this.ocupada = false;
        this.proxima = null;
}
}