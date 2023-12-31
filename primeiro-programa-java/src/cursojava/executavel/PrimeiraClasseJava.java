package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Disciplina;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {

	/* main � um metodo auto executavel em java */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		String loguin = JOptionPane.showInputDialog("Informe o loguin");
		String senha = JOptionPane.showInputDialog("Informe a senha");

		if (new FuncaoAutenticacao(new Diretor(loguin, senha)).autenticar()) {// vou travar o contrato para autorizar
																					// somente quem tem o contrato 100% // legitimo
			

			List<Aluno> alunos = new ArrayList<Aluno>();

			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

			for (int qtd = 1; qtd <= 5; qtd++) {

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

				for (int pos = 1; pos <= 1; pos++) {
					String nomeDisciplina = JOptionPane.showInputDialog(" Nome da Disciplina " + pos + " ? ");
					String notaDisciplina = JOptionPane.showInputDialog(" Nota da Disciplina " + pos + " ? ");

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
					disciplina.setNota(Double.valueOf(notaDisciplina));

					aluno1.getDisciplinas().add(disciplina);
				}

				int escolha = JOptionPane.showConfirmDialog(null, " deseja remover alguma disciplina ? ");

				if (escolha == 0) {

					int continuarRemover = 0;
					int posicao = 1;

					while (continuarRemover == 0) {

						String disciplinaRemover = JOptionPane.showInputDialog(" qual a disciplina 1, 2, 3, ou 4 ? ");
						aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
						posicao++;
						continuarRemover = JOptionPane.showConfirmDialog(null, " Continuar a Remover ");
					}
				}

				alunos.add(aluno1);
			}

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) { // separei em listas
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
					maps.get(StatusAluno.APROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.REPROVADO).add(aluno);
				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
				}

			}
			System.out.println("------------------------ Lista dos Aprovados ----------------------------");
			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
				System.out.println(" O Aluno : " + aluno.getNome() + " Est� Com a Media : " + aluno.getMediaNota()
						+ " est� " + aluno.getAlunoAprovado2());

			}
			System.out.println("------------------------ Lista em Recupera��o ----------------------------");
			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
				System.out.println(" O Aluno : " + aluno.getNome() + " Est� Com a Media : " + aluno.getMediaNota()
						+ " E ficou Em " + aluno.getAlunoAprovado2());

			}
			System.out.println("------------------------ Lista dos Reprovados----------------------------");
			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
				System.out.println(" O Aluno : " + aluno.getNome() + " Est� Com a Media : " + aluno.getMediaNota()
						+ " E est� " + aluno.getAlunoAprovado2());

			}

		} else {
			JOptionPane.showConfirmDialog(null, "Acesso n�o Permitido");
		}
	}
}
