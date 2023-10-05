import java.util.List;

class ImpostoDeRenda {
    private String cpfContribuinte;
    private List<Double> rendimentos;
    private List<Double> despesas;

    public ImpostoDeRenda(String cpfContribuinte, List<Double> rendimentos, List<Double> despesas) {
        this.cpfContribuinte = cpfContribuinte;
        this.rendimentos = rendimentos;
        this.despesas = despesas;
    }

    public void processar(List<Validacao> validacoes) {
        for (Validacao validacao : validacoes) {
            if (!validacao.validar(this)) {
                System.out.println("Erro de validação: " + validacao.getClass().getSimpleName());
                return;
            }
        }

        CalculadoraImpostoDeRenda calculadora = new CalculadoraImpostoDeRenda();
        double impostoDevido = calculadora.calcularImposto(rendimentos, despesas);
        RelatorioImpostoDeRenda relatorio = new RelatorioImpostoDeRenda();
        relatorio.gerarRelatorio(this, impostoDevido);
    }

    public String getCpfContribuinte() {
        return cpfContribuinte;
    }

    public List<Double> getRendimentos() {
        return rendimentos;
    }

    public List<Double> getDespesas() {
        return despesas;
    }
}