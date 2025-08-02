package intermediario.poliformismo.construtorEabstracao;

public class Senju extends Hokage{
    public Senju() {
    }

    public Senju(String nome, int idade, boolean vivoOuNao) {
        super(nome, idade, vivoOuNao);
    }

    @Override
    public void sabedoriaHokage() {
        System.out.println("Você ganhou sabedoria.");
    }
}
