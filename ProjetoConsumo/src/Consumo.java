import java.util.Scanner;

public class Consumo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double km, litros, media;
		System.out.println("Digite a distância percorrida. ");
		km = teclado.nextDouble();
		System.out.println("Quantos litros foram gastos? ");
		litros = teclado.nextDouble();
		media = km/litros;
		System.out.println("A média de consumo é: " + media);
	}
}
