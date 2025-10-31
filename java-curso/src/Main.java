import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto");
        ninjas.add("Sakura");
        ninjas.add("Sasuke");
        ninjas.add("Naruto");
        ninjas.add("Danzo");
        ninjas.add("Kakashi");
        ninjas.add("Minato");
        System.out.println("ninjas = " + ninjas);

        //Coloca os elementos na ordem correta da ordenação
//        Set<String> ninjasSet = new TreeSet<>();
        //Coloca na ordem de implementação.
        Set<String> ninjasLinkSet = new LinkedHashSet<>();
        ninjasLinkSet.addAll(ninjas);


        System.out.println(ninjasLinkSet);



    }
}
