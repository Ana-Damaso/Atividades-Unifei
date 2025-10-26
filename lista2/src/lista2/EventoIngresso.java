package lista2;

import java.util.ArrayList;

public class EventoIngresso {

//Atributos

	private String nome;
	private ArrayList<Ingresso> ingressos;

// Construtor

	public EventoIngresso(String nome) {
		this.nome = nome;

		this.ingressos = new ArrayList<>();
	}

// Metodos

	public void adicionarIngresso(Ingresso ingresso) {
		this.ingressos.add(ingresso);
	}

	public double getValorTotalVendidos() {
		double total = 0.0;
		for (Ingresso ingresso : this.ingressos) {

			if (ingresso.isVendido()) {
				total = total + ingresso.getValor();
			}
		}
		return total;
	}

	public void imprimirNaoVendidos() {
		System.out.println("Ingressos não vendidos" + this.nome);
		boolean algumNaoVendido = false;

		for (Ingresso ingresso : this.ingressos) {

			if (!ingresso.isVendido()) {
				algumNaoVendido = true;
			System.out.println(ingresso.toString());
			}
		}

		if (!algumNaoVendido) {
			System.out.println("Todos os ingressos foram vendidos");
		}
	}
}
