import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite o número da conta: ");
        String numero = scanner.nextLine();

        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        
        ContaBancaria conta = new ContaBancaria(numero, titular, saldoInicial);

        
        System.out.print("Digite o valor para depósito: ");
        double deposito = scanner.nextDouble();
        conta.depositar(deposito);
        conta.Vatual(); 
    

        System.out.print("Digite o valor para saque: ");
        double saque = scanner.nextDouble();
        conta.sacar(saque);

        System.out.println();
        conta.exibirSaldo();

        scanner.close();
    }
}