public class ItensPorQuantidade {

    static int pao = 3600;
    static int torta = 64; // 4 tortas
    static int sanduiche = 20;
    static int leite = 20;
    static int cafe = 20;

    public static void reduzItemEstoque(String item, int qtd) {
        if ("pao".equals(item)) {
            ItensPorQuantidade.pao -= (60 - qtd);
        }

        if ("torta".equals(item)) {
            ItensPorQuantidade.torta -= qtd;
        }

        if ("leite".equals(item)) {
            ItensPorQuantidade.leite -= qtd;
        }

        if ("cafe".equals(item)) {
            ItensPorQuantidade.cafe -= qtd;
        }

        if ("sanduiche".equals(item)) {
            ItensPorQuantidade.sanduiche -= qtd;
        }
    }
}
