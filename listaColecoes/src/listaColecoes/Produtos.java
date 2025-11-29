package listaColecoes;

public class Produtos {
    private String nome;
    private double preco;

    public Produtos (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
}