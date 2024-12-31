package classes_e_objetos.exercicios.data;

public class DataTeste {
    public static void main(String[] args) {
        Data data = new Data();

        data.dia = "02";
        data.mes = "01";
        data.ano = "1995";

System.out.printf("%s/%s/%s", data.dia, data.mes, data.ano);
    }
}
