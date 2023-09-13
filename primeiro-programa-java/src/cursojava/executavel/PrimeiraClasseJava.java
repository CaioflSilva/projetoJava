package cursojava.executavel;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	/* main é um metodo auto executavel em java */
	public static void main(String[] args) {

	String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
	String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");

	double carroNumero = Double.parseDouble(carros);
	double pessoaNumero =Double.parseDouble(pessoas);
	
	int divisao = (int)(carroNumero / pessoaNumero);
	
	double resto = carroNumero % pessoaNumero;
	
JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao + " Carros e sobrou " + resto + " carros" );

	
	}

}