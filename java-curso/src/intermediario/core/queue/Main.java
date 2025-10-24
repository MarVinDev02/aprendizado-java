package intermediario.core.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> ninjasQueue = new LinkedList<>();//Inicialização

        ninjasQueue.add("Naruto Uzumaki");//Adicionar elemento
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Shikamaru");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("kohonamaru");
        ninjasQueue.add("Jiraya");
        


        System.out.println("Ninjas na fila" + ninjasQueue);//Mostrar a fila

        //Tirar o elemento da fila. Tira sempre o Head
        //Só posso deletar o Head
        ninjasQueue.poll();

        System.out.println("Ninjas da fila depois do poll" + ninjasQueue);

        //Ver o primeiro elemento
        System.out.println("Ninja no Head" + ninjasQueue.peek());

        ninjasQueue.add("Hashirama");
        ninjasQueue.add("Tobirama");

        System.out.println("Adicionados: " + ninjasQueue);

        //Esvaziar fila
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();
        ninjasQueue.poll();

        //Verificando se a fila está vazia.
        if(ninjasQueue.isEmpty()){
            System.out.println("A fila está vazia.");
        }
    }
}
