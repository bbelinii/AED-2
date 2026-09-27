import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProdutoPerecivel extends Produto {
    private static final double DESCONTO = 0.25;
    private static final int PRAZO_DESCONTO = 7;

    private LocalDate dataValidade;

    public ProdutoPerecivel(
            String descricao,
            double precoCusto,
            double margemLucro,
            LocalDate dataValidade) {

        super(descricao, precoCusto, margemLucro);

        if (dataValidade.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Data de validade não pode estar no passado.");
        }

        this.dataValidade = dataValidade;
    }

    @Override
    public double valorVenda() {
        LocalDate hoje = LocalDate.now();

        if (dataValidade.isBefore(hoje)) {
            throw new IllegalStateException("Produto vencido não pode ser vendido.");
        }

        double valorNormal = super.valorVenda();
        long diasAteVencimento = ChronoUnit.DAYS.between(hoje, dataValidade);

        if (diasAteVencimento <= PRAZO_DESCONTO) {
            return valorNormal * (1.0 - DESCONTO);
        }

        return valorNormal;
    }

    @Override
    public String toString() {
        return super.toString() + " | validade=" + dataValidade;
    }
}
