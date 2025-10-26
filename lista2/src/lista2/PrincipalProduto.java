package lista2;

public class PrincipalProduto {

	public static void main(String[] args) {

		Produto produto1 = new Produto("Mouse", 45.60, 30);

		int quantidadeParaComprar = 5;

		produto1.comprarProduto(quantidadeParaComprar);

		System.out.println();
		System.out.println("O valor a ser pago pelo produto: " + produto1.getNome() + " é de: "
				+ produto1.getValorTotal(quantidadeParaComprar));

	}

}