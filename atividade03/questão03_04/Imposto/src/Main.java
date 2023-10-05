import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> rendimentos = new ArrayList<>();
        rendimentos.add(8000.0);
        rendimentos.add(3000.0);
        List<Double> despesas = new ArrayList<>();
        despesas.add(3000.0);
        ImpostoDeRenda imposto = new ImpostoDeRenda("12345678901", rendimentos, despesas);

        List<Validacao> validacoes = new ArrayList<>();
        validacoes.add(new ValidacaoCPF());
        validacoes.add(new ValidacaoTamanhoCPF());
        validacoes.add(new ValidacaoRendimentosNaoNegativos());
        validacoes.add(new ValidacaoDespesasNaoNegativas());
        validacoes.add(new ValidacaoNumeroRendimentos());

        imposto.processar(validacoes);
    }
}