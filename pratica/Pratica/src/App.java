import java.util.LinkedList;

public class App {
    public static void main(String[] args) {

        LinkedList<Ninja> ninjas = new LinkedList<>();

        ninjas.add(new Ninja("Naruto", 18, "Folha"));
        ninjas.add(new Ninja("Sasuke", 19, "Folha"));
        ninjas.add(new Ninja("Kakashi", 30, "Folha"));
        ninjas.add(new Ninja("Sakura", 18, "Folha"));
        ninjas.add(new Ninja("Ino", 18, "Folha"));
        ninjas.add(new Ninja("Hinata", 18, "Folha"));
        ninjas.add(new Ninja("Tenten", 18, "Folha"));
        ninjas.addFirst(new Ninja("Orochimaru", 49, "Folha"));//Adicionando ao inicio da lista.
        System.out.println(ninjas);
        ninjas.remove(0);//removendo do inicio da lista.
        System.out.println(ninjas);//listando ninjas

        String ninja = ninjas.get(2);//Selciono um elemento a partir do indice.
        System.out.println(ninja);
        
    }
}
