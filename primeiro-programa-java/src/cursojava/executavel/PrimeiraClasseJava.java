package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* main � um metodo auto executavel em java */
	public static void main(String[] args) {

		// New Aluno() � uma instancia (cria�ao de obejtos)
		//aluno1 � uma referencia para o obejto aluno
		Aluno aluno1 = new Aluno(); // Aqui ser� o Jo�o

		// agora temos um obejto real
		Aluno aluno2 = new Aluno(); // Aqui ser� o Pedro

		Aluno aluno3 = new Aluno(); // Aqui sera o alex

		Aluno aluno4 = new Aluno("Maria");

		Aluno aluno5 = new Aluno("Jos�", 50);
	}

}