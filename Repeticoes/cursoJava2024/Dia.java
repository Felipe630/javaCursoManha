package cursoJava2024;

public class Dia {

	public static void main(String[] args) {
		int horas = 6;

		switch (horas) {
		case 6:
			System.out.println("Bom dia Flor do dia!");
			break;
		case 12:
			System.out.println("Boa tarde rapá!");
			break;
		case 18:
			System.out.println("Boa noite, tem que dormir cedo ein.");
			break;
		case 00:
			System.out.println("É madrugada, vá dormir desgraça!!!!");
			break;
           
			default:
				System.out.println("Mermão, num existe esse horario!!");
		}
	}
}