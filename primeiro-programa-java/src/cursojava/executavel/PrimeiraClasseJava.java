package cursojava.executavel;

public class PrimeiraClasseJava {

	/* main � um metodo auto executavel em java */
	public static void main(String[] args) {

		// estrutura de repeti�ao FOR com Break(PARADA)

		for (int numero = 0; numero <= 10; numero++) {
			if (numero == 3) {
				System.out.println("Obaaah, encontrei o numero 3");
				System.out.println("Estou parando de execultar....");
				break;
			}
		}

	}

}