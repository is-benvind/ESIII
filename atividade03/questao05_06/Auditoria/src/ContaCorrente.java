import java.util.List;

public class ContaCorrente implements Auditavel {
    private String numero;
    private double saldo;
    private List<Transacao> transacoes;
    private ContaCorrenteService service = new ContaCorrenteService();

    public ContaCorrente(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public List<Transacao> obterTransacoesInvalidas(){
        return service.encontrarTransacoesInvalidas(this);
    }

    @Override
    public boolean executarAuditoria() {
        List<Transacao> transacoesInvalidas = this.obterTransacoesInvalidas();
        for(Transacao transacao : transacoesInvalidas){
            if(transacao.getValor() > 1000){
                return true;
            }
        }
        return false;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}