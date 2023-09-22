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

		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1 ?");
		String nota1 = JOptionPane.showInputDialog("Qual a Primeira Nota ?");

		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2 ?");
		String nota2 = JOptionPane.showInputDialog("Qual a Segunda Nota ?");

		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3 ?");
		String nota3 = JOptionPane.showInputDialog("Qual a Terceira Nota ?");

		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4 ?");
		String nota4 = JOptionPane.showInputDialog("Qual a Quarta Nota ?");

		Aluno aluno1 = new Aluno();
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

		System.out.println(aluno1.toString());
		System.out.println("Media do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());

		// Equals e Hashcode (diferenciar e comparar obejtos

	}

}
