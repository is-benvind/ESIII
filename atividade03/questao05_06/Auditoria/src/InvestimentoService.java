public class InvestimentoService {

    public String determinarNivelDeRisco(Investimento investimento) {
        if (investimento.getTipo() == TipoInvestimento.RENDA_FIXA) {
            if (investimento.getValor() < 50000) {
                return "BAIXO RISCO";
            }
            if (investimento.getValor() < 200000) {
                return "MÉDIO RISCO";
            }
            return "ALTO RISCO";
        }
        if (investimento.getValor() < 50000) {
            return "BAIXO RISCO";
        }
        if (investimento.getValor() < 200000) {
            return "MÉDIO RISCO";
        }
        return "ALTO RISCO";
    }
}
