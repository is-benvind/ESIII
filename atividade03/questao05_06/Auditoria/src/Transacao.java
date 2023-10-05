enum TipoTransacao {
    CREDITO, DEBITO
}

public class Transacao implements Auditavel {
    private int id;
    private double valor;
    private TipoTransacao tipo;
    private TransacaoService service = new TransacaoService();

    public Transacao(int id, double valor, TipoTransacao tipo) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
    }

    public boolean verificarPossivelFraude() {
        return service.identificarFraude(this);
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public TipoTransacao getTipo() {
        return tipo;
    }

    @Override
    public boolean executarAuditoria() {
        if (this.verificarPossivelFraude()) {
            return true;
        }
        return false;
    }
}