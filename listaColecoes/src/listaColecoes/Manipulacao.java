package listaColecoes;

import java.util.ArrayList;
import java.util.Random;

public class Manipulacao { 
    
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random gerador = new Random();

        for (int i = 0; i < 10; i++) {
            numeros.add(gerador.nextInt(100));
        }

        System.out.println("Lista Original: " + numeros);

        if (numeros.size() >= 3) {
            numeros.remove(2);
        }
        
        numeros.add(0, 500);

        System.out.println("Lista Modificada: " + numeros);

        if (numeros.contains(15)) {
            System.out.println("O número 15 está na lista!");
        } else {
            System.out.println("O número 15 NÃO está na lista.");
        }
    }
}