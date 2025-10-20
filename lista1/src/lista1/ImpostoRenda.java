package lista1;

import java.util.Scanner;

public class ImpostoRenda {

	public static void main(String[] args) {
		
		System.out.println("Calculo do imposto de renda");
		
//		Recebendo os valores
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor do salário minimo: ");
		double salarioMinimo = entrada.nextDouble();
		
		System.out.println();
		System.out.println("Digite o numero de dependentes do funcionario: ");
		int dependentes = entrada.nextInt();
		
		System.out.println();
		System.out.println("Digite o valor do salario do funcionario: ");
		double salarioFuncionario = entrada.nextDouble();
		
		System.out.println();
		System.out.println("Digite o valor de imposto ja pago pelo funcionario: ");
		double impostoPago = entrada.nextDouble();
		
//		Calculo do imposto bruto
		
		double impostoBruto = 0;
		
		if (salarioFuncionario > 12 * salarioMinimo) {
			impostoBruto = 0.20 * salarioFuncionario;
		} else if (salarioFuncionario > 5 * salarioMinimo) {
			impostoBruto = 0.08 * salarioFuncionario;
		} else {
			impostoBruto = impostoBruto;
		}
		System.out.println("O valor do imposto bruto é: " + impostoBruto);
		
//		Calculo dos dependentes e adicional
		
		double restituicao = impostoBruto * 0.02 * dependentes;
		
		double taxaAdicional = impostoBruto * 0.04;
		
		double impostoFinal = impostoBruto + taxaAdicional - restituicao;
		
		System.out.println();
	
		if (impostoFinal > 0) {
			System.out.println("O valor final é: " + impostoFinal);
		}
		else {
			System.out.println("Não há imposto a ser pago.");
		}
	}

}
