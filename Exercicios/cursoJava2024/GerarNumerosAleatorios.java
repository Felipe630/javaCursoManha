 

package cursoJava2024;
 
import java.util.Scanner;
		
public class GerarNumerosAleatorios {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o limite inicial: ");
	        int limiteInferior = scanner.nextInt();
	        System.out.print("Digite o limite final: ");
	        int limiteSuperior = scanner.nextInt();

	        System.out.println("Números aleatórios gerados:");
	        for (int i = 0; i < 5; i++) {
	            int numeroAleatorio = limiteInferior + (int)(Math.random() * (limiteSuperior - limiteInferior));
	            System.out.println(numeroAleatorio);
	        }

	        scanner.close();
	    }
	}
		