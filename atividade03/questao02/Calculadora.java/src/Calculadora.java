import java.util.ArrayList;
import java.util.List;

interface Operacao {
    public double executar(double a, double b);
}

public class Calculadora {
    private final double a;
    private final double b;

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public List<Double> calcular(List<Operacao> operacoes) {
        List<Double> resultados = new ArrayList<>();
        for (Operacao operacao : operacoes) {
            double resultado = operacao.executar(a, b);
            resultados.add(resultado);
        }
        return resultados;
    }
}