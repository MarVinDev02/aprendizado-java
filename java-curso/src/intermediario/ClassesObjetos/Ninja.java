package intermediario.ClassesObjetos;

public class Ninja {
    String nome;
    int idade;
    String aldeia;
    int idadeMinimaParaSeTornarHokage;

    public void SharinganAtivado() {
        System.out.println("O Sharingan ativou!");
    }

    /*
     * Método String vai ter que retornar uma string obrigatóriamente.
     */
    public String euSouUmNinja() {
        return "Olá, eu sou um Ninja.";
    }

    /*
     * Método int vai retornar um int
     * */

    public int anosParaSeTornarHokage(int idadeMinimaParaSeTornarHokage){
        return idadeMinimaParaSeTornarHokage - idade;
    }
}

