public class Retangulo {
    double largura;
    double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double calcularArea(){
        return largura * altura;
    }
}

class Quadrado extends Retangulo{
    public Quadrado(double lado){
        super(lado, lado);
    }

    @Override
    public void setLargura(double lado){
        super.setLargura(lado);
        super.setAltura(lado);
    }

    public void setAltura(double lado){
        super.setLargura(lado);
        super.setAltura(lado);
    }
}

// no exemplo em questão o uso de herança é conveniente, pois
// um quadrado é um tipo de retângulo. No entanto, a adição de um
// simples método, como um método que calcula o perímetro do retângulo,
// já seria suficiente para expor falhas de design, afinal a fórmula
// matemática do perímetro do quadrado é diferente da figura geométric da qual herda.