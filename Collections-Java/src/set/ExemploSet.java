package set;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {
        /* 
        Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
        
        Exiba a posição da nota 5.0
        Adicione na lista a nota 8.0 na posição 4
        Substitua a nota 5.0 pela nota 6.0
        Confira se a nota 5.0 está na lista
        Exiba a terceira nota adicionada
        Exiba a menor nota
        Exiba a maior nota
        Exiba a soma dos valores
        Exiba a média das notas
        Remova a nota 0
        Remova a nota da posição 
        Remova as notas menores que 7 e exiba a lista
        Apague toda a lista
        Confira se a lista está vazia
        */
        
        // Set notas = new HashSet(); //antes do java 5
        // HashSet<Double> notas = new HashSet<>();
        // Set<Double> notas = new HashSet<>(); //Generics(jdk 5) - Diamont Operator(jdk 7)

        /*Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
        */
        
            System.out.println("Crie um conjunto e adicione as notas: ");
            Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
            System.out.println(notas.toString()); //diferente do list, os números não aparecem na ordem de inserção e os números repetidos não são apresentados
        
        // System.out.println("Exiba a posição da nota 5.0: "); //Não é possível pois não tem ordem
        
        // System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        
        // System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        
            System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));
        
        // System.out.println("Exiba a terceira nota adicionada: ");
        
            System.out.println("Exiba a menor nota: " + Collections.min(notas));
        
            System.out.println("Exiba a maior nota: " + Collections.max(notas));
        
            Iterator<Double> iterator = notas.iterator();
            Double soma = 0.0;
            while(iterator.hasNext()) {
                Double next = iterator.next();
                soma += next;
            }
            System.out.println("Exiba a soma dos valores: " + soma);
        
            System.out.println("Exiba a média das notas: " + (soma/ notas.size()));
        
            System.out.println("Remova a nota 0: ");
            notas.remove(0d);
            System.out.println(notas);
        
        // System.out.println("Remova a nota da posição 0");
        
            System.out.println("Remova as notas menores que 7 e exiba a lista: ");
            Iterator<Double> iterator1 = notas.iterator();
            while(iterator1.hasNext()){
                Double next = iterator1.next();
                if (next < 7) iterator1.remove();
            }
            
            System.out.println(notas);
        
            System.out.println("Exiba todas as notas na ordem em que foram informados: ");
            Set<Double> notas2 = new LinkedHashSet<>();
            notas2.add(7d);
            notas2.add(8.5);
            notas2.add(9.3);
            notas2.add(5d);
            notas2.add(7d);
            notas2.add(0d);
            notas2.add(3.6);
            System.out.println(notas2);
        
            System.out.println("Exiba todas as notas na ordem crescente: ");
            Set<Double> notas3 = new TreeSet<>(notas2); //TreeSet organiza de acordo com a ordem natural dos elementos
            System.out.println(notas3);
        
            System.out.println("Apague todo o conjunto");
            notas.clear();
            notas2.clear();
        
            System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
            System.out.println("Confira se o conjunto 2 está vazio: " + notas2.isEmpty());
            System.out.println("Confira se o conjunto 3 está vazio: " + notas3.isEmpty());
        
            }
}
