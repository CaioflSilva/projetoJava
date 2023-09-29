package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	/* main � um metodo auto executavel em java */
	public static void main(String[] args) {

		List<Aluno> alunos = new ArrayList<Aluno>();

		for (int qtd = 1; qtd <= 1; qtd++) {

			// New Aluno() � uma instancia (cria�ao de obejtos)
			// aluno1 � uma referencia para o obejto aluno

			String nome = JOptionPane.showInputDialog("Qual o nome do Aluno" + qtd + "?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade ?"); String
			 * dataNascimento = JOptionPane.showInputDialog("Data de Nascimento?"); String
			 * rg = JOptionPane.showInputDialog("Registro Geral?"); String cpf =
			 * JOptionPane.showInputDialog("qual o CPF?"); String mae =
			 * JOptionPane.showInputDialog("Nome da m�e?"); String pai =
			 * JOptionPane.showInputDialog("Nome do pai?"); String matricula =
			 * JOptionPane.showInputDialog("Data da matricula?"); String serie =
			 * JOptionPane.showInputDialog("Qual a S�rie?"); String escola =
			 * JOptionPane.showInputDialog("Qual o Nome da escola ?");
			 */

			Aluno aluno1 = new Aluno();

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento); aluno1.setRegistroGeral(rg);
			 * aluno1.setNumeroCpf(cpf); aluno1.setNomeMae(mae); aluno1.setNomePai(pai);
			 * aluno1.setDataMatricula(matricula); aluno1.setSerieMatriculado(serie);
			 * aluno1.setNomeEscola(escola);
			 */

			for (int pos = 1; pos <= 4; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + "?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + "?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "deseja remover alguma disciplina ?");

			if (escolha == 0) {

				int continuarRemover = 0;
				int posicao = 1;

				while (continuarRemover == 0) {

					String disciplinaRemover = JOptionPane.showInputDialog("qual a disciplina 1, 2, 3, ou 4 ?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover");
				}
			}

			alunos.add(aluno1);
		}

		for (int pos = 0; pos < alunos.size(); pos++) {
			
			Aluno aluno = alunos.get(pos);
			
			System.out.println("Aluno = " + aluno.getNome());
			System.out.println("Resultado = " + aluno.getMediaNota());
			System.out.println("Media do aluno = " + aluno.getAlunoAprovado2());
			System.out.println("--------------------------------------------------");
			
			for (int posd = 0 ; posd < aluno.getDisciplinas().size();posd ++) {
				Disciplina disc =  aluno.getDisciplinas().get(posd);
				System.out.println(" Materia = " + disc.getDisciplina() + "Nota = " + disc.getNota());
				
			}
		}
		
		
	}

}
