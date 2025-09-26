package intermediario.primeiroDesafio;

public class Main {
    public static void main(String[] args) {
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.missao = "Recuperar amuleto";
        sasuke.nivelDificuldade = "Dificil";
        sasuke.statusMissao = "Concluido";
        sasuke.habilidadeEspecial = "Chidori";
        sasuke.mostrarInformacoes();
    }
}
