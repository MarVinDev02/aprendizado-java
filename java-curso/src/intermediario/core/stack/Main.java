package intermediario.core.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.push("Naruto Uzumaki");//Adiciona Elemento

        ninjasStack.push("Sasuke Uchiha");
        ninjasStack.push("Sakura Haruno");

        System.out.println(ninjasStack.peek());//Vê qual o ultimo elemento na lista.
        ninjasStack.pop();//Deleta o ultimo elemento da pilha (no topo)

        System.out.println(ninjasStack.peek());
        System.out.println(ninjasStack.size());//Vê o tamanho da Stack.)

    }
}

//Uma lista na vertical.
//O ultimo a entrar é o primeiro a sair.
