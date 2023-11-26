// a herança neste caso não é justificada porque viola o princípio de substituição de Liskov, pelo fato da classe herdeira 
// possuir um método que impõe restrições com relação ao mesmo método na super classe. Assim sendo 
// a classe filha não pode substituir a classe mãe, o que acarreta em problemas a medida que o código se expande.

// uma soluçõ possível é utilizando composição, como pode ser visto baixo:

import javax.management.RuntimeErrorException;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public void depositar(double valor){
        saldo +=valor;
    }

    public void sacar(double valor){
        saldo -=valor;
    }

    public double getSaldo(){
        return saldo;
    }
}

class ContaPoupanca {
    private ContaBancaria contaBancaria;

    public ContaPoupanca(double saldoInicial){
        this.contaBancaria = new ContaBancaria(saldoInicial);
    }

    public void sacar(double valor){
        if(valor>1000){
            throw new RuntimeErrorException(null, "Não pode sacar mais de 1000 em uma poupança");
        }
        contaBancaria.sacar(valor);
    }

    public double getSaldo(){
        return contaBancaria.getSaldo();
    }
}
