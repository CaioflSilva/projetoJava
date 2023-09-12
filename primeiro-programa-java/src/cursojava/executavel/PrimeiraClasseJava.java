package cursojava.executavel;

public class PrimeiraClasseJava {

	/* main é um metodo auto executavel em java */
	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 95;
		int nota4 = 91;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		// operaçoes logicas aninhadas : sao operaçoes dentro de operaçoes

		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aluno esta aprovado direto - Parabens " + media);
				} else {
					System.out.println("Aluno está aprovado direto " + media);
				}
			} else {
				System.out.println("Aluno esta em recuperaçao " + media);
			}
		} else {
			System.out.println("Aluno reprovado direto " + media);
		}

	}
}
