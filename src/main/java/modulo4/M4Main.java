package modulo4;

import java.util.*;

public class M4Main {
    public static void main(String[] args) {
        System.out.println("Main do módulo 4");

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("João");
        nomes.add("José");
        nomes.add("João");
        nomes.add("Pedro");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        Set<String> convidados = new HashSet<>();
        convidados.add("Alice");
        convidados.add("Alice"); // O Java vai ignorar este silenciosamente
        System.out.println("Tamanho da Lista de convidados" +
                convidados.size()); // Resultado: 1

        Map<String, String> estados = new HashMap<>();
        estados.put("SP", "São Paulo");
        estados.put("RJ", "Rio de Janeiro");

        System.out.println(estados.get("SP")); // Retorna "São Paulo"

    }
}
