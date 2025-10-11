package intermediario.polimorfismo.herancaMultipla;

public abstract class Ninja  implements EstrategiaDeBatalha{
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;
    final double altura = 2.10;
    //TODO: Incluir dois novos atributos: numeroDeMissoesConcluidas, Rank
    //TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    public Ninja() {
    }

    //nenhuma classe vai poder sobreescrever esse método.
    //Final significa uma constante.
    final public void tacarKunai(){
        System.out.println("Eu sou um método da classe mãe");
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do construtor chamando os novos atributos.
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        //Sobrecarga de método, referenciando o construtor antigos.
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    //SobrecargaDeMetodos


    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Meu nome é " + nome + " e essa é a minha estratégia de batalha.");

    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if(qi > 150){
            System.out.println("Seu QI é " + qi + " e você é um gênio.");
        }else if(qi >= 130){
            System.out.println("Seu QI é " + qi + " e você é um ninja absurdo");
        }else {
            System.out.println("Seu QI é " + qi + "e você precisa estudar mais." );
        }
    }

    public void estrategiaDeBatalha(int qi) {
        System.out.println("Meu nome é " + nome + " e essa é a minha estratégia de batalha.");

    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + nome + " e essa é a minha inteligencia de combate.");
    }


}
