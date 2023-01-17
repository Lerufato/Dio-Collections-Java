package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e IDE.
Em seguida, crie um conjunto com 3 linguagens e faça um programa que ordene esse conjunto por:
a) Ordem de inserção;
b) Ordem natural(nome);
c) IDE;
d) Ano de criação e nome;
e) Nome, ano de criação e IDE;
Ao final, exiba as linguagens no console, um abaixo da outra.
*/

public class Exercicio2 {
    public static void main(String[] args) {
        Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));

        System.out.println("--------\tOrdem de Inserção\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas1 = new LinkedHashSet<>(
                Arrays.asList(
                        new LinguagemFavorita("Python", 1991, "Pycharm"),
                        new LinguagemFavorita("JavaScript", 1995, "IntelliJ"),
                        new LinguagemFavorita("Java", 1991, "Visual Studio Code")
                )
        );
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas1) System.out.println(linguagem);

        System.out.println("--------\tOrdem Natural: Nome\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas2 = new TreeSet<>(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas2) System.out.println(linguagem);

        System.out.println("--------\tOrdem IDE\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas3) System.out.println(linguagem);

        System.out.println("--------\tOrdem Ano de Criacao e Nome\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
        minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas4) System.out.println(linguagem);

        System.out.println("--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
        minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas3);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas5) System.out.println(linguagem);

    }

}