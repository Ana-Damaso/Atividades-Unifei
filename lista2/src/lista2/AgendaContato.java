package lista2;

import java.util.ArrayList;

public class AgendaContato {

//Atributos

	private String nome;
	private String descricao;
	private ArrayList<Contato> contatos;

//Construtor

	public AgendaContato(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
		this.contatos = new ArrayList<>();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void adicionarContato(Contato novoContato) {
		if (novoContato != null) {
			this.contatos.add(novoContato);
			System.out.println("Contato adicionado!");
		} else {
			System.out.println("Erro, contato não adicionado");
		}
	}

	public void imprimirTodosOsContatos() {
		System.out.println("Contatos: " + this.nome);

		if (this.contatos.isEmpty()) {
			System.out.println(" Não ha contatos ");
		} else {
			for (Contato contato : this.contatos) {

				contato.imprimirContato();
			}
		}

	}
}