package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* main é um metodo auto executavel em java */
	public static void main(String[] args) {

		// Obejeto ainda nao existe na memoria
		Aluno aluno1 = new Aluno(); // Aqui será o João

		// agora temos um obejto real
		Aluno aluno2 = new Aluno(); // Aqui será o Pedro

		Aluno aluno3 = new Aluno(); // Aqui sera o alex

		Aluno aluno4 = new Aluno("Maria");

		Aluno aluno5 = new Aluno("José", 50);
	}

}