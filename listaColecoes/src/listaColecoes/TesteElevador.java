package listaColecoes;

public class TesteElevador {

    public static void main(String[] args) {
        Elevador meuElevador = new Elevador();

        meuElevador.inicializa(5, 10);

        meuElevador.entra();
        meuElevador.entra();
        meuElevador.entra();

        meuElevador.sobe();
        meuElevador.sobe();

        meuElevador.sai();

        meuElevador.desce();

        meuElevador.imprimirHistorico();
    }
}