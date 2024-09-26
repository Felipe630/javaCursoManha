package aulaJava11set;

import java.util.Scanner;

public class ContaInformativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao sistema de criação de contas!");
        System.out.print("Por favor, insira seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Por favor, crie uma senha: ");
        String senha = scanner.nextLine();
        System.out.print("Por favor, insira sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Por favor, insira seu e-mail: ");
        String email = scanner.nextLine();
        System.out.print("Por favor, insira seu número de telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("Por favor, insira seu endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Por favor, informe seu gênero (Masculino/Feminino/Outro): ");
        String genero = scanner.nextLine();
        System.out.print("Por favor, informe sua profissão: ");
        String profissao = scanner.nextLine();
        System.out.print("Por favor, informe seu país de residência: ");
        String pais = scanner.nextLine();
        System.out.println("\nConta criada com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("Senha: " + senha); 
        System.out.println("Idade: " + idade);
        System.out.println("E-mail: " + email);
        System.out.println("Número de telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("Gênero: " + genero);
        System.out.println("Profissão: " + profissao);
        System.out.println("País de residência: " + pais);
        scanner.close();
    }
}