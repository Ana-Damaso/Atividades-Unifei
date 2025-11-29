package listaColecoes;

import java.util.ArrayList;
import java.util.Arrays;

public class Remocao {
    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 4, 11, 13, 20));

        System.out.println("Lista completa " + lista);

        lista.removeIf(n -> n % 2 == 0);

        System.out.println("Somente ímpares: " + lista);
    }
}
