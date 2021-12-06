import java.util.Scanner;

public class TabuadaV1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, contador, resultado;
		System.out.println("Por favor, digite um número: ");
		numero = teclado.nextInt();
		contador = 0;
		while (contador <= 10) {

			resultado = contador * numero;
			System.out.println(resultado);
			contador++;
		}

	}
}
