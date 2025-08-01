package intermediario;

public class Ninja {
    public String nome;
    int idade;
    String aldeia;

    public void sharinganAtivado(String nome) {
        System.out.printf("%s O Sharingan ativou!\n", nome);
    }

    public String euSouUmNinja(String nome) {
        return String.format("""
                ------------------------------------------------
                Olá, sou %s e eu sou um ninja.
                ------------------------------------------------
                """, nome);
    }

    public String mostrarIdade(String nome, int idade) {
        return String.format("""
                ------------------------------------------------
                Eu sou %s e tenho %s
                ------------------------------------------------
                """, nome, idade);
    }

    @Override
    public String toString() {
        return String.format("""
                ------------------------------------------------
                Nome: %s
                Aldeia: %s
                Idade: %s
                ------------------------------------------------
                """, nome, aldeia, idade);
    }
}
