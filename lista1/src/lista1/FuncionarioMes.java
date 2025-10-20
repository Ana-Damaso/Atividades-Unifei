package lista1;

import java.util.Scanner;

public class FuncionarioMes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o numero de funcionários: ");
        int numeroDeCandidatos = entrada.nextInt();
        entrada.nextLine();
        
        String[] nomesFuncionarios = new String[numeroDeCandidatos];

        System.out.println();
        for (int i = 0; i < numeroDeCandidatos; i++) {
            System.out.print("Nome do candidato " + (i + 1) + ": ");
            nomesFuncionarios[i] = entrada.nextLine();
        }

        int[] contagemVotos = new int[nomesFuncionarios.length];

        System.out.println();
        System.out.print("Quantos funcionários irão votar? ");
        int numeroDeVotantes = entrada.nextInt();
        
        System.out.println();
        System.out.println("Candidatos: ");
        for (int i = 0; i < nomesFuncionarios.length; i++) {
            System.out.println((i + 1) + ". " + nomesFuncionarios[i]);
        }
        
        for (int i = 0; i < numeroDeVotantes; i++) {
            int voto;
            
            while (true) {
                System.out.print("Votante #" + (i + 1) + ", digite o número do seu candidato: ");
                voto = entrada.nextInt();

                System.out.println();
                if (voto > 0 && voto <= nomesFuncionarios.length) {
                    contagemVotos[voto - 1]++;
                    System.out.println("Voto computado com sucesso!");
                    break;
                } else {
                    System.out.println("Voto inválido! Digite um número entre 1 e " + nomesFuncionarios.length + ".");
                }
            }
        }

        String nomeVencedor = encontrarVencedor(contagemVotos, nomesFuncionarios);
        
        int maiorNumeroDeVotos = 0;
        for (int votos : contagemVotos) {
            if (votos > maiorNumeroDeVotos) {
                maiorNumeroDeVotos = votos;
            }
        }
        
        System.out.println();
        System.out.println("O funcionário do mês é: " + nomeVencedor);
        System.out.println("Total de votos recebidos: " + maiorNumeroDeVotos);
        
    }
    
    public static String encontrarVencedor(int[] votos, String[] funcionarios) {
        int maiorNumeroDeVotos = -1;
        int indiceDoVencedor = -1;

        for (int i = 0; i < votos.length; i++) {
            if (votos[i] > maiorNumeroDeVotos) {
                maiorNumeroDeVotos = votos[i];
                indiceDoVencedor = i;
            }
        }
        
        if(indiceDoVencedor == -1 || maiorNumeroDeVotos == 0){
            return "Nenhum voto foi computado ou houve um empate sem votos.";
        }
        
        return funcionarios[indiceDoVencedor];
    }
}