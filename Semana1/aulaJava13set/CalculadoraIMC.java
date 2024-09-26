package aulaJava13set;
import java.util.Scanner;
public class CalculadoraIMC {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.print("Digite o seu peso em kg: ");
			double peso = scanner.nextDouble();
			System.out.print("Digite a sua altura em metros: ");
			double altura = scanner.nextDouble();
			double imc = peso / (altura * altura);
			System.out.printf("Seu IMC é: %.2f\n", imc);
			System.out.println(classificarIMC(imc));
		}
    }
    private static String classificarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}