package modulo4;

import java.util.ArrayList;
import java.util.List;

public class Generics4_2Main {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("João");
        lista.add(25);
        String soTexto = (String) lista.get(0);
        //soTexto = (String) lista.get(1);

        RespostaAPI<String> nomes = new RespostaAPI<>("João", 1);
        System.out.println(nomes.getDados());

        RespostaAPI<Integer> numeros = new RespostaAPI<>(25, 1);
        System.out.println(numeros.getDados());

        RespostaAPI<Double> valores = new RespostaAPI<>(30.0, 1);
        System.out.println(valores.getDados());
    }

}
