import java.util.List;

public class ContaCorrenteTest {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente("12345", 5000);
        ContaCorrente conta2 = new ContaCorrente("67890", 60000);

        ContaCorrenteService contaService = new ContaCorrenteService();

        List<Transacao> transacoesInvalidas1 = contaService.encontrarTransacoesInvalidas(conta1);
        List<Transacao> transacoesInvalidas2 = contaService.encontrarTransacoesInvalidas(conta2);

        System.out.println("Transações inválidas da Conta 1: " + transacoesInvalidas1);
        System.out.println("Transações inválidas da Conta 2: " + transacoesInvalidas2);
    }
}
