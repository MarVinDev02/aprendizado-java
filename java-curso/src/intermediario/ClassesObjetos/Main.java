package intermediario.ClassesObjetos;

public class Main {
    public static void main(String[] args) {
        //Criar o ninja Naruto
        Ninja naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 17;
        naruto.aldeia = "Aldeia da Folha";

        //Criando Sasuke
        Ninja sasuke = new Ninja();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 19;
        sasuke.aldeia = "Aldeia da Folha";
        int quantoTempoFalta = sasuke. anosParaSeTornarHokage(60);

        System.out.println("Você tem " + sasuke.idade +" anos. Faltam " +
                quantoTempoFalta + " anos para se tornar Hokage.");

        //Aplicando método aos meus objetos.
        sasuke.SharinganAtivado();
        String euSouUmNinja = sasuke.euSouUmNinja();
        System.out.println(euSouUmNinja);

        //Criar Sakura Haruno
        Ninja sakura = new Ninja();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 17;
        sakura.aldeia = "Aldeia da Folha";



    }
}
