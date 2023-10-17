package view;

import java.util.Stack;

public class Principal {
    public static void inverterPilha(Stack<Integer> pilha) {
        Stack<Integer> pilhaAuxiliar = new Stack<>();
        
        // Transfere todos os elementos da pilha original para a pilha auxiliar
        while (!pilha.isEmpty()) {
            pilhaAuxiliar.push(pilha.pop());
        }
        
        // Transfere os elementos de volta para a pilha original
        while (!pilhaAuxiliar.isEmpty()) {
            pilha.push(pilhaAuxiliar.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        
        // Preenche a pilha com alguns elementos de exemplo
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        
        System.out.println("Pilha original: " + pilha);
        
        inverterPilha(pilha);
        
        System.out.println("Pilha invertida: " + pilha);
    }
}

