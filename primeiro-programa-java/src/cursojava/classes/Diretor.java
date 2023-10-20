package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

//Classe filha de pessoa Extende de pessoa
public class Diretor extends Pessoa implements PermitirAcesso {

	private String registroEducacao;
	private int tempoDirecao;
	private String titulacap;

	private String loguin;
	private String senha;

	public Diretor(String loguin, String senha) {
		this.loguin = loguin;
		this.senha = senha;
	}

	public Diretor() {
	}

	public String getRegistroEducacao() {
		return registroEducacao;
	}

	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}

	public int getTempoDirecao() {
		return tempoDirecao;
	}

	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}

	public String getTitulacap() {
		return titulacap;
	}

	public void setTitulacap(String titulacap) {
		this.titulacap = titulacap;
	}

	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacap="
				+ titulacap + ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", RegistroGeral=" + RegistroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}

	@Override
	public double salario() {
		return 3900.78;
	}

	@Override
	public boolean autenticar(String loguin, String senha) {
		this.loguin = loguin;
		this.senha = senha;
		return autenticar();
	}

	@Override
	public boolean autenticar() {
		return loguin.equals("Caio") && senha.equals("1995");
	}

}
