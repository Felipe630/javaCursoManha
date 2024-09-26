   


package cursoJava2024;

  import java.util.Scanner;

public class VerificaçãoDePalimdrono {
    public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
		String palavra = scanner.nextLine();
		
		if (ehPalimdromo(palavra)) {
			System.out.println(palavra + " é um palimdromo. ");
			
		}else {
		System.out.println(palavra + " não é um palimdromo. ");
		
	}

	scanner.close(); }
   
		public static boolean ehPalimdromo(String palavra) {
			String palavraInvertida = new StringBuilder (palavra).reverse().toString();

			return palavra.equalsIgnoreCase(palavraInvertida);
		
			
		}
		
}