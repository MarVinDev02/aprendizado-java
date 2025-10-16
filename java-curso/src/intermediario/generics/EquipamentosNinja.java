package intermediario.generics;

public class EquipamentosNinja {
    private String nome;
    private boolean vivo;

    public EquipamentosNinja() {
    }

    public EquipamentosNinja(String nome) {
        this.nome = nome;
    }
    public EquipamentosNinja(String nome, boolean vivo) {
        this(nome);
        this.vivo = vivo;

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return  String.format("%s, %s", nome , vivo);
    }
}
