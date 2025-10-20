package lista1;

import java.util.Scanner;

public class CalculoRadioativo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a massa do material em gramas: ");
        
        double massaInicial = entrada.nextDouble();
        

        double massaAtual = massaInicial;
        int Segundos = 0;
        int tempo = 50; 

        while (massaAtual >= 0.5) {

            massaAtual = massaAtual / 2;
            
            Segundos = Segundos + tempo;
        }


        int horas = Segundos / 3600;
        int segundosRestantes = Segundos % 3600;
        int minutos = segundosRestantes / 60;
        int segundos = segundosRestantes % 60;

        System.out.println();
        System.out.printf("Massa Final: " + massaAtual);
        System.out.println();
        System.out.println("Tempo Total: "+ horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");

	}

}
