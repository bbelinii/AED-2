import java.time.LocalDate;

public class MainOrdenacaoProdutos {
    public static void main(String[] args) {
        Produto[] produtos = {
            new ProdutoNaoPerecivel("Caderno", 20.0),
            new ProdutoPerecivel("Iogurte", 10.0, 0.20, LocalDate.now().plusDays(5)),
            new ProdutoPerecivel("Arroz", 30.0, 0.20, LocalDate.now().plusDays(30)),
            new ProdutoNaoPerecivel("Caneta", 5.0)
        };

        // Troque a linha para testar outro algoritmo estudado:
        QuickProdutos.ordenar(produtos);
        // HeapProdutos.ordenar(produtos);
        // BubbleProdutos.ordenar(produtos);
        // SelectionProdutos.ordenar(produtos);
        // InsertionProdutos.ordenar(produtos);
        // MergeProdutos.ordenar(produtos);

        for (Produto p : produtos) {
            System.out.printf("%.2f -> %s%n", p.valorVenda(), p);
        }
    }
}
