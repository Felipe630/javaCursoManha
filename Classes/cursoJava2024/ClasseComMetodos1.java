package cursoJava2024;

public class ClasseComMetodos1 {
	
	//Método 01: calcula a soma de dois numeros:
	public int soma( int a, int b) {
		  return a + b;
	}
	
	//Método 02: Verificar se 1 número é par:
	public boolean ehPar(int numero) {
		return numero % 2 == 0;
	}
	
	
	//Método 03: Invertendo uma String:
	
	

	public static void main(String[] args) {
		//Instalando a classe:
		 ClasseComMetodos1 utilidades = new  ClasseComMetodos1();
		
		
		
		
		//Chamando os métodos:
		System.out.println("A soma de 468 e 245 é: " + utilidades.soma (468, 245));
		System.out.println("O numero 17 é par?: "+ utilidades.ehPar(17));
		 
	}
	
	{
	
	
}
}
