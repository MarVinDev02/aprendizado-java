package intermediario.encapsulamento;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------------Naruto Uzumaki------------------------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17, 9, 1.58);
        naruto.setNome("Uzumaki Naruto");
        System.out.println(naruto.getNome());

    }
}
