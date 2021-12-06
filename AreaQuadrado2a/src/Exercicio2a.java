import java.util.Scanner;

public class Exercicio2a {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double area, lado;
		System.out.println("Digite o valor do lado: ");
		lado = teclado.nextDouble();
		area = lado * lado;
		System.out.println("A área do quadrado é: " + area);

		;
	}
}
