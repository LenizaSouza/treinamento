
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getNumero());

		Cliente regina = new Cliente();
		// conta.titular = regina;
		regina.setNome("Regina Bou");

		conta.setTitular(regina);

		System.out.println("o titular da conta é " + conta.getTitular().getNome());

		conta.getTitular().setProfissao("programadora");
		System.out.println("A profissão da cliente é " + conta.getTitular().getProfissao());

		// agora em duas linhas
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programadora");

		System.out.println(titularDaConta);
		System.out.println(regina);
		System.out.println(conta.getTitular());
	}

}
