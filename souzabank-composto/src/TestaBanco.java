
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente regina = new Cliente();
		regina.nome = "Regina Bou";
		regina.cpf = "888.888.888-88";
		regina.profissao = "programadora";
		
		Conta contaDaRegina = new Conta();
		contaDaRegina.deposita(3000);
		
		//associa a cliente regina a conta contaDaRegina
		contaDaRegina.titular = regina;
		System.out.println(contaDaRegina.titular.nome);
		System.out.println(contaDaRegina.titular);
		System.out.println(regina);
	}

}
