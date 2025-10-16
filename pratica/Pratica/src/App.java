import java.util.Scanner;

import cadastros.Cliente;
import cadastros.Funcionario;
import cadastros.Loja;

public class App {
    public static void main(String[] args) {
       
        Cliente cliente = new Cliente("Adalberto", 16, "1234324532423");
        Funcionario funcionario = new Funcionario("Jorge", 40, "3213208312839128");

        Loja<Object> loja = new Loja<>();
        
        loja.adicionarCliente(cliente);
        loja.adicionarCliente(funcionario);

        loja.imprimirPessoas();

    }
}
