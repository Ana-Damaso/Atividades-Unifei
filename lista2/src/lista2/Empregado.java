package lista2;

public class Empregado {

//Atributos

	private String primeiroNome;

	private String sobrenome;

	private double salario;

//Construtor

	public Empregado(String primeiroNome, String sobrenome, double salario) {

		this.primeiroNome = primeiroNome;

		this.sobrenome = sobrenome;

		setSalario(salario);

	}

//Metodo

	public String getSobrenome() {

		return this.sobrenome;

	}

	public void setSobrenome(String sobrenome) {

		if (sobrenome != null && !sobrenome.isEmpty())

			this.sobrenome = sobrenome;

		else {

			System.out.println("Erro, digite novamente.");

		}

	}

	public String getPrimeiroNome() {

		return this.primeiroNome;

	}

	public void setPrimeiroNome(String primeiroNome) {

		if (primeiroNome != null && !primeiroNome.isEmpty())

			this.primeiroNome = primeiroNome;

		else {

			System.out.println("Erro, digite novamente.");

		}

	}

	public double getSalario() {

		return this.salario;

	}

	public void setSalario(double salarioInicial) {

		if (salarioInicial < 0) {

			this.salario = 0;

		} else {

			this.salario = salarioInicial;

		}

	}

	public double calcularSalarioAnual() {

		return this.salario * 12;

	}

	public void aumentarSalario() {

		this.salario = this.salario * 1.10;

	}
}