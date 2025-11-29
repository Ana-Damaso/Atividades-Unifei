package listaColecoes;

import java.util.ArrayList;
import java.util.Collections;

public class Ordenacao {
    public static void main(String[] args) {
        ArrayList<Double> decimais = new ArrayList<>();

        decimais.add(10.5);
        decimais.add(3.2);
        decimais.add(8.9);
        decimais.add(1.0);
        decimais.add(5.5);
        decimais.add(4.8);
        decimais.add(7.2);
        decimais.add(9.5);
        decimais.add(6.1);
        decimais.add(2.2);

        Collections.sort(decimais);
        System.out.println("Ordem Crescente: " + decimais);

        Collections.sort(decimais, Collections.reverseOrder());
        System.out.println("Ordem Decrescente: " + decimais);
    }
}