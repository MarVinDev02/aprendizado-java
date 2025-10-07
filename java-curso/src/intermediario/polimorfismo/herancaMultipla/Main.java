package intermediario.polimorfismo.herancaMultipla;

public class Main {
    public static void main(String[] args) {

        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.idade = 30;
        kakashi.aldeia = "Aldeia da Folha";
        kakashi.SharinganAtivado();
        kakashi.NinjaDeElite();
        kakashi.kageAtivo();


        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da folha", 18, 9, NivelNinja.GENNIN);
        sasuke.SharinganAtivado();
        sasuke.inteligenciaDeCombate(150);

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17, 8, NivelNinja.GENNIN);
        naruto.inteligenciaDeCombate();
        naruto.inteligenciaDeCombate(100);



    }
}
