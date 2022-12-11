
//Gerente eh um Funcionario ou Gerente herda da classe do funcionario, assina o contrato Autenticável, eh um autenticavel.
public class Gerente extends Funcionario implements Autenticavel {
	
	private int senha;		
		
	public double getBonificacao() {
		System.out.println("Chamando o metodo bonificacao do Gerente");
		return super.getSalario();
	}
	
	@Override
	public void setSenha(int senha) {
		this.senha = senha;		
	}

	@Override
	public boolean autentica(int senha) {		
			if(this.senha == senha) {
				return true;
			} else {
				return false;
			}
		}	
}
