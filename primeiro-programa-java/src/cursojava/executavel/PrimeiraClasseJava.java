package cursojava.executavel;

import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

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

		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco De Dados");
		disciplina1.setNota(90);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Matematica");
		disciplina2.setNota(97);

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Geografia");
		disciplina3.setNota(99);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Java Web");
		disciplina4.setNota(70);

		aluno1.getDisciplinas().add(disciplina1);
		aluno1.getDisciplinas().add(disciplina2);
		aluno1.getDisciplinas().add(disciplina3);
		aluno1.getDisciplinas().add(disciplina4);

		System.out.println(aluno1);
		System.out.println("Media do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());

	}

}
