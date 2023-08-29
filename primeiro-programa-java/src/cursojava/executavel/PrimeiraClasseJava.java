package cursojava.executavel;

public class PrimeiraClasseJava {
	
	//variavel global é acessivel a todos e o seu valor é compartilhado
	static int maiorIdadeGlobal = 30;
	
	
	/*main é um metodo auto executavel em java*/
	public static void main(String[] args) {
	
	//variavel local porque pertence somente a esse metodo
		
	int maiorIdade = 18;
	System.out.println("valor variavel local = " + maiorIdadeGlobal);
	System.out.println("valor variavel local = " + maiorIdade);
		metodo2();
	}
 
     public static void metodo2 () {
    	System.out.println("valor da maior idade global = " + maiorIdadeGlobal); 
     }
	
	
}
