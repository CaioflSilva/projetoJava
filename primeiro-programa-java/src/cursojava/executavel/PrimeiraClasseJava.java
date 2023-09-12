package cursojava.executavel;

public class PrimeiraClasseJava {

	/* main é um metodo auto executavel em java */
	public static void main(String[] args) {

		// estrutura de repetiçao FOR e Continue

		for (int numero = 0; numero <= 10; numero++) {
			if (numero == 3 || numero == 6 || numero == 9) {
				System.out.println("Obaaah, encontrei o numero " + numero);
				continue;
			}

			System.out.println("processando laço de repetição");
		}

	}

}