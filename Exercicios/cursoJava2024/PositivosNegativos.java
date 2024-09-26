package cursoJava2024;

public class PositivosNegativos {

     public static void main(String[]args) {
        int valor = 736 ;
     
     
     //Criar as validações:
     if (valor < 0) {
        System.out.println("O valor que voce digitou não é compativel.");
     }else if (valor > 0) {
        System.out.println("Seu valor foi depositado.");
     }else {
    	System.out.println("Não foi possivel enviar seu valor.");
     }if (valor > 1000) {
    	System.out.println("Para enviar este valor, verifique a autenticação de dois fatores");
     }
}
}