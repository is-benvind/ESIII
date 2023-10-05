import java.util.ArrayList;
import java.util.List;

public class ContaCorrenteService {
    public List<Transacao> encontrarTransacoesInvalidas(ContaCorrente contaCorrente) {
        List<Transacao> transacoes = contaCorrente.getTransacoes();
        List<Transacao> transacoesInvalidas = new ArrayList<>();

        for (Transacao transacao : transacoes) {
            if (transacao.getValor() < 0 || 
                (transacao.getTipo() == TipoTransacao.CREDITO && transacao.getValor() > 1000) ||
                (transacao.getValor() > 500 && contaCorrente.getSaldo() < transacao.getValor())) {
                transacoesInvalidas.add(transacao);
            }
        }

        return transacoesInvalidas;
    }
}