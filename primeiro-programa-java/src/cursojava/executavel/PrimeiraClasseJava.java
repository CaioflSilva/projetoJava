package cursojava.executavel;

public class PrimeiraClasseJava {

	/* main � um metodo auto executavel em java */
	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 95;
		int nota4 = 91;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		// opera�oes logicas aninhadas : sao opera�oes dentro de opera�oes

		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aluno esta aprovado direto - Parabens " + media);
				} else {
					System.out.println("Aluno est� aprovado direto " + media);
				}
			} else {
				System.out.println("Aluno esta em recupera�ao " + media);
			}
		} else {
			System.out.println("Aluno reprovado direto " + media);
		}

	}
}
