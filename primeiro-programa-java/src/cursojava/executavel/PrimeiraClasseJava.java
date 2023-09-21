package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* main é um metodo auto executavel em java */
	public static void main(String[] args) {

		// New Aluno() é uma instancia (criaçao de obejtos)
		// aluno1 é uma referencia para o obejto aluno
		Aluno aluno1 = new Aluno(); // Aqui será o João
		aluno1.setNome(" João da Silva ");
		aluno1.setIdade(50);
		aluno1.setDataNascimento("14/09/1995");
		aluno1.setRegistroGeral("085654.698.88");
		aluno1.setNumeroCpf("085.254.987.00");
		aluno1.setNomeMae("Simone");
		aluno1.setNomePai("Robson");
		aluno1.setDataMatricula("14/01/2021");
		aluno1.setSerieMatriculado("5a");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);

		System.out.println("Nome é = " + aluno1.getNome());
		System.out.println("Idade é = " + aluno1.getIdade());
		System.out.println("Nascimento = " + aluno1.getDataNascimento());
		System.out.println("Registro Geral = " + aluno1.getRegistroGeral());
		System.out.println("Numero Cpf = " + aluno1.getNumeroCpf());
		System.out.println("Nome Mãe = " + aluno1.getNomeMae());
		System.out.println("Nome Pai = " + aluno1.getNomePai());
		System.out.println("DataMa tricula = " + aluno1.getDataMatricula());
		System.out.println("SerieMa triculado = " + aluno1.getSerieMatriculado());
		System.out.println("Media do aluno é = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? " Aprovado " : " Reprovado "));
		System.out.println("Resultado 2 = " + aluno1.getAlunoAprovado2());

		System.out.println("===============================================================");

		Aluno aluno2 = new Aluno(); // Aqui será o Pedro

		aluno2.setNome(" Pedro Luiz ");
		aluno2.setIdade(30);
		aluno2.setDataNascimento("19/02/1965");
		aluno2.setRegistroGeral("36574.698.88");
		aluno2.setNumeroCpf("365.852.987.00");
		aluno2.setNomeMae("Maria");
		aluno2.setNomePai("Edson");
		aluno2.setDataMatricula("03/02/2020");
		aluno2.setSerieMatriculado("5b");
		aluno2.setNota1(88);
		aluno2.setNota2(98.5);
		aluno2.setNota3(70.1);
		aluno2.setNota4(80.7);

		System.out.println("Nome é = " + aluno2.getNome());
		System.out.println("Idade é = " + aluno2.getIdade());
		System.out.println("Nascimento = " + aluno2.getDataNascimento());
		System.out.println("Registro Geral = " + aluno2.getRegistroGeral());
		System.out.println("Numero Cpf = " + aluno2.getNumeroCpf());
		System.out.println("Nome Mãe = " + aluno2.getNomeMae());
		System.out.println("Nome Pai = " + aluno2.getNomePai());
		System.out.println("DataMa tricula = " + aluno2.getDataMatricula());
		System.out.println("Serie Matriculado = " + aluno2.getSerieMatriculado());
		System.out.println("Media do aluno é = " + aluno2.getMediaNota());
		System.out.println("Resultado = " + (aluno2.getAlunoAprovado() ? " Aprovado " : " Reprovado "));
		System.out.println("Resultado 2 = " + aluno2.getAlunoAprovado2());

		System.out.println("=============================================================");

		Aluno aluno3 = new Aluno(); // Aqui sera o alex

		aluno3.setNome(" Alex barroso ");
		aluno3.setIdade(19);
		aluno3.setDataNascimento("19/02/1999");
		aluno3.setRegistroGeral("36574.698.00");
		aluno3.setNumeroCpf("365.852.987.00");
		aluno3.setNomeMae("Gleyce");
		aluno3.setNomePai("Maicon");
		aluno3.setDataMatricula("03/08/2001");
		aluno3.setSerieMatriculado("5e");
		aluno3.setNota1(88);
		aluno3.setNota2(78.5);
		aluno3.setNota3(70.1);
		aluno3.setNota4(80.7);

		System.out.println("Nome é = " + aluno3.getNome());
		System.out.println("Idade é = " + aluno3.getIdade());
		System.out.println("Nascimento = " + aluno3.getDataNascimento());
		System.out.println("Registro Geral = " + aluno3.getRegistroGeral());
		System.out.println("Numero Cpf = " + aluno3.getNumeroCpf());
		System.out.println("Nome Mãe = " + aluno3.getNomeMae());
		System.out.println("Nome Pai = " + aluno3.getNomePai());
		System.out.println("DataMa tricula = " + aluno3.getDataMatricula());
		System.out.println("Serie Matriculado = " + aluno3.getSerieMatriculado());
		System.out.println("Media do aluno é = " + aluno3.getMediaNota());
		System.out.println("Resultado = " + aluno3.getAlunoAprovado());
		System.out.println("Resultado = " + (aluno3.getAlunoAprovado() ? " Aprovado " : " Reprovado "));
		System.out.println("Resultado 2 = " + aluno3.getAlunoAprovado2());

		System.out.println("=============================================================");

		Aluno aluno4 = new Aluno("Maria");

		aluno4.setNome(" Maria Concordia ");
		aluno4.setIdade(36);
		aluno4.setDataNascimento("19/02/1999");
		aluno4.setRegistroGeral("36574.698.00");
		aluno4.setNumeroCpf("365.852.987.00");
		aluno4.setNomeMae("Gleyce");
		aluno4.setNomePai("Maicon");
		aluno4.setDataMatricula("03/08/2001");
		aluno4.setSerieMatriculado("5c");
		aluno4.setNota1(88);
		aluno4.setNota2(88.5);
		aluno4.setNota3(70.1);
		aluno4.setNota4(80.7);

		System.out.println("Nome é = " + aluno4.getNome());
		System.out.println("Idade é = " + aluno4.getIdade());
		System.out.println("Nascimento = " + aluno4.getDataNascimento());
		System.out.println("Registro Geral = " + aluno4.getRegistroGeral());
		System.out.println("Numero Cpf = " + aluno4.getNumeroCpf());
		System.out.println("Nome Mãe = " + aluno4.getNomeMae());
		System.out.println("Nome Pai = " + aluno4.getNomePai());
		System.out.println("DataMa tricula = " + aluno4.getDataMatricula());
		System.out.println("Serie Matriculado = " + aluno4.getSerieMatriculado());
		System.out.println("Media do aluno é = " + aluno4.getMediaNota());
		System.out.println("Resultado = " + (aluno4.getAlunoAprovado() ? " Aprovado " : " Reprovado "));
		System.out.println("Resultado 2 = " + aluno4.getAlunoAprovado2());

		// Aluno aluno5 = new Aluno("José", 50);
	}

}