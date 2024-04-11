package heranca.exercicio1;

import java.util.Scanner;

public class Contas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação das contas
        ContaPoupanca contaPoupanca = new ContaPoupanca("João Silva", 123456, 1000.0f, 10);
        ContaEspecial contaEspecial = new ContaEspecial("Maria Oliveira", 654321, 500.0f, 1000.0f);

        // Saque da conta poupança (valor dentro do saldo)
        System.out.println("Saldo conta poupança antes do saque: " + contaPoupanca.getSaldo());
        contaPoupanca.sacar(200.0f);
        System.out.println("Saldo conta poupança depois do saque: " + contaPoupanca.getSaldo());

        // Saque da conta especial (valor acima do saldo, mas dentro do limite)
        System.out.println("Saldo conta especial antes do saque: " + contaEspecial.getSaldo());
        contaEspecial.sacar(800.0f);
        System.out.println("Saldo conta especial depois do saque: " + contaEspecial.getSaldo());

        // Saque da conta especial (valor acima do limite)
        contaEspecial.sacar(1200.0f);
        // Depósito na conta poupança
        System.out.println("Saldo conta poupanca antes do deposito: " + contaPoupanca.getSaldo());
        System.out.print("Informe o valor do deposito: ");
        float depositoPoupanca = scanner.nextFloat();
        contaPoupanca.depositar(depositoPoupanca);
        System.out.println("Saldo conta poupanca depois do deposito: " + contaPoupanca.getSaldo());

        // Simulação de rendimento da poupança (assumindo taxa mensal)
        float taxaRendimento = 0.01f; // Taxa de 1% ao mês
        contaPoupanca.calcularNovoSaldo(taxaRendimento);

        // Exibição do novo saldo da poupança
        System.out.println("Novo saldo da conta poupança com rendimento: " + contaPoupanca.getSaldo());

        // Exibição dos dados das contas
        System.out.println("\nDados da conta poupança:");
        System.out.println(contaPoupanca.toString());

        System.out.println("\nDados da conta especial:");
        System.out.println(contaEspecial.toString());

        scanner.close();

    }
}

