package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	/* main é um metodo auto executavel em java */
	public static void main(String[] args) {

		// New Aluno() é uma instancia (criaçao de obejtos)
		// aluno1 é uma referencia para o obejto aluno

		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade ?");
		String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento?");
		String rg = JOptionPane.showInputDialog("Registro Geral?");
		String cpf = JOptionPane.showInputDialog("qual o CPF?");
		String mae = JOptionPane.showInputDialog("Nome da mãe?");
		String pai = JOptionPane.showInputDialog("Nome do pai?");
		String matricula = JOptionPane.showInputDialog("Data da matricula?");
		String serie = JOptionPane.showInputDialog("Qual a Série?");
		String escola = JOptionPane.showInputDialog("Qual o Nome da escola ?");
		String nota1 = JOptionPane.showInputDialog("Qual a Primeira Nota ?");
		String nota2 = JOptionPane.showInputDialog("Qual a Segunda Nota ?");
		String nota3 = JOptionPane.showInputDialog("Qual a Terceira Nota ?");
		String nota4 = JOptionPane.showInputDialog("Qual a Quarta Nota ?");

		Aluno aluno1 = new Aluno(); // Aqui será o João
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));

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

	}

}