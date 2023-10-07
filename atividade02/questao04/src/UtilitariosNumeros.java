import java.util.Random;
import java.util.stream.DoubleStream;
import java.lang.Math;

public class UtilitariosNumeros {
    private int[] array;

    public UtilitariosNumeros(int[] array){
        this.array = array;
    }

    public void ordenar() {
        int n = array.length;
        boolean trocou;
        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++){
                if(array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    trocou=true;
                }
            }
        } while(trocou);
    }

    public void embaralhar() {
        Random random =new Random();

        for(int i = array.length - 1; i > 0; i--){
            int indiceAleatorio = random.nextInt(i+1);

            int temp = array[i];
            array[i] = array[indiceAleatorio];
            array[indiceAleatorio] = temp;
        }
    }
    public double calcularMedia() {
        if(array.length==0){
            return 0.0;
        }

        double soma = 0.0;

        for(double numero: array){
            soma += numero;
        }

        double media = soma/array.length;

        return media;
    }

    public double calcularDesvioPadrão() {
        if(array.length ==0){
            return 0.0;
        }

        double media = calcularMedia();

        double[] numerosDouble = new double[array.length];
        for(int i = 0; i < array.length; i++){
            numerosDouble[i]=(double) array[i];
        }

        double desvioQuadraticoMedio = DoubleStream.of(numerosDouble)
                .map(numero -> Math.pow(numero - media, 2))
                .average()
                .orElse(0.0);
        
        double desvioPadrão = Math.sqrt(desvioQuadraticoMedio);

        return desvioPadrão;
    }
}