package lista1;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {

		System.out.println("Verificação de palindromos");
		System.out.println();

		System.out.println("Digite uma palavra para verificar se é palindroma: ");
		Scanner entrada = new Scanner(System.in);
		String texto = entrada.nextLine();

		if (palindromo(texto))
			System.out.println("É um palindromo");
		else {
			System.out.println("Não é um palindromo");
		}
	}

	public static boolean palindromo(String texto) {
		StringBuilder textoLimpoBuilder = new StringBuilder();
		for (char c : texto.toLowerCase().toCharArray()) {
			if (Character.isLetterOrDigit(c)) {
				textoLimpoBuilder.append(c);
			}
		}
		String textoLimpo = textoLimpoBuilder.toString();

		String textoInvertido = new StringBuilder(textoLimpo).reverse().toString();

		System.out.println();
		System.out.println("Texto limpo: " + textoLimpo);
		System.out.println("Texto invertido: " + textoInvertido);

		return textoLimpo.equals(textoInvertido);
	}
}
