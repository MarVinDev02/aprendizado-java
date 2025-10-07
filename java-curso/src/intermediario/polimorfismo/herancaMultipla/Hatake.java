package intermediario.polimorfismo.herancaMultipla;

public class Hatake extends Ninja implements SharinganInterface, AmbuInterface, HokageInterface {

    @Override
    public void SharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan!");
    }

    @Override
    public void boasVindas() {
        System.out.println("Seja bem vindo!");
    }

    @Override
    public void NinjaDeElite() {
        System.out.println(nome + ": Eu sou um Anbu!");
    }

    @Override
    public void kageAtivo() {
        System.out.println(nome + ": tornou-se Hokage.");
    }
}
