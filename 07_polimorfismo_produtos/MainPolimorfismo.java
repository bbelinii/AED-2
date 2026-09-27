import java.time.LocalDate;

public class MainPolimorfismo {
    public static void main(String[] args) {
        Produto[] produtos = {
            new ProdutoNaoPerecivel("Caderno", 20.0),
            new ProdutoPerecivel("Iogurte", 10.0, 0.20, LocalDate.now().plusDays(5)),
            new ProdutoPerecivel("Arroz", 30.0, 0.20, LocalDate.now().plusDays(30))
        };

        // Todos são vistos pela variável como Produto.
        // Porém o objeto real pode ser de subclasses diferentes.
        for (Produto p : produtos) {
            // Aqui ocorre o polimorfismo:
            // Java escolhe o valorVenda() correspondente ao objeto real.
            System.out.println(p);
        }
    }
}
