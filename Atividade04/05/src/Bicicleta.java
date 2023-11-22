// classes Bicicleta e BicicletaComMotor agora com composição

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

class Motor {
    String modeloMotor;

    public Motor(String modeloMotor){
        this.modeloMotor = modeloMotor;
    }
}

class BicicletaComMotor{
    Bicicleta bicicleta;
    Motor motor;

    public BicicletaComMotor(String modelo, String cor, int tamanhoAro, String modeloMotor){
        this.bicicleta = new Bicicleta(modelo, cor, tamanhoAro);
        this.motor = new Motor(modeloMotor);
    }
}