package Fundamentos.doWile;

import java.util.Scanner;

public class DoWhile {
    // sintax - do{bloco de código} while(condição);
    //do while é sempre executada ao menos uma vez.

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String texto = "";
        int tentativas = 0;
        do {
            System.out.println("Você precisa falar as palavras mágicas...");
            System.out.println("Quer sair?");
            texto = entrada.nextLine();
            tentativas++;
            System.out.println("Número de tentativas: " + tentativas);
        }while(!texto.equalsIgnoreCase("por favor") && tentativas <= 3 - 1 );

        if(tentativas == 3){
            System.out.println("Você excedeu o número de tentativas.");
        }else {
            System.out.println("Obrigado");
        }
        entrada.close();
    }

}
