package aulaJava11set;

import java.util.Scanner;  
public class MediaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        double media = (numero1 + numero2) / 2;
        System.out.println("A média dos dois números é: " + media);
        scanner.close();
    }
}