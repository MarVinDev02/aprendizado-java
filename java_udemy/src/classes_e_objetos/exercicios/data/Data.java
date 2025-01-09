package classes_e_objetos.exercicios.data;

public class Data {
    String dia;
    String mes;
    String ano;

    String obterDataFormatada(){
        return String.format("%s/%s/%s", dia, mes, ano);
    }
    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }
}
