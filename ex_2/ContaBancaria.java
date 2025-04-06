public class ContaBancaria {
    String numeroConta;
    String titular;
    double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        System.out.println("Conta criada para " + titular + " com saldo inicial de R$" + saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
        }
    }


    public void Vatual() {
        System.out.println("O valor atual da conta é: R$" + saldo);
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}