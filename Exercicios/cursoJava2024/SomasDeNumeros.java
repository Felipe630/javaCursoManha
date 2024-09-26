package cursoJava2024;

import java.util.Scanner;

public class SomasDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a quantidade de números a serem somados
        System.out.print("Quantos números você deseja somar? ");
        int quantidade = scanner.nextInt();

        int soma = 0;

        // Loop para receber os números e somá-los
        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            soma += numero; // Adiciona o número à soma
        }

        // Exibe o resultado
        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
}
