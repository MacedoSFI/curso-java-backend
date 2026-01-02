package modulo4;

import java.util.Arrays;
import java.util.List;

public class M4Streams {
    public static void main(String[] args) {
        /*
        "Pensa na Stream como um cano de água. A água (os teus dados)
         entra por uma ponta e, no caminho, tu colocas filtros e
         adaptadores. O mais incrível das operações intermediárias
         é que elas não alteram a tua lista original. Tu crias uma
         nova visão dos dados, de forma limpa e sem precisar de
         criar variáveis temporárias ou listas auxiliares."
         */
        //O Filtro (filter)
        //A Transformação (map)
        //Organização (sorted e distinct)
        //Performance (limit e skip)
        List<String> usuarios = Arrays.asList("angela", "pedro",
                "ana", "guilherme", "angela", "maria", "jose");

        usuarios.stream()
                .distinct()                 // Remove a segunda "ana"
                .filter(n -> n.startsWith("a")) // Filtra quem começa com 'a'
                .map(String::toUpperCase)   // Transforma em "ANA"
                .sorted()                   // Ordena (neste caso, já está só a ANA)
                .forEach(System.out::println);
    }
    /*
    Tarefa: Crie uma lista de Strings com 10 nomes (alguns repetidos
    e com tamanhos diferentes). Utilize Streams para:
    Remover nomes duplicados.
    Filtrar apenas nomes que tenham mais de 5 letras.
    Pular os 2 primeiros nomes da lista resultante (skip).
    Limitar o resultado aos próximos 3 nomes (limit).
    Imprimir os nomes restantes no console.
     */
}
