package cursoJava2024;

public class TrabalhandoComStrings {

	public static void main(String[] args) {
		  
		String texto = "Bem vindo ao curso de JAVA";
		String texto2 = "Vamos aprender sobre STRING.";
		
		//1.Comprimento da string:
		String nome = "Felipe Dos Santos Pasquarelli";
		System.out.println("Comprimento da String: "+nome.length());
        
		//2.Concatenar Strings: 
		    String textoCompleto = texto + " " + texto2;
		    System.out.println("Texto completo: " + textoCompleto);
		    String nome2 = "Felipe";
		    String sobreNome = "Dos Santos Pasquarelli";
		    System.out.println(nome2 + " " + sobreNome);
		     
		    //3. Converter para MAIÚSCULAS E minúsculas:
		    System.out.println("MAIÚSCULAS: "+ texto.toUpperCase());
		    System.out.println("minúsculas: "+ texto.toLowerCase());
		    
		    //4.Substituir uma parte da String:
		    String novoTexto = texto.replace("JAVA", "Garoto de programa");
		    System.out.println("Texto após substituição: "+ novoTexto);
		    
		    //5.Buscar por uma substring:
		    int posicao = texto.indexOf("curso");
		    System.out.println("Posição da palavra 'curso': "+ posicao);
		    
		    //6.Verificar se uma string começa ou termina com 1 substring:
		    System.out.println("Começa com 'Bem': "+ texto.startsWith("Bem"));
		    System.out.println("Termina com 'Mal': "+ texto.endsWith("Mal"));
		    
		    //7.Dividir String:
		    String[] palavras = textoCompleto.split(" ");
		    System.out.println("Palavras no texto completo:");
		    for ( String palavra: palavras ) {
		    	System.out.println(palavra);
		    	
		   //8.Remover espaços em branco:
		    	String textoComEspaços = "   Texto com espaços   ";
		    	System.out.println("Texto sem espaços: '"+ textoComEspaços.trim() + "'");
		    }
		    
		    
		    
		 
		

	}

}

