package Atividade1;

public class SalaCinema {
    private int numero;
    private int capacidadeMaxima;
    private Filme filme;

    public SalaCinema(int numero, int capacidadeMaxima, Filme filme) {
        this.numero = numero;
        this.capacidadeMaxima = capacidadeMaxima;
        this.filme = filme;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
}
