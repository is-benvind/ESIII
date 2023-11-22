public class Bicicleta {
    String modelo;
    String cor;
    int tamanhoAro;

    public Bicicleta(String modelo, String cor, int tamanhoAro){
        this.modelo = modelo;
        this.cor = cor;
        this.tamanhoAro = tamanhoAro;
    };
}

class BicicletaComMotor extends Bicicleta{
    String modeloMotor;
    public BicicletaComMotor(String modelo, String cor, int tamanhoAro, String modeloMotor) {
        super(modelo, cor, tamanhoAro);
        this.modeloMotor = modeloMotor;
    };
}

// no exemplo em questão, similar ao do pato real e o pato de brinquedo, uma bicicleta motorizada possui
// diversos aspectos similares a uma bicileta comum, mas possui motor, possui portanto um "a mais", o que
// a torna ligeiramente diferente, a torna outra coisa.