
//Gerente eh um Funcionario ou Gerente herda da classe do funcionario
public class EditorVideo extends Funcionario {
		
	public double getBonificacao() {
		System.out.println("Chamando o metodo bonificacao do Editor de Video");
		return 150;
	}
}
