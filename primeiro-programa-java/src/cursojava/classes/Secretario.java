package cursojava.classes;

import cursojava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	private String loguin;
	private String senha;
	
	public Secretario(String loguin , String senha) {
	this.loguin = loguin;
	this.senha = senha;	
	
	}
	
	public Secretario() {
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", RegistroGeral="
				+ RegistroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}

	@Override
	public double salario() {
		return 1800.80 * 0.9;
	}

	@Override
	public boolean autenticar(String loguin, String senha) {
		this.loguin = loguin;
		this.senha = senha;
		return autenticar();
	}

	@Override
	public boolean autenticar() {
		return loguin.equals("admin") && senha.equals("admin") ;
	}

}
