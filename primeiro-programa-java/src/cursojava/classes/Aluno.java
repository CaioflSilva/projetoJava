package cursojava.classes;

//Essa � nosaa classe/Objeto que representa o Aluno
public class Aluno {

	// esses s�o os atributos do aluno
	public String nome;
	public int idade;
	public String dataNascimento;
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
