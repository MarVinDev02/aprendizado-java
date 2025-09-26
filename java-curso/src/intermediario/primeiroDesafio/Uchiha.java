package intermediario.primeiroDesafio;

public class Uchiha extends Ninja{
    String habilidadeEspecial;

    public void exibirHabilidadeEspecial(){
        System.out.println(habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade especial: " + habilidadeEspecial);
    }
}
