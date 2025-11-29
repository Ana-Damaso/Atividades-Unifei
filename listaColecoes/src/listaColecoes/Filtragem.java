package listaColecoes;

import java.util.ArrayList;

public class Filtragem {
    public static void main(String[] args) {
    	
        ArrayList<String> palavras = new ArrayList<>();
        palavras.add("Java");
        palavras.add("Computador");
        palavras.add("Sol");
        palavras.add("Programação");
        palavras.add("Mesa");

        try {
            ArrayList<String> filtradas = filtrarPalavras(palavras);
            System.out.println("Palavras grandes: " + filtradas);
        } catch (NoMatchingElementsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<String> filtrarPalavras(ArrayList<String> lista) throws NoMatchingElementsException {
        ArrayList<String> novaLista = new ArrayList<>();

        for (String palavra : lista) {
            if (palavra.length() > 5) {
                novaLista.add(palavra);
            }
        }

        if (novaLista.isEmpty()) {
            throw new NoMatchingElementsException("Nenhuma palavra com mais de 5 letras encontrada.");
        }

        return novaLista;
    }
}