package examples;

/*
 *Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {
    public static void main(String[] args) {
        //usar o supplier com expressão lambda para fornecer uma saudação personalizada.
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        //usar o supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        //Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);

    }

}
