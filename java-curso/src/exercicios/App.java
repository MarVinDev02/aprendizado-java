package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Integer> n = new ArrayList<>();
        adicionarNumero(n);
        somarNumeros(n);

    }

    static void adicionarNumero(List<Integer> n){
        Scanner ent = new Scanner(System.in);

        while(true){
            System.out.println("Insira o número '0 - Para'");
            int num = ent.nextInt();

            if(num == 0){
                break;
            }
            n.add(num);
        }
    }

    static void somarNumeros(List<Integer> n) {
        int soma = 0;

        for(int numero : n){
            soma += numero;
        }
        System.out.println("Resultado: " + soma);

    }
}