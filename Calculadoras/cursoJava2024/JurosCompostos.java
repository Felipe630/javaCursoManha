package cursoJava2024;

import java.util.Scanner;

public class JurosCompostos {

	public static void main(String[] args) {
	
	  Scanner scanner = new Scanner (System.in);
	  System.out.println("Digite uma palavra: ");
	  String palavra = scanner.nextLine();
	  
	  String palavraInvertida = new StringBuilder(palavra).reverse().toString();
	  
	  System.out.println("A palavra ivertida é: " + palavraInvertida);
	  
	  scanner.close();
	}

}
