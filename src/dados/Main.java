package dados;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 *
 * @author Felipe-PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>(5);
        
        System.out.println("Inserindo os numeros 1,2,3,4,5 na lista");
        for (int i = 1; i < 6; i++) {
            lista.add(i);
        }
        System.out.println(lista);
        System.out.println("***********************************");
        System.out.println("Removendo os dados da celula inicial da lista");
        while(!lista.isEmpty()){
            int num = lista.remove(0);
            System.out.println(lista);
        }
        System.out.println("Lista vazia");
        System.out.println("***********************************");
        System.out.println("Inserindo os dados da lista na pilha");
        ArrayDeque<Integer> pilha = new ArrayDeque<>(5);
        for (int i = 1; i < 6; i++) {
            pilha.push(i);
        }
        System.out.println(pilha);
        System.out.println("***********************************");
        System.out.println("Removendo os dados da pilha");
        pilha.clear();
        System.out.println(pilha);
        System.out.println("***********************************");
        while(!pilha.isEmpty()){
            int num = pilha.pop();
            System.out.println(pilha);
        }
        System.out.println("Inserindo os dados da pilha na fila");
        ArrayDeque<Integer> fila = new ArrayDeque<>(10);
        for (int i = 1; i < 6; i++) {
            fila.add(i);
        }
        System.out.println(fila);
        System.out.println("***********************************");
        System.out.println("Adicionando os numeros 6,7,8,9 e 10 na lista");
        for (int i = 6; i < 11; i++) {
            lista.add(i);
        }
        System.out.println(lista);
        System.out.println("***********************************");
        System.out.println("Removendo os dados das celulas iniciais da lista");
        while(!lista.isEmpty()){
            int num = lista.remove(0);
            System.out.println(lista);
        }
        System.out.println("Lista vazia");
        System.out.println("***********************************");
        System.out.println("Removendo os dados da pilha");
        pilha.clear();
        System.out.println(pilha);
        System.out.println("***********************************");
        System.out.println("Inserindo os dados da pilha na fila");
        for (int i = 6; i < 11; i++) {
            lista.add(i);
        }
        System.out.println(fila);
    }
}
