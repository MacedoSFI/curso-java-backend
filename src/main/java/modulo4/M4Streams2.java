package modulo4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class M4Streams2 {
    public static void main(String[] args) {
        List<String> usuarios = Arrays.asList("Ana", "Beto", "Carlos");

// Queremos achar o primeiro usuário que começa com "Z"
        String usuarioEncontrado = usuarios.stream()
                .filter(n -> n.startsWith("Z"))
                .findFirst() // Isso retorna um Optional!
                .orElse("Nenhum usuário com Z encontrado");

        System.out.println(usuarioEncontrado);
    }
}
