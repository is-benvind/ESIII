public class Conta {
    private double saldo;
    private String numeroConta;

    public Conta(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        saldo -= valor;
    }
    // Outros métodos relevantes...
}

class ContaCliente {
    private Conta conta;
    private String nome;
    private String cpf;
    private String endereco;

    public ContaCliente(String numeroConta, double saldo, String nome, String cpf, String endereco) {
        this.conta = new Conta(numeroConta, saldo);
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    // Métodos específicos do cliente...
}