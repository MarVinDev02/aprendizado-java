package intermediario;

public class Ninja {
    String nome;
    int idade;
    String aldeia;

    public void sharinganAtivado(){
        System.out.println("O Sharingan ativou!\n");
    }

    public String euSouUmNinja(String nome){
        return String.format("""
                Olá, sou %s e eu sou um ninja.
                """, nome);
    }

    @Override
    public String toString() {
        return String.format("""
                Nome: %s
                Aldeia: %s
                Idade: %s
                """, nome, aldeia, idade);
    }
}
