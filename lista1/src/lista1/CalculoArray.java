package lista1;

import java.util.Scanner;
import java.util.Arrays;

public class CalculoArray {

	public static void main(String[] args) {

//Inserção de numeros
		System.out.println("Vamos realizar calculos com 5 numeros: ");
		Scanner entrada = new Scanner(System.in);

		int[] numeros = new int[5];

		System.out.println("Insira 5 numeros: ");

		for (int i = 0; i < 5; i++) {

			numeros[i] = entrada.nextInt();

		}

		for (int j = 0; j < numeros.length; j++) {
			System.out.println("Os numeros inseridos foram: " + numeros[j]);
		}
		soma(numeros);
		extremos(numeros);
		media(numeros);
		mediana(numeros);
		moda(numeros);
	}

//Calculando a soma

	public static void soma(int[] numeros) {

		System.out.println();
		System.out.println("Letra a: Soma dos numeros");

		int soma = 0;

		for (int i = 0; i < numeros.length; i++) {

			soma += numeros[i];

		}

		System.out.println("A soma dos numeros é: " + soma);

	}

//Calculando maior e menor valor

	public static void extremos(int[] numeros) {

		System.out.println();
		System.out.println("Letra b: maximo e minimo dos numeros");

		int maiorValor = numeros[0];
		int menorValor = numeros[0];

		for (int i = 0; i < numeros.length; i++) {

			if (numeros[i] > maiorValor)
				maiorValor = numeros[i];

			for (int j = 0; j < numeros.length; j++)

				if (numeros[j] < menorValor)
					menorValor = numeros[j];

		}

		System.out.println("o maior valor é: " + maiorValor);
		System.out.println("o menor valor é: " + menorValor);

	}

// Calculando media

	public static void media(int[] numeros) {

		System.out.println();
		System.out.println("Letra c: Media dos numeros");

		double soma = 0;

		for (int i = 0; i < numeros.length; i++) {

			soma += numeros[i];

		}
		double media = soma / numeros.length;

		System.out.println("A media dos numeros é: " + media);

	}

	// Calculando mediana

	public static void mediana(int[] numeros) {

		System.out.println();
		System.out.println("Letra d: Mediana dos numeros");

		int[] numerosOrdenados = numeros.clone();

		Arrays.sort(numerosOrdenados);

		System.out.println("Os numeros ordenados são: " + Arrays.toString(numerosOrdenados));

		int mediana;

		int tamanho = numerosOrdenados.length;

		int numeroMeio = tamanho / 2;

		mediana = numerosOrdenados[numeroMeio];

		System.out.println("A mediana dos numeros é: " + mediana);

	}
	// Calculando moda

	public static void moda(int[] numeros) {

		System.out.println();
		System.out.println("Letra e: Moda dos numeros");

		int moda = 0;

		int maiorRepeticao = 0;

		for (int i = 0; i < numeros.length; i++) {

			int numeroSelecionado = numeros[i];
			int numeroAtual = 0;

			for (int j = 0; j < numeros.length; j++) {
				if (numeros[j] == numeroSelecionado) {
					numeroAtual++;

				}
			}

			if (numeroAtual > maiorRepeticao) {
				maiorRepeticao = numeroAtual;
				moda = numeroSelecionado;

			}
		}

		if (maiorRepeticao > 1) {
			System.out.println("A moda dos numeros é: " + moda);

		} else {
			System.out.println("Não há numeros repetidos, então não há moda.");
		}

	}

}
