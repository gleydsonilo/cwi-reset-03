public class ControlarEstoque {

    public static void reduzItemEstoque(String item, int qtd) {
        if ("pao".equals(item)) {
            ItensPorQuantidade.pao -= (60 - qtd);
            normalizaEstoque(item);
        }

        if ("torta".equals(item)) {
            ItensPorQuantidade.torta -= qtd;
            normalizaEstoque(item);
        }

        if ("leite".equals(item)) {
            ItensPorQuantidade.leite -= qtd;
            normalizaEstoque(item);
        }

        if ("cafe".equals(item)) {
            ItensPorQuantidade.cafe -= qtd;
            normalizaEstoque(item);
        }

        if ("sanduiche".equals(item)) {
            ItensPorQuantidade.sanduiche -= qtd;
            normalizaEstoque(item);
        }
    }

    public static void normalizaEstoque(String item) {
        if ("pao".equals(item) && ItensPorQuantidade.pao <= 0) {
            ItensPorQuantidade.pao = 0;
        }

        if ("torta".equals(item) && ItensPorQuantidade.torta <= 0) {
            ItensPorQuantidade.torta = 0;
        }

        if ("leite".equals(item) && ItensPorQuantidade.leite <= 0) {
            ItensPorQuantidade.leite = 0;
        }

        if ("cafe".equals(item)&& ItensPorQuantidade.cafe <= 0) {
            ItensPorQuantidade.cafe = 0;
        }

        if ("sanduiche".equals(item)&& ItensPorQuantidade.sanduiche <= 0) {
            ItensPorQuantidade.sanduiche = 0;
        }
    }

    public static int verificaEstoque(String item) {
        int estoque = 0;

        if ("pao".equals(item)) {
            estoque = ItensPorQuantidade.pao;
            return estoque;
        }
        if ("torta".equals(item)) {
            estoque = ItensPorQuantidade.torta;
            return estoque;
        }

        if ("sanduiche".equals(item)) {
            estoque = ItensPorQuantidade.sanduiche;
            return estoque;
        }
        return estoque;
    }
}
