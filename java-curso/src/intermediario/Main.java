package intermediario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //Criando o Naruto.
        Ninja naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 18;
        String falarIdade = naruto.mostrarIdade(naruto.nome, naruto.idade);


        //Criando o Sasuke.
        Ninja sasuke = new Ninja();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 19;
        sasuke.sharinganAtivado(sasuke.nome);

        //Criando a Sakura
        Ninja sakura = new Ninja();
        sakura.nome = "Sakura Haruno";
        sakura.aldeia = "Aldeia da folha";
        sakura.idade = 19;
        String apresentacao = sakura.euSouUmNinja(sakura.nome);
        System.out.println(falarIdade);
        System.out.println(apresentacao);

        System.out.println(naruto + "\n" + sakura + "\n" + sasuke);

    }
}

