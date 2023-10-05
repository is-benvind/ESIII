public class TransacaoService {

    public boolean identificarFraude(Transacao transacao) {
        if (transacao.getTipo() == TipoTransacao.CREDITO) {
            if (transacao.getValor() > 1000) {
                return true;
            }
            return false;
        }
        if (transacao.getValor() > 500) {
            return true;
        }

        return false;
    }

}
