import java.util.Scanner;

public class Media2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		System.out.println("Digite a primeira nota: ");
		nota1 = teclado.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = teclado.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = teclado.nextDouble();
		media = (nota1 + nota2 + nota3) / 3;
		System.out.println("Sua m�dia �: " + media);
		if (media >= 8 && media <= 10) {
			System.out.println("Temos um g�nio entre n�s.");
		} else if (media >= 6 && media < 8) {
			System.out.println("Voc� foi aprovado.");
		} else if (media >= 5 && media < 6) {
			System.out.println("Voc� vai ficar em recupera��o");
		} else {
			System.out.println("Reprovado");
		}
	}
}
