
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario douglas = new Funcionario();
		
		douglas.setNome("Douglas Nogueira");
		douglas.setCpf("078.556.599-00");
		douglas.setMatricula("007698822");
		douglas.setSalario(25000.00);
		
		System.out.println(douglas.getNome());
		System.out.println(douglas.getBonificacao());
		
	}
}
