package cadastros;

import java.util.ArrayList;
import java.util.List;

public class Loja<T> {
   private List<T> cadastro;
   

   public Loja() {
    this.cadastro = new ArrayList<>();
   }

   public void adicionarCliente(T cliente){
    cadastro.add(cliente);
   }

   public void exibirCliente(){
    for (T clientes : cadastro){
        System.out.println(clientes);
    }
   }
   
   public List<T> getCadastro() {
    return cadastro;
   }

   public void setCadastro(List<T> cadastro) {
    this.cadastro = cadastro;
   }

      

    
}
