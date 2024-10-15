package cursoJava2024;

import java.util.Scanner;

public class CrudArray {
	// Arrays para armazenar nomes e idades:
	static String[] nomes = new String[10];
	static int[] idades = new int[10];
	static int contador = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int opcao; 
		
		do {
     System.out.println("\n---menu---");
     System.out.println("1.---adicionar Usuário---");
     System.out.println("2---Exibir Usuarios---");
     System.out.println("3---Atualizar Usuarios---");
     System.out.println("4---Deletar Usuario---");
     System.out.println("5---Sair---");
     System.out.println("Escolha uma opção:");
     opcao = scanner.nextInt();
	
     
     switch (opcao) {
     case 1: 
    	 adicionarUsuario(scanner); 
    		 break; 
    		 case 2:
    			 exibirUsuarios();
    			 break;
    		 case 3:
    			 atualizarUsuario(scanner);
    			 break;
    		 case 4:
    			 deletarUsuario(scanner);
    			 break;
    		 case 5:
    			 System.out.println("Saindo do sistema!...");
    			 break;
    			 default:
    			 System.out.println("opção invalida!");
    			 
    			 
    	 }
    	 
         } while(opcao!= 5);
         scanner.close();
    
		}

	// Criar todos os métodos:
	// Adicionar usuario:
	public static void adicionarUsuario(Scanner scanner) {
		if (contador < nomes.length) {
			// Pegando o nome do Usuario:
			System.out.println("Digite o nome:");
			String nome = scanner.next();
			// Pegando a idade do usuario:
			System.out.println("Digite sua idade:");
			int idade = scanner.nextInt();
			// Adicionando as variaveis dentro dos arrays:
			nomes[contador] = nome;
			idades[contador] = idade;

			contador++;
			System.out.println("Usuario adicionado com sucesso!");
		} else {
			System.out.println("limite de usuario atingido!");

		}

	 
	}
	
	//Exibir Usuarios:
	public static void exibirUsuarios() {
		if (contador == 0) {
			System.out.println("Nenhum usuario cadastrado!");
		} else {
			for (int i = 0; i < contador; i++) {
				System.out.println(( i + 1)+ ". Nome: " + nomes [i] +", idade:" +idades[i] );
				
			}
		}
	
	}
      // Atualizar usuario:
	public static void atualizarUsuario(Scanner scanner) {
	System.out.println("Digite o numero do usuario a ser atualizado:");
	int index = scanner.nextInt() -1;
	
	if (index >= 0 && index < contador ) {
		 
		System.out.println("Digite o novo nome:");
		String nome = scanner.next();
		System.out.println("Digite a nova idade: ");
		int idade = scanner.nextInt();
		//jogando nome e idade novos dentro do array:
		nomes[index] = nome;
		idades[index] = idade;
		System.out.println("Usuario atualizado com sucesso!");
		
	} else { 
		System.out.println("Usuario não encontrado!");
		}
	}
	
	
	//Deletar Usuario:
	public static void deletarUsuario(Scanner scanner) {
		System.out.println("Digite o numero do usuario a ser deletado:");
		int index = scanner.nextInt() -1;
		
		if ( index >= 0 && index < contador ) {
			for (int i = index; i < contador -1; i++) {
				nomes [i] = nomes [i+1];
				idades[i] = idades[i+1];
				
			}
			 nomes [contador -1] = null;
			idades[contador -1] = 0;
			System.out.println("Usuario deletado com sucesso!");
		} else { 
		System.out.println("Usuario não encontrado!");
		}
		
	}
}
