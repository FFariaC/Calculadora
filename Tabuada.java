import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o número escolhido");
		Double numeroEscolhido = scanner.nextDouble();
		
		imprimirTabuada(numeroEscolhido, 0);				
		
		scanner.close();
	}

	static void imprimirTabuada(Double multiplicando, Integer multiplicador) {
		Double resultado = multiplicando * multiplicador;
		System.out.println(multiplicando + " x " + multiplicador + " = " + resultado);
		
		multiplicador++;
		if (multiplicador < 11 ) {
			imprimirTabuada(multiplicando, multiplicador);
		}
	}
}
