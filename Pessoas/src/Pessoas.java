
public class Pessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Fisica fis = new Fisica();
		fis.nome = "João";
		fis.cpf = "111111111";
		fis.identidade = "15615624";
		fis.situacaoPessoa = "A";
		
		Juridica jur = new Juridica();
		jur.nome = "Casa do Souza";
		jur.cnpj = "457457255";
		jur.inscEstadual = "45212589";
		jur.situacaoPessoa = "I";
		
		System.out.println("Dados da Pessoa Física");
		System.out.println(fis.toString());
		System.out.println("Dados da Pessoa Jurídica");
		System.out.println(jur.toString());
	}

}
