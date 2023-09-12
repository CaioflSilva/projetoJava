package cursojava.executavel;

public class PrimeiraClasseJava {

	/* main é um metodo auto executavel em java */
	public static void main(String[] args) {

		// estrutura de repetiçao while

		int numero = 0;

		while (numero <= 60) { // verifica e depois execulta o codigo
			System.out.println("O numero atual é : " + numero);
			numero++;
		}

		//
		int numero2 = 0;
		do { // primeiro ele execulta e depois verifica

			System.out.println("O numero atual é : " + numero2);
			numero2++;
		} while (numero2 <= 60);

	}
}
