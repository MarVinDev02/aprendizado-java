package intermediario.records;

public record NinjaRecords(String nome, String email, int telefone) {
    public String emailCaixaAlta(){
        return email.toUpperCase();
    }

    //todos os atributos são finals.
    //não possuem setters
    //Utilizado quando eu sei que não vou alterar o valor dos atributos da minha classe.
}
