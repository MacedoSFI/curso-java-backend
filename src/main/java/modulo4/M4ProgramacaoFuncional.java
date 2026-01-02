package modulo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class M4ProgramacaoFuncional {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Java", "Spring", "Node", "Python");
        List<String> filtrados = new ArrayList<>();

        for (String n : nomes) {
            if (n.length() > 4) {
                filtrados.add(n.toUpperCase());
            }
        }

        for (String n : filtrados) {
            System.out.println(n);
        }

        //  O JEITO MODERNO (FUNCIONAL COM STREAMS)

        List<String> filtradosFun = nomes.stream()
                .filter(n -> n.length() > 4)
                .map(String::toUpperCase)
                .toList();

        for (String n : filtradosFun) {
            System.out.println(n);
        }

        nomes.stream()
                .filter(n -> n.length() <= 4)
                .forEach(System.out::println);
    }
    /*
    Tarefa: Crie uma classe Produto com nome e preco. No seu main:

Crie uma lista com 5 produtos diferentes.

Use Streams para:

Filtrar apenas os produtos com preço maior que 100.

Mapear apenas os nomes desses produtos.

Coletar o resultado em uma nova List<String>.

Imprima a lista final.
     */
}
