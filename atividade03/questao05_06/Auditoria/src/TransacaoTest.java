
public class TransacaoTest {
    public static void main(String[] args) {
        Transacao transacao1 = new Transacao(1, 2000, TipoTransacao.CREDITO);
        Transacao transacao2 = new Transacao(2, 800, TipoTransacao.DEBITO);

        TransacaoService transacaoService = new TransacaoService();

        boolean fraude1 = transacaoService.identificarFraude(transacao1);
        boolean fraude2 = transacaoService.identificarFraude(transacao2);

        System.out.println("Transação 1 é uma fraude? " + fraude1);
        System.out.println("Transação 2 é uma fraude? " + fraude2);
    }
}
