package listaColecoes;

import java.util.ArrayList;

public class Elevador {
	
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;
    
    private ArrayList<String> historico = new ArrayList<>();

    public void inicializa(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
        registrarHistorico("Inicializado");
    }

    public void entra() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            registrarHistorico("Uma pessoa entrou");
        } else {
            System.out.println("Elevador cheio!");
        }
    }

    public void sai() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            registrarHistorico("Uma pessoa saiu");
        } else {
            System.out.println("Elevador já está vazio!");
        }
    }

    public void sobe() {
        if (andarAtual < totalAndares) {
            andarAtual++;
            registrarHistorico("Subiu para andar " + andarAtual);
        } else {
            System.out.println("Ultimo andar!");
        }
    }

    public void desce() {
        if (andarAtual > 0) {
            andarAtual--;
            registrarHistorico("Desceu para andar " + andarAtual);
        } else {
            System.out.println("Terreo!");
        }
    }
    

    private void registrarHistorico(String acao) {
        String log = "Ação: " + acao + " Andar: " + andarAtual + " Pessoas: " + pessoasPresentes;
        historico.add(log);
    }
    
    public void imprimirHistorico() {
        System.out.println("Histórico do Elevador");
        for (String h : historico) {
            System.out.println(h);
        }
    }


    public int getAndarAtual() { return andarAtual; }
    public void setAndarAtual(int andarAtual) { this.andarAtual = andarAtual; }

}