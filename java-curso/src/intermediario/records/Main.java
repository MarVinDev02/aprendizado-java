package intermediario.records;

public class Main {
    public static void main(String[] args) {
        NinjaRecords cadastro = new NinjaRecords("Naruto", "naruto.uzumaki@gmail.com", 999999999);
        System.out.println(cadastro);
        System.out.println(cadastro.emailCaixaAlta());
        System.out.println("Nome: " + cadastro.nome());

    }
}
