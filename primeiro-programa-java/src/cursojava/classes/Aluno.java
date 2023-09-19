package cursojava.classes;

//Essa � nosaa classe/Objeto que representa o Aluno
public class Aluno {

	String nome;
	int idade;
	String dataNascimento;
	String RegistroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;

	public Aluno() { // Cria os dados na memoria - porem � padr�o do java

	}

	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

}
