enum TipoInvestimento {
    RENDA_FIXA, RENDA_VARIAVEL
}

public class Investimento implements Auditavel {
    private int id;
    private double valor;
    private TipoInvestimento tipo;
    private InvestimentoService service = new InvestimentoService();

    public Investimento(int id, double valor, TipoInvestimento tipo) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
    }

    public String avaliarRisco() {
        return service.determinarNivelDeRisco(this);
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public boolean executarAuditoria() {
        if (this.getTipo() == TipoInvestimento.RENDA_VARIAVEL && this.getValor() > 5000) {
            return true;
        }
        if (this.getValor() > 50000) {
            return true;
        }
        return false;
    }

    public TipoInvestimento getTipo() {
        return tipo;
    }
}
