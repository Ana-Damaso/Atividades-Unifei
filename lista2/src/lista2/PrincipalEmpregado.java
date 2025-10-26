package lista2;

public class PrincipalEmpregado {

	public static void main(String[] args) {

		Empregado empregado1 = new Empregado ("Ana", "Damaso", 1550.75);
		Empregado empregado2 = new Empregado ("Samuel", "Costa", -1000);
		
		System.out.println("O salario anual do empregado " + empregado1.getPrimeiroNome() + " é: " + empregado1.calcularSalarioAnual());
		
		System.out.println("O salario anual do empregado " + empregado2.getPrimeiroNome() + " é: " + empregado2.calcularSalarioAnual());
	
		System.out.println();
		
		empregado1.aumentarSalario();
		empregado2.aumentarSalario();
		
		System.out.println("O salario anual do empregado " + empregado1.getPrimeiroNome() + " com aumento é: " + empregado1.calcularSalarioAnual());
		
		System.out.println("O salario anual do empregado " + empregado2.getPrimeiroNome() + " com aumento é: " + empregado2.calcularSalarioAnual());
	}

}