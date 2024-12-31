package Fundamentos.wrapers;

public class Wrappers {
    // São os tipos orientados a objetos dos tipos primitivos.
    // Possuem funções específicas e pre-definidas para eles.
    public static void main(String[] args) {
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 1000000L;

        //Números de ponto
        Float f = 123.0F;
        Double d = 2000.0;


        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 30);

        //Booleanos
        //Conversão para booleano
        Boolean bo = Boolean.parseBoolean("true");
        // Conversão para String
        System.out.println(bo.toString().toUpperCase());

        // Characteres
        Character c = '#'; // char

        //

    }
}
