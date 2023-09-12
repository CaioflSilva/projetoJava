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

		// Switch case : operaçoes exatas

		int dia = 5;
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("terça-feira");
			break;
		case 4:
			System.out.println("quarta-feira");
			break;
		case 5:
			System.out.println("quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;

		default:
			System.out.println("Outro dia qualquuer");
			break;
		}

	}
}
