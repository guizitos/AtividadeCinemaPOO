package Atividade1;

public class Ingresso {
    private Cliente cliente;
    private SalaCinema sala;
    private String tipoIngresso; // Ex: meia, inteira
    private String localizacaoAssento;

    public Ingresso(Cliente cliente, SalaCinema sala, String tipoIngresso, String localizacaoAssento) {
        this.cliente = cliente;
        this.sala = sala;
        this.tipoIngresso = tipoIngresso;
        this.localizacaoAssento = localizacaoAssento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public SalaCinema getSala() {
        return sala;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public String getLocalizacaoAssento() {
        return localizacaoAssento;
    }
}
