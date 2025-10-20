package lista1;

import java.util.Scanner;

public class Bandeiras {

	public static void asterisco() {
		System.out.print("* ");
	}

	public static void letraE() {
		System.out.print("& ");
	}

	public static void porcentagem() {
		System.out.print("% ");
	}

	public static void cifrao() {
		System.out.print("$ ");
	}

	public static void linha() {
		System.out.println();
	}


	public static void bandeiraBrasil(int tamanho) {
		double centro = (tamanho - 1) / 2.0;
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				double distancia = Math.abs(i - centro) + Math.abs(j - centro);
				double limiteInterno = tamanho / 4.0;
				double limiteExterno = tamanho / 2.0;
				if (distancia < limiteInterno) {
					letraE();
				} else if (distancia < limiteExterno) {
					porcentagem();
				} else {
					asterisco();
				}
			}
			linha();
		}
	}

	public static void bandeiraAlemanha(int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				double limiteFaixa1 = tamanho * (2.0 / 8.0);
				double limiteFaixa2 = tamanho * (5.0 / 8.0);
				if (i < limiteFaixa1) {
					asterisco();
				} else if (i < limiteFaixa2) {
					porcentagem();
				} else {
					letraE();
				}
			}
			linha();
		}
	}

	public static void bandeiraArgentina(int tamanho) {
		double centro = (tamanho - 1) / 2.0;
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				double limiteFaixaSuperior = tamanho * (3.0 / 8.0);
				double limiteFaixaInferior = tamanho * (5.0 / 8.0);

				if (i < limiteFaixaSuperior || i >= limiteFaixaInferior) {
					asterisco();
				} else {
					double distanciaSol = Math.abs(i - centro) + Math.abs(j - centro);
					if (distanciaSol < tamanho / 8.0) {
						letraE();
					} else {
						porcentagem();
					}
				}
			}
			linha();
		}
	}

	public static void bandeiraBelgica(int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				double limiteFaixa1 = tamanho / 3.0;
				double limiteFaixa2 = tamanho * (2.0 / 3.0);
				if (j < limiteFaixa1) {
					asterisco();
				} else if (j < limiteFaixa2) {
					letraE();
				} else {
					porcentagem();
				}
			}
			linha();
		}
	}

	public static void bandeiraJapao(int tamanho) {
		double centro = (tamanho - 1) / 2.0;
		double raio = tamanho / 3.5;
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				double distancia = Math.sqrt(Math.pow(i - centro, 2) + Math.pow(j - centro, 2));
				if (distancia <= raio) {
					letraE();
				} else {
					asterisco();
				}
			}
			linha();
		}
	}

	public static void bandeiraCatar(int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				int limiteColuna = tamanho / 3;
				if (i % 2 == 0) {
					limiteColuna--;
				}
				if (j < limiteColuna) {
					asterisco();
				} else if (j < limiteColuna + 2) {
					letraE();
				} else {
					porcentagem();
				}
			}
			linha();
		}
	}

	public static void bandeiraCoreiaSul(int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				boolean noCantoSuperiorEsquerdo = i < tamanho / 4 && j < tamanho / 4;
				boolean noCantoSuperiorDireito = i < tamanho / 4 && j >= tamanho * 3 / 4;
				boolean noCantoInferiorEsquerdo = i >= tamanho * 3 / 4 && j < tamanho / 4;
				boolean noCantoInferiorDireito = i >= tamanho * 3 / 4 && j >= tamanho * 3 / 4;
				boolean noCentro = i > tamanho / 3 && i < tamanho * 2 / 3 && j > tamanho / 3 && j < tamanho * 2 / 3;

				if (noCantoSuperiorEsquerdo || noCantoInferiorDireito || noCantoSuperiorDireito || noCantoInferiorEsquerdo) {
					porcentagem();
				} else if (noCentro) {
					letraE();
				} else {
					asterisco();
				}
			}
			linha();
		}
	}


	public static void bandeiraUSA(int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < tamanho; j++) {
				boolean noCantoAzul = i < tamanho / 2 && j < tamanho / 2;

				if (noCantoAzul) {
					asterisco();
				} else {
					int numeroDaListra = (int) (i / (tamanho / 13.0));
					if (numeroDaListra % 2 == 0) {
						cifrao();
					} else {
						letraE();
					}
				}
			}
			linha();
		}
	}

	public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha o numero da bandeira: ");
            System.out.println("1 Brasil");
            System.out.println("2 Alemanha");
            System.out.println("3 Argentina");
            System.out.println("4 Bélgica");
            System.out.println("5 Japão");
            System.out.println("6 Catar");
            System.out.println("7 Coreia do Sul");
            System.out.println("8 EUA");
            System.out.println("9 Sair");
            opcao = entrada.nextInt();

            int tamanho = 0;
            if (opcao >= 1 && opcao <= 8) {
                System.out.print("Qual o tamanho da bandeira? ");
                tamanho = entrada.nextInt();
                System.out.println();
            }

            switch (opcao) {
                case 1: bandeiraBrasil(tamanho); break;
                case 2: bandeiraAlemanha(tamanho); break;
                case 3: bandeiraArgentina(tamanho); break;
                case 4: bandeiraBelgica(tamanho); break;
                case 5: bandeiraJapao(tamanho); break;
                case 6: bandeiraCatar(tamanho); break;
                case 7: bandeiraCoreiaSul(tamanho); break;
                case 8: bandeiraUSA(tamanho); break;
                case 9: System.out.println("Finalizado"); break;

            }

        } while (opcao != 9);

        entrada.close();
    }

}