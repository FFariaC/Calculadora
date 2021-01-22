
public class NotasAlunos {
	
	public static void main(String[] args) {
		
		Double[] alunoUm = new Double[] {10.0, 8.0, 5.0};
		Double[] alunoDois = new Double[] {7.0, 8.0, 7.0};
		Double[] alunoTres = new Double[] {8.0, 8.0, 8.0};
		
		Double[][] classe = new Double[][] { alunoUm, alunoDois, alunoTres};
		
		Double maiorNota = 0.0;
		Integer alunoVencedor = null;
		
		for (int i = 0; i < classe.length; i++) {
			Double[] aluno = classe[i];
			Double notaTotal = 0.0;
			
			for (int y = 0; y < aluno.length; y++) {
				notaTotal += aluno[y];
			}
			
			Boolean essaEAMaiorNota = notaTotal > maiorNota;
			
			if (essaEAMaiorNota) {
				maiorNota = notaTotal;
				alunoVencedor = i + 1;
			}
		}
		
		System.out.println("O aluno " + alunoVencedor + " teve a maior nota, que foi de: " + maiorNota);
		
	}

}
