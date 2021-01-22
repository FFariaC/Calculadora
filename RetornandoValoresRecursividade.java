import java.util.Scanner;

public class RetornandoValoresRecursividade {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] { "Java EE", "Spring", "Java OO"};
		
		imprimir("Escolha entre os cursos abaixo: ");
		
		iterarEExibir(cursos);
		
		
		Integer posicaoCursoEscolhido = receberNumeroInteiro("O curso que escolhido é: ", scanner); // scanner.nextInt();
		
		Boolean posicaoValida = verificarPosicaoEscolhida(posicaoCursoEscolhido, cursos);   // posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		if (!posicaoValida) {
			mensagemDeErroPosicaoInvalida();
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartão", "Boleto", "Transferência"};
		
		imprimir("Escolha entre as formas de pagamento: ");
		
		iterarEExibir(formasPagamento);
		
		Integer posicaoFormaDePagamento = receberNumeroInteiro("Forma de pagamento escolhida: ", scanner);    // scanner.nextInt();
		
		posicaoValida = verificarPosicaoEscolhida(posicaoFormaDePagamento, formasPagamento);   // posicaoFormaDePagamento >= 0 && posicaoFormaDePagamento < formasPagamento.length;
		
		if (!posicaoValida) {
			mensagemDeErroPosicaoInvalida();
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaDePagamento];
		
		imprimirTraco();
		
		imprimir("O curso escolhido foi: " + cursoEscolhido + " e a forma de pagamento é: " + formaPagamentoEscolhida);
		
		
		
		scanner.close();
	}
	
	static Integer receberNumeroInteiro (String texto, Scanner scanner) {
		imprimir(texto);
		Integer numero = scanner.nextInt();
		return numero;
	}
	
	static Boolean verificarPosicaoEscolhida(Integer posicao, String[] vetor) {
		Boolean valida = posicao >= 0 && posicao < vetor.length;	
		return valida;
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}

	static void imprimirTraco() {
		imprimir("-------------------");
	}
	
	static void mensagemDeErroPosicaoInvalida() { 
		System.err.println("Posição inválida");
		System.exit(1);
	}
	
	static void iterarEExibir(String[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			
		}
	}
	
	static void iterarEExibir(String[] vetor, Integer i) {
		imprimir(i + ": " + vetor[i]);
		
		if (i < vetor.length) {
			iterarEExibir(vetor, i);
		}
	}

}
