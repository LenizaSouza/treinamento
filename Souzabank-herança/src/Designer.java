
//Gerente eh um Funcionario ou Gerente herda da classe do funcionario
public class Designer extends Funcionario {
		
	public double getBonificacao() {
		System.out.println("Chamando o metodo bonificacao do Designer");
		return 200;
	}
}
