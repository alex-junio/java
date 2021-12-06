import java.util.Scanner;

public class Media {
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
		if (media >= 6) {
			System.out.println("Aprovado com a nota " + media + ".");
		}
		else {
			System.out.println("Sua nota foi " + media + ". Mandou bem, não? Não...");
			
		}
	}
	
}
