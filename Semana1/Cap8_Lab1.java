
public class Cap8_Lab1 {

	// Metodo estatico para encontrar o maior numero em um array
	public static int maiorNumero(int[] numeros) {
		// Suponha que o primeiro numero e o maior inicialmente
		int maior = numeros[0];

		// Pecorre o array para encontrar o maior numero
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];

			}

		}
		return maior; // Retorna o maior numero encontrado

	}

	public static void main(String[] args) {
		// Declara um array do tipo int e inicializa com alguns numeros
		int[] numeros = { 3, 5, 7, 2, 8, 6 };

		// Chama o metodo maiorNumero e armazena o resultado em uma variavel
		int maior = maiorNumero(numeros);
		// Imprime o maior numero encontrado
		System.out.println("O maior numero do array é:" + maior);

	}
}
