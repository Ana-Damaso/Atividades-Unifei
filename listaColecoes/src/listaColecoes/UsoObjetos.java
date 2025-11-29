package listaColecoes;

import java.util.ArrayList;

public class UsoObjetos {
    public static void main(String[] args) {
        ArrayList<Produtos> produtos = new ArrayList<>();
        
        produtos.add(new Produtos("Arroz", 20.50));
        produtos.add(new Produtos("Feijão", 8.90));
        produtos.add(new Produtos("Carne", 50.00));
        produtos.add(new Produtos("Macarrão", 5.00));
        produtos.add(new Produtos("Sal", 2.00));

        try {
            String nomeMaisCaro = encontrarMaisCaro(produtos);
            System.out.println("Produto mais caro: " + nomeMaisCaro);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }


    public static String encontrarMaisCaro(ArrayList<Produtos> lista) throws Exception {
        if (lista.isEmpty()) {
            throw new Exception("A lista de produtos está vazia!");
        }

        Produtos maisCaro = lista.get(0);

        for (Produtos p : lista) {
            if (p.getPreco() > maisCaro.getPreco()) {
                maisCaro = p;
            }
        }
        return maisCaro.getNome();
    }
}