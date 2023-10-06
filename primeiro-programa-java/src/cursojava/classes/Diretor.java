package cursojava.classes;

//Classe filha de pessoa Extende de pessoa
public class Diretor extends Pessoa {
 
	private String registroEducacao;
	private int tempoDirecao;
	private String titulacap;

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
	
	

}
