package lista2;

public class Produto {

//Atributos

	private String nome;
	private double preco;
	private int quantidadeEstoque;

//Construtor

	public Produto(String nome, double preco, int quantidadeEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}

//Metodos

	public String getNome() {
		return this.nome;
	}

	public void comprarProduto(int quantidadeComprada) {
		this.quantidadeEstoque = this.quantidadeEstoque - quantidadeComprada;
		System.out.println("Compra efetuada com sucesso! Produto: " + this.nome + "/" + " Quantidade em estoque: "
				+ this.quantidadeEstoque);
	}

	public double valorCompra(int quantidadeComprada) {
		return quantidadeComprada * this.preco;
	}

	public double getValorTotal(int quantidadeComprada) {
		double subtotal = this.preco * quantidadeComprada;

		double precoFinal;

		if (subtotal <= 100) {
			precoFinal = subtotal;

		} else if (subtotal <= 200) {
			precoFinal = subtotal * (1 - 0.10);

		} else if (subtotal <= 500) {
			precoFinal = subtotal * (1 - 0.20);

		} else {
			precoFinal = subtotal * (1 - 0.25);
		}

		return precoFinal;
	}

}