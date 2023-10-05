import java.util.Arrays;
import java.util.List;

public class Teste{
    public void Calcular() {
        Calculadora calculo = new Calculadora(8, 4);
        List<Double> resultados = calculo.calcular(Arrays.asList(
                new Operacao() {
                    public double executar(double a, double b) {
                        return a + b;
                    }
                },
                new Operacao() {
                    public double executar(double a, double b) {
                        return a - b;
                    }
                },
                new Operacao() {
                    public double executar(double a, double b) {
                        return a * b;
                    }
                },
                new Operacao() {
                    public double executar(double a, double b) {
                        return a / b;
                    }
                }));
    }
}