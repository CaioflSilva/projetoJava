package cursojava.executavel;

public class PrimeiraClasseJava {

	/* main é um metodo auto executavel em java */
	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 60;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 70) {
			System.out.println("Aluno Aprovado: " + media);

		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperacao:" + media);
		} else {
			System.out.println("Aluno Reprovado: " + media);
		}

	}

}
