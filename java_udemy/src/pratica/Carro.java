package pratica;

public class Carro {
    String nome;
    String modelo;
    double velocidade;


    Carro(String nome, String modelo){
        this.nome = nome;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    double acelerar(){
        return velocidade += 50.0;
    }

    double frear (){
        return velocidade -= 50.0;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", this.nome, this.modelo, this.velocidade);
    }
}
