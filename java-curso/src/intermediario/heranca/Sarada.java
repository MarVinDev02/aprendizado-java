package intermediario.heranca;

public class Sarada extends Ninja implements HarunoUchiha{
    @Override
    public void AtivarCura() {
        System.out.println(nome + " ativou a cura!");
    }

    @Override
    public void AtivarSharingan() {
        System.out.println(nome + " ativou o Sharingan!");
    }


}
