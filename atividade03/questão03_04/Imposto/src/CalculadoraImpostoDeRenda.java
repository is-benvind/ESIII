import java.util.List;

public class CalculadoraImpostoDeRenda {
    public double calcularImposto(List<Double> rendimentos, List<Double> despesas) {
        double rendaTotal = rendimentos.stream().mapToDouble(Double::doubleValue).sum();
        double despesaTotal = despesas.stream().mapToDouble(Double::doubleValue).sum();
        double baseCalculo = rendaTotal - despesaTotal;

        if (baseCalculo <= 1903.98) {
            return 0.0;
        } else if (baseCalculo <= 2826.65) {
            return baseCalculo * 0.075 - 142.80;
        } else {
            // Adicione outros intervalos de imposto aqui, se necessário
            return baseCalculo * 0.275 - 869.36; // Para base de cálculo acima de 4664.68
        }
    }
}