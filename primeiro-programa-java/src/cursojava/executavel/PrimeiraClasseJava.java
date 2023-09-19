package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* main é um metodo auto executavel em java */
	public static void main(String[] args) {

		// New Aluno() é uma instancia (criaçao de obejtos)
		// aluno1 é uma referencia para o obejto aluno
		Aluno aluno1 = new Aluno(); // Aqui será o João
		aluno1.nome = "João";
		aluno1.idade = 50;
		
		System.out.println("Nome do aluno 1 é = " + aluno1.nome);
		System.out.println("idade é = " + aluno1.idade);

		Aluno aluno2 = new Aluno(); // Aqui será o Pedro

		Aluno aluno3 = new Aluno(); // Aqui sera o alex

		Aluno aluno4 = new Aluno("Maria");

		Aluno aluno5 = new Aluno("José", 50);
	}

}