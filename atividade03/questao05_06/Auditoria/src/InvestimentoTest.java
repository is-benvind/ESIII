public class InvestimentoTest {
    public static void main(String[] args) {
        Investimento investimento1 = new Investimento(1, 10000, TipoInvestimento.RENDA_FIXA);
        Investimento investimento2 = new Investimento(2, 6000, TipoInvestimento.RENDA_VARIAVEL);

        InvestimentoService investimentoService = new InvestimentoService();

        String risco1 = investimentoService.determinarNivelDeRisco(investimento1);
        String risco2 = investimentoService.determinarNivelDeRisco(investimento2);

        System.out.println("Investimento 1: Nível de Risco = " + risco1);
        System.out.println("Investimento 2: Nível de Risco = " + risco2);
    }
}
