package intermediario.enums;

public enum RankDeMissoes {
    //Elementos que nunca irão mudar.
    D("Baixo", 2),
    C("Moderado", 3),
    B("Confortável", 4),
    A("Dificil", 5),
    S("Altissimo", 6);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}

