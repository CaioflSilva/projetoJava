package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassFilhas {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Caio");
		aluno.setNomeEscola("Caio Java");
		aluno.setIdade(22);

		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("656565LKLK   EX");
		diretor.setNome("Filipe");
		diretor.setIdade(50);

		Secretario Secretario = new Secretario();
		Secretario.setExperiencia("Administracao");
		Secretario.setNumeroCpf("096.844.454.87 Ex ");
		Secretario.setIdade(18);

		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(Secretario);
		
		System.out.println(aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade() );
		System.out.println(Secretario.pessoaMaiorIdade());
		
   System.out.println( "salario do aluno é = " + aluno.salario());
   System.out.println("salario do Diretor é = " + diretor.salario());
   System.out.println("salario do Secretario é = " + Secretario.salario());
		
	}
}
