package cursoJava2024;

import java.util.Scanner;

public class IfTernario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String nomeCorreto = "Michael";
		 System.out.print("Digite seu nome:");
		String nomeUsuario = scanner.nextLine();
		
		String resultado = nomeUsuario.equalsIgnoreCase(nomeCorreto) ? "Olá Michael!!" : "Você não é o Michael";
		System.out.println(resultado);		
				
		scanner.close();	
	}

}
