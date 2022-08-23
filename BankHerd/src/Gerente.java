
public class Gerente extends Funcionario {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false; 
		}
	}
	
	/**
	 * A bonificação do gerente é de um salário inteiro e não 10%
	 */
	public double getBonificacao(){
		return super.getBonificacao() + super.salario;
		
	}
}
