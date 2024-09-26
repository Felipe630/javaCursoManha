package aulaJava12set;

import java.util.Scanner;
public class IdadeEmDias {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        // Solicitar a idade em anos
        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();
        // Solicitar a idade em meses
        System.out.print("Digite a idade em meses: ");
        int meses = scanner.nextInt();
        // Solicitar a idade em dias
        System.out.print("Digite a idade em dias: ");
        int dias = scanner.nextInt();
        // Definir o número de dias em um ano e em um mês
        final int DIAS_EM_UM_ANO = 365;
        final int DIAS_EM_UM_MES = 30;
        // Calcular o total de dias
        int totalDias = (anos * DIAS_EM_UM_ANO) + (meses * DIAS_EM_UM_MES) + dias;
        // Exibir o resultado
        System.out.println("A idade expressa em dias é: " + totalDias + " dias.");
        // Fechar o scanner
        scanner.close();
    }
}