package Atividade1;

public class CinemaApp {
    public static void main(String[] args) {
        
        Filme filme = new Filme("A Origem", "Ficcao Cientifica", 148);

        // Criação de uma sala de cinema associada ao filme
        SalaCinema sala = new SalaCinema(1, 100, filme);

        Cliente cliente = new Cliente("Joao Silva", "123.456.789-00", "Rua das Flores, 123");

        Ingresso ingresso = new Ingresso(cliente, sala, "Inteira", "B10");

        System.out.println("Detalhes do Ingresso:");
        System.out.println("Cliente: " + ingresso.getCliente().getNome());
        System.out.println("CPF: " + ingresso.getCliente().getCpf());
        System.out.println("Filme: " + ingresso.getSala().getFilme().getTitulo());
        System.out.println("Genero: " + ingresso.getSala().getFilme().getGenero());
        System.out.println("Duracao: " + ingresso.getSala().getFilme().getDuracao() + " minutos");
        System.out.println("Sala: " + ingresso.getSala().getNumero());
        System.out.println("Tipo de Ingresso: " + ingresso.getTipoIngresso());
        System.out.println("Assento: " + ingresso.getLocalizacaoAssento());
    }
}
