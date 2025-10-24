import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import cadastros.Cliente;
import cadastros.Funcionario;
import cadastros.Loja;

public class App {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>(); //inicia linkedlist

        linkedList.add("Naruto"); //adiciona elemento
        linkedList.add("Sakura");
        linkedList.add("Sasuke");

        System.out.println(linkedList);

        linkedList.add(0,"Kakashi"); //adiciona um elemento pelo índice dele.

        System.out.println(linkedList); 

        linkedList.remove(2); //remove elemento pelo indice.

        System.out.println(linkedList); 


    }
}
