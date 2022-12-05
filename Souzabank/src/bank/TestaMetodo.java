package bank;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDaRegina = new Conta();
		contaDaRegina.saldo = 100;
		contaDaRegina.deposita(50);
		System.out.println(contaDaRegina.saldo);
		
		boolean conseguiuRetirar = contaDaRegina.saca(20);
		System.out.println(contaDaRegina.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia = 
				contaDaMarcela.transfere(3000, contaDaRegina);
		if(sucessoTransferencia) {
			System.out.println("transferencia com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDaRegina.saldo);
		
		contaDaRegina.titular = "regina bou";
		System.out.println(contaDaRegina.titular);
	}

}
