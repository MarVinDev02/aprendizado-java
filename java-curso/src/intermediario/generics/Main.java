package intermediario.generics;

public class Main {
    public static void main(String[] args) {
       BolsaNinja<Object> bolsaNinja= new BolsaNinja<>();
       bolsaNinja.adicionarFerramenta(new Kunai("Kunai Explosiva"));
       bolsaNinja.adicionarFerramenta(new Pergaminho("Pergaminho vazio"));
       bolsaNinja.adicionarFerramenta(new Shuriken(12));
       bolsaNinja.adicionarFerramenta(new CompanheiroNinja("Mamaru"));
        System.out.println("(---------Lista de ferramentas---------)");
       bolsaNinja.mostrarFerramenta();
        System.out.println("(--------------------------------------)");




    }
}
