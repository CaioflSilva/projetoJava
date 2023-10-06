package cursojava.classes;

//herança Classe pai ou classe master ou SuperClasse (Atributos comuns a todos os objetos filhos
public  abstract class Pessoa {
	
	
	protected String nome;
	protected int idade;
	protected String dataNascimento;
	protected String RegistroGeral;
	protected String numeroCpf;
	protected String nomeMae;
	protected String nomePai;
	
	
	//metodo é que fica na classe pai é obrigatoria para as classes filhas
	public abstract double salario();
	
	protected String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return RegistroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		RegistroGeral = registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	//retorna true cao seja 18 anos a cima senão false
	public  boolean pessoaMaiorIdade() {
		return idade >= 18;
	}
	

}
