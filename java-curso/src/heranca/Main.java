package heranca;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da folha";
        naruto.idade = 17;
        naruto.habilidadeEspecialUzumaki();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 18;

        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.aldeia = "Aldeia da folha";
        sakura.idade = 18;
        sakura.habilidadeEspecialHaruno();

        Hyuga hinata = new Hyuga();
        hinata.nome = "Hinata Hyuga";
        hinata.aldeia = "Aldeia da folha";
        hinata.idade = 17;
        hinata.habilidadeEspecialHyuga();

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Hyuga Uzumaki";
        boruto.aldeia = "Aldeia da Folha";
        boruto.idade = 9;
        boruto.ativarJougan();
        boruto.ativarOkarma();
        boruto.habilidadeEspecialUzumaki();


    }
}
