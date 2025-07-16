import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      //testando memória de referência em Java;

        String[] marcus = new String[1];
        marcus[0] = "Marcus";
        for(var item : marcus){
            System.out.println(item);
        }
        System.out.println(marcus);

        String[] jonacir = marcus;
        for(var item : jonacir){
            System.out.println(item);
        }
        System.out.println(jonacir);


    }
}