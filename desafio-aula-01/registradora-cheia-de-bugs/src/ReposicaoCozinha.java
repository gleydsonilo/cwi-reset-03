public class ReposicaoCozinha {

    static void reporItem(String item) {
        if ("pao".equals(item)) {
            ItensPorQuantidade.pao = 3600;
        }
        if ("torta".equals(item)) {
            ItensPorQuantidade.torta = 64; //4 tortas
        }
        if ("sanduiche".equals(item)) {
            ItensPorQuantidade.sanduiche = 20;
        }
    }
}
