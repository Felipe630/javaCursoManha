package aulaJava12set;

public class MediaAritmetica {
    public static void main(String[] args) {
        // Números para a primeira média
        double num1_1 = 8;
        double num1_2 = 9;
        double num1_3 = 7;

        // Números para a segunda média
        double num2_1 = 4;
        double num2_2 = 5;
        double num2_3 = 6;

        // Calcular a média dos números 8, 9 e 7
        double media1 = (num1_1 + num1_2 + num1_3) / 3;
        System.out.println("Média dos números 8, 9 e 7: " + media1);

        // Calcular a média dos números 4, 5 e 6
        double media2 = (num2_1 + num2_2 + num2_3) / 3;
        System.out.println("Média dos números 4, 5 e 6: " + media2);

        // Calcular a soma das duas médias
        double somaDasMedias = media1 + media2;
        System.out.println("Soma das duas médias: " + somaDasMedias);

        // Calcular a média das médias
        double mediaDasMedias = somaDasMedias / 2;
        System.out.println("Média das médias: " + mediaDasMedias);
    }
}
