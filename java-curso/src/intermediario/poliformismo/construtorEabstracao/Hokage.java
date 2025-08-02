package intermediario.poliformismo.construtorEabstracao;

public abstract class Hokage {
    String nome;
    int idade;
    boolean vivoOuNao;

    public Hokage(){
        //Construtor vazio
    }

    public Hokage (String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    public Hokage (String nome){
        this.nome = nome;
    }

    public abstract void sabedoriaHokage ();

}
