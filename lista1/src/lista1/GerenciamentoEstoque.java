package lista1;

import java.util.Scanner;
import java.util.Arrays;

public class GerenciamentoEstoque {

    public static void main(String[] args) {
    	
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Quantos produtos diferentes você deseja gerenciar no estoque? ");
        int numeroDeProdutos = entrada.nextInt();
        entrada.nextLine();


        String[] nomesProdutos = new String[numeroDeProdutos];
        int[] quantidadesEstoque = new int[numeroDeProdutos];


        for (int i = 0; i < numeroDeProdutos; i++) {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            nomesProdutos[i] = entrada.nextLine();
            
            System.out.print("Digite a quantidade inicial de '" + nomesProdutos[i] + "': ");
            quantidadesEstoque[i] = entrada.nextInt();
            entrada.nextLine();
        }
        

        int opcao;
        do {
            exibirMenu();
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    consultarProduto(nomesProdutos, quantidadesEstoque, entrada);
                    break;
                case 2:
                    atualizarEstoque(nomesProdutos, quantidadesEstoque, entrada);
                    break;
                case 3:
                    listarTodosProdutos(nomesProdutos, quantidadesEstoque);
                    break;
                case 4:
                    System.out.println("Consulta finalizada");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
            System.out.println(); 

        } while (opcao != 4);
        
        entrada.close();
    }

    public static void exibirMenu() {

    	System.out.println();
        System.out.println("1. Consultar quantidade de produto");
        System.out.println("2. Atualizar estoque de produto");
        System.out.println("3. Listar todos os produtos");
        System.out.println("4. Sair");
    }

    public static void consultarProduto(String[] nomes, int[] quantidades, Scanner scanner) {
        System.out.println();
        System.out.print("Digite o nome do produto que deseja consultar: ");
        String nomeBusca = scanner.nextLine();

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                System.out.println("Nome: " + nomes[i]);
                System.out.println("Quantidade em estoque: " + quantidades[i]);
                return;
            }
        }
        System.out.println("Produto '" + nomeBusca + "' não encontrado no estoque.");
    }

    public static void atualizarEstoque(String[] nomes, int[] quantidades, Scanner scanner) {
        System.out.print("Digite o nome do produto que deseja atualizar: ");
        String nomeBusca = scanner.nextLine();

        int indiceProduto = -1;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                indiceProduto = i;
                break;
            }
        }

        if (indiceProduto == -1) {
            System.out.println("Produto '" + nomeBusca + "' não encontrado no estoque.");
            return;
        }

        System.out.println("Quantidade atual de '" + nomes[indiceProduto] + "': " + quantidades[indiceProduto]);
        System.out.print("Digite a quantidade a ser atualizada ");
        int alteracao = scanner.nextInt();

        if (quantidades[indiceProduto] + alteracao < 0) {
            System.out.println("A quantidade em estoque não pode ser negativa.");
        } else {
            quantidades[indiceProduto] += alteracao;
            System.out.println("Nova quantidade de '" + nomes[indiceProduto] + "': " + quantidades[indiceProduto]);
        }
    }
    
    public static void listarTodosProdutos(String[] nomes, int[] quantidades) {
    	System.out.println();
        System.out.println("Lista de Produtos");
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf( nomes[i], quantidades[i]);
        }
    }
}