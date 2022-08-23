
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente(); 
		
		gerente.setNome("Ademilson Nogueira");
		gerente.setMatricula("00865471");
		gerente.setSalario(25000.00);
		gerente.setSenha(123456);
		
		System.out.println(gerente.getBonificacao());
		
		//Teste senha 
		boolean autenticacao = gerente.autentica(123456);
		System.out.println(autenticacao);
		//No caso setamos a mesma senha, sendo assim o retorno foi true. Qualquer número altera retornará false.
		
	}
}
