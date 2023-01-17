package list;

import java.util.*;

class ExemploList {
    public static void main(String[] args) {
/*  Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça: 
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

        // Formas de iniciar uma list:

        // List notas = new ArrayList(); //antes do java 5
        // List<Double> notas = new ArrayList<>(); //Diamond Operator <> - java 7
        // ArrayList<Double> notas = new ArrayList<>(); //não recomendado porque é voltado pra implementação e não pra interface
        // List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/ // Dessa forma não é possível adicionar ou remover novos elementos na lista

        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        // Exibir a posição usando método indexOf
        System.out.println("\nExiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        // Método contains confere se o valor, nesse caso double, está na lista notas
        System.out.println("\nConfira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("\nExiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);

        // Método get passa a possição e recebe o elemento
        System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2)); //index começa em 0, por isso terceira posição é 2
        System.out.println(notas.toString());

        System.out.println("\nExiba a menor nota: " + Collections.min(notas)); //como essa list é uma collection é possível usar esse tipo de método para valores máx e min

        System.out.println("\nExiba a maior nota: " + Collections.max(notas));

        // Iterator identifica os diferentes valores dentro da collection, podendo ser usado para criar um laço
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next(); //next se refere ao próximo elemento, nesse caso, soma o próximo 
            soma += next;
        }
        System.out.println("\nExiba a soma dos valores: " + soma);

        System.out.println("\nExiba a média das notas: " + (soma/notas.size())); //size retorna a quantidade de números na collection

        // Para remover usar o método remove
        System.out.println("\nRemova a nota 0: ");
        notas.remove(0d); //se colocar 0 sem o d, irá remover a posição 0 e não a nota 0
        System.out.println(notas);

        System.out.println("\nRemova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        // Método clear para apagar toda a lista
        System.out.println("\nApague toda a lista");
        notas.clear();
        System.out.println(notas);
        
        //Método isEmpty retorna true quando está vazio e false se tiver valores na lista
        System.out.println("\nConfira se a lista está vazia: " + notas.isEmpty());

    }
}
