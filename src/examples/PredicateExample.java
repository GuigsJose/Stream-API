package examples;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
    * Representa uma função que aceita um argumento do tipo T e retorna um valor booleano
    * É comumente usado para filtrar os elementos do Stream com base em alguma condição.
 */
public class PredicateExample {
    public static void main(String[] args) {
        //criar uma lista de palavras
        List<String> palavras = Arrays.asList("java","kotlin","pyton","javascript","c#","ruby","go");

        // Criar um predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // Usar o stream para filtrar as palavras com mais de 5 caractere e, em seguida,
        // imprimir cada palavra que passou no filtro
        palavras.stream()
                .filter(p -> p.length() < 5)
                .forEach(System.out::println);

    }



}
