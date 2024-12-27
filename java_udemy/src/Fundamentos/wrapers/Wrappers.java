package Fundamentos.wrapers;

public class Wrappers {
    public static void main(String[] args) {
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 1000000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 30);

        //Booleanos
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo.toString().toUpperCase());
        
        // Characteres
        Character c = '#'; // char


    }
}
