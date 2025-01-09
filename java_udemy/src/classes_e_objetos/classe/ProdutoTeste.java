package classes_e_objetos.classe;

import java.text.DecimalFormat;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook",4356.89,  0.25);

        var p2 = new Produto();
        p2.nome = "Caneta Preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double media = (precoFinal1 + precoFinal2) / 2;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(precoFinal1));
        System.out.println(df.format(precoFinal2));
        System.out.println(df.format(media));
    }
}
