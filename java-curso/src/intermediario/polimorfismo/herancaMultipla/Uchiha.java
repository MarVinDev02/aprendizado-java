package intermediario.polimorfismo.herancaMultipla;

public class Uchiha extends Ninja implements SharinganInterface{
    @Override
    public void SharinganAtivado(){
        System.out.println("Sharingan ativou");
    }

    @Override
    public void boasVindas() {

    }

    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println(nome + " seu QI é " + qi + " e você é um gênio.");
        } else if (qi >= 130) {
            System.out.println(nome + " seu QI é " + qi + " e você é um ninja absurdo");
        } else {
            System.out.println(nome + " seu QI é " + qi + " e você precisa estudar mais.");
        }
    }
}
