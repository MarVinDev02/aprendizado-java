package heranca;

public class Boruto extends Uzumaki implements HyugaUzumaki{

    @Override
    public void ativarOkarma() {
        System.out.println(nome + " ativou o Karma!");
    }

    @Override
    public void ativarJougan() {
        System.out.println(nome + " ativou Jougan!");
    }
}
