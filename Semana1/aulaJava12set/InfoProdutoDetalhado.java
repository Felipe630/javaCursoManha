package aulaJava12set;

import java.util.Scanner;
public class InfoProdutoDetalhado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();
       System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
         System.out.print("Digite o preço unitário (em reais): ");
        double precoUnitario = scanner.nextDouble();
       System.out.print("Digite o código de identificação: ");
        int codigoIdentificacao = scanner.nextInt();
        System.out.print("Digite o peso do produto (em kg): ");
        double peso = scanner.nextDouble();
        double precoTotal = quantidade * precoUnitario;

        System.out.println("\nInformações do Produto:");
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço unitário: R$ " + String.format("%.2f", precoUnitario));
        System.out.println("Código de identificação: " + codigoIdentificacao);
        System.out.println("Peso: " + String.format("%.2f", peso) + " kg");
        System.out.println("Preço total: R$ " + String.format("%.2f", precoTotal));
        scanner.close();
    }
}