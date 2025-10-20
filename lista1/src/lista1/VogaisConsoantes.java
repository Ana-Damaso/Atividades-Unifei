package lista1;

import java.util.Scanner;

public class VogaisConsoantes {

	public static void main(String[] args) {

		System.out.println("Digite o nome a ser analisado: ");
		Scanner entrada = new Scanner(System.in);
		String nomeParaAnalisar = entrada.nextLine();
		System.out.println();
		
		separarVogaisEConsoantes(nomeParaAnalisar);
	}

	public static void separarVogaisEConsoantes(String nome) {
        StringBuilder vogais = new StringBuilder();
        StringBuilder consoantes = new StringBuilder();

        for (char letra : nome.toCharArray()) {
            String tipo = verificarTipoLetra(letra);

            if (tipo.equals("Vogal")) {
                vogais.append(letra).append(" ");
            } else if (tipo.equals("Consoante")) {
                consoantes.append(letra).append(" ");
            }
        }

        System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Vogais: " + vogais.toString());
        System.out.println("Consoantes: " + consoantes.toString());

    }
	
	public static String verificarTipoLetra(char c) {
        char letra = Character.toLowerCase(c);

        if (letra >= 'a' && letra <= 'z') {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                return "Vogal";
            } else {
                return "Consoante";
            }
        }
        return "Indefinido";
    }
}

