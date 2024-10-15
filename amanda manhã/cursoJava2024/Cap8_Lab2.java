package cursoJava2024;

public class Cap8_Lab2 {
    public static void main(String[] args) {
        // Verificar se o tamanho do array args é maior que zero
        if (args.length > 0) {
            // Inicializa a variável soma
            int soma = 0;

            // Laço para somar idades
            for (int i = 0; i < args.length; i++) {
                try {
                    // Converte a string para inteiro e adiciona à soma
                    soma += Integer.parseInt(args[i]);
                } catch (NumberFormatException e) {
                    // Trata exceção caso o valor não seja um número válido
                    System.out.println("Valor inválido: " + args[i]);
                    return;
                }
            }

            // Calcula a média
            double media = (double) soma / args.length;

            // Imprime a média
            System.out.printf("A média das idades é: %.2f%n", media);
        } else {
            // Mensagem de erro caso não haja argumentos válidos
            System.out.println("Entre com valores válidos para as idades");
        }
    }
}
