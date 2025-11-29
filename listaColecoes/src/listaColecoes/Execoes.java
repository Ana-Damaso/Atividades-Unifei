package listaColecoes;

import java.util.ArrayList;

public class Execoes {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        
        strings.add("10");
        strings.add("20");
        strings.add("abc");
        strings.add("30");

        for (String s : strings) {
            try {
                int numero = Integer.parseInt(s);
                System.out.println("Convertido com sucesso: " + numero);
                
            } catch (NumberFormatException e) {

                System.out.println("Erro ao converter: '" + s + "' não é um número válido.");
            }
        }
    }
}