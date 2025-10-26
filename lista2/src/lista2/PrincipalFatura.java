package lista2;

public class PrincipalFatura {

	public static void main(String[] args) {
		
		Fatura fatura1 = new Fatura (1, "Mouse", 3, 25.50);
		Fatura fatura2 = new Fatura (3, "Monitor", 2, 249.49);
		
		System.out.println("O valor inicial da fatura 1 é: " + fatura1.getValorFatura());
		System.out.println("O valor inicial da fatura 2 é: " + fatura2.getValorFatura());
		System.out.println();
		
		fatura1.aplicarDesconto(0.15);
		fatura2.aplicarDesconto(0.0575);
		
		System.out.println("O valor final da fatura 1 é: " + fatura1.getValorFatura());
		System.out.println("O valor final da fatura 2 é: " + fatura2.getValorFatura());

	}

}
