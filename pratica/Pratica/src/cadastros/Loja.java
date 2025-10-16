package cadastros;

import java.util.ArrayList;
import java.util.List;

public class Loja<T> {
    List<T> cadastro;

    //Construtor
    public Loja() {
        this.cadastro = new ArrayList<>();
    }

    //Criar método adicionar cliente.
    public void adicionarCliente(T pessoa){
        cadastro.add(pessoa);
    }

    public void imprimirPessoas(){
        for (T pessoa : cadastro){
            System.out.println(pessoa);
        }
    }
    
}
