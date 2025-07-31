package intermediario.poliformismo;

public class Ninja {
    public String nome;
    public int idade;
    public String aldeia;

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
