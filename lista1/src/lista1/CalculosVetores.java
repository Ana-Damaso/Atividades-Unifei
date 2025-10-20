package lista1;

import java.util.Scanner;
import java.util.Arrays;

public class CalculosVetores {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
        
        int[] vetor1 = criarVetor(1, entrada);
        int[] vetor2 = criarVetor(2, entrada);
        int[] vetor3 = criarVetor(3, entrada);

        System.out.println();
        System.out.println("Calculos com os vetores-");

//Letra A
        int soma1 = calcularSoma(vetor1);
        int produto1 = calcularProduto(vetor1);
        double media1 = calcularMedia(vetor1);
        System.out.println("Vetor 1: " + "Soma: " + soma1 + " Produto: " + produto1 + " Média: " + media1);

        int soma2 = calcularSoma(vetor2);
        int produto2 = calcularProduto(vetor2);
        double media2 = calcularMedia(vetor2);
        System.out.println("Vetor 2: " + "Soma: " + soma2 + " Produto: " + produto2 + " Média: " + media2);

        int soma3 = calcularSoma(vetor3);
        int produto3 = calcularProduto(vetor3);
        double media3 = calcularMedia(vetor3);
        System.out.println("Vetor 3: " + "Soma: " + soma3 + " Produto: " + produto3 + " Média: " + media3);
        

//Letra B
        
        int[] vetorSoma = {soma1, soma2, soma3};
        int[] vetorProduto = {produto1, produto2, produto3};
        double[] vetorMedia = {media1, media2, media3};

        System.out.println();
        System.out.println("Vetor de Somas: " + Arrays.toString(vetorSoma));
        System.out.println("Vetor de Produtos: " + Arrays.toString(vetorProduto));
        System.out.println("Vetor de Médias: " + Arrays.toString(vetorMedia));

//Letra C

        int somaFinal = calcularSoma(vetorSoma);
        int produtoFinal = calcularProduto(vetorProduto);
        double mediaFinal = calcularMedia(vetorMedia);

        System.out.println();
        System.out.println("Soma do Vetor de Somas: " + somaFinal);
        System.out.println("Produto do Vetor de Produtos: " + produtoFinal);
        System.out.println("Média do Vetor de Médias: " + mediaFinal);
    }

	public static int[] criarVetor(int numeroVetor, Scanner scanner) {
		System.out.println();
		System.out.print("Qual o tamanho do vetor: ");
		int tamanho = scanner.nextInt();

		int[] vetor = new int[tamanho];

		System.out.println("Insira os elementos do vetor: ");
		for (int i = 0; i < tamanho; i++) {
			System.out.print("Elemento " + (i + 1) + ": ");
			vetor[i] = scanner.nextInt();
		}
		return vetor;

	}

	public static int calcularSoma(int[] vetor) {
		int soma = 0;
		for (int numero : vetor) {
			soma += numero;
		}
		return soma;
	}

	public static double calcularSoma(double[] vetor) {
		double soma = 0.0;
		for (double numero : vetor) {
			soma += numero;
		}
		return soma;
	}

	public static int calcularProduto(int[] vetor) {
		int produto = 1;
		for (int numero : vetor) {
			produto *= numero;
		}
		return produto;
	}

	public static double calcularMedia(int[] vetor) {
		if (vetor.length == 0)
			return 0.0;
		return (double) calcularSoma(vetor) / vetor.length;
	}

	public static double calcularMedia(double[] vetor) {
		if (vetor.length == 0)
			return 0.0;
		return calcularSoma(vetor) / vetor.length;
	}

}
