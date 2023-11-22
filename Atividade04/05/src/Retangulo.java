// classes Retângulo e Quadrado agora com composição

class Dimensoes {
    private double largura;
    private double altura;

    public Dimensoes(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }
}

class FormaGeometrica {
    private Dimensoes dimensoes;

    public FormaGeometrica(double largura, double altura) {
        this.dimensoes = new Dimensoes(largura, altura);
    }

    public void setLargura(double largura) {
        dimensoes.setLargura(largura);
    }

    public void setAltura(double altura) {
        dimensoes.setAltura(altura);
    }

    public double calcularArea() {
        return dimensoes.getLargura() * dimensoes.getAltura();
    }
}

public class Retangulo {
    private FormaGeometrica forma;

    public Retangulo(double largura, double altura) {
        this.forma = new FormaGeometrica(largura, altura);
    }

    public void setLargura(double largura) {
        forma.setLargura(largura);
    }

    public void setAltura(double altura) {
        forma.setAltura(altura);
    }

    public double calcularArea() {
        return forma.calcularArea();
    }
}

class Quadrado {
    private FormaGeometrica forma;

    public Quadrado(double lado) {
        this.forma = new FormaGeometrica(lado, lado);
    }

    public void setLado(double lado) {
        forma.setLargura(lado);
        forma.setAltura(lado);
    }

    public double calcularArea() {
        return forma.calcularArea();
    }
}