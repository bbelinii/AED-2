public class Produto {
    private static final double MARGEM_PADRAO = 0.20;

    private String descricao;
    protected double precoCusto;
    protected double margemLucro;

    public Produto(String descricao, double precoCusto, double margemLucro) {
        init(descricao, precoCusto, margemLucro);
    }

    public Produto(String descricao, double precoCusto) {
        this(descricao, precoCusto, MARGEM_PADRAO);
    }

    // Método auxiliar apenas para centralizar a inicialização.
    protected void init(String descricao, double precoCusto, double margemLucro) {
        this.descricao = descricao;
        this.precoCusto = precoCusto;
        this.margemLucro = margemLucro;
    }

    public double valorVenda() {
        return precoCusto * (1.0 + margemLucro);
    }

    @Override
    public String toString() {
        return descricao + " | custo=" + precoCusto + " | venda=" + valorVenda();
    }
}
