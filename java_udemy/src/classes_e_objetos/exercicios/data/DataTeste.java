package classes_e_objetos.exercicios.data;

public class DataTeste {
    public static void main(String[] args) {
        Data data = new Data();
        data.dia = "02";
        data.mes = "01";
        data.ano = "1995";

        Data data2 = new Data();
        data2.dia = "07";
        data2.mes = "04";
        data2.ano = "1987";

        data.imprimirDataFormatada();
        data2.imprimirDataFormatada();
    }
}
