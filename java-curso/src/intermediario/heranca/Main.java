package intermediario.heranca;

public class Main {
    public static void main(String[] args) {
        //Criando o Naruto.
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 18;
        //naruto.modoSabioAtivado();

        //Criando o Sasuke.
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 19;
        //sasuke.sharinganAtivado();

        //Criando a Sakura
        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.aldeia = "Aldeia da folha";
        sakura.idade = 19;
        //sakura.ativarCura();

        //Criando a Hinata
        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata Hyuga";
        hinata.aldeia = "Aldeia da folha";
        hinata.idade = 18;
        //hinata.ativarByakugan();

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto";
        boruto.aldeia = "Aldeia da Folha";
        boruto.idade = 13;
        boruto.modoSabioAtivado();
        boruto.ativarOKarma();
        boruto.ativarJougan();

    }
}
