package cadastros;

public class Cliente{
    private String nome;
    private int idade;
    private String id;
    
    public Cliente() {
    }

    public Cliente(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("""
            Nome: %s
            Idade: %s
            ID: %s
        """, nome, idade, id);
    }
    
}