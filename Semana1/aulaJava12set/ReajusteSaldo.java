package aulaJava12set;

import java.util.Scanner;
public class ReajusteSaldo {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar o saldo atual
        System.out.print("Digite o saldo atual: R$ ");
        double saldoAtual = scanner.nextDouble();

        // Calcular o reajuste de 1%
        double reajuste = saldoAtual * 0.01; // 1% do saldo atual
        double saldoComReajuste = saldoAtual + reajuste;

        // Exibir o saldo com reajuste
        System.out.println("Saldo atual: R$ " + String.format("%.2f", saldoAtual));
        System.out.println("Saldo com reajuste de 1%: R$ " + String.format("%.2f", saldoComReajuste));

        // Fechar o scanner
        scanner.close();
    }
}