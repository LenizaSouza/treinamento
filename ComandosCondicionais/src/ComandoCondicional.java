
public class ComandoCondicional {

	public static void main(String[] args) {
		// IF
		
		int num1;
		int num2 = 30;
		
		num1 = 10;
		if (num1 < num2) {
			System.out.println("if normal - Número 1 é menor que Número 2");
			System.out.println("------------------------------------------------------------");
		}
		num1 = 40;
		if (num1 > num2) {
			System.out.println("if com else - Número 1 é maior que Número 2");
		} else {
			System.out.println("if com else - Número 1 é menor que Número 2");			
		}
		System.out.println("-------------------------------------------------------------");
		num1 = 30;
		if (num1 > num2) {
			System.out.println("condição composta else if - Número 1 é maior que Número 2");
		} else if (num1 < num2) {
			System.out.println("condição composta else if - Número 1 é menor que Número 2");
		} else{
			System.out.println("condição composta elseif - Número 1 é igual ao Número 2");
			System.out.println("------------------------------------------------------------");
		}
		
		// comando condicional SWITCH
		int opcao = 5;
		switch (opcao) {
		case 1: {
			System.out.println("Chame o programa de Inclusão");
			break;
			}
		case 2: {
			System.out.println("Chame o programa de Alteração");
			break;
			}
		case 3: {
			System.out.println("Chame o programa de Exclusão");
			break;
			}
		case 4: {
			System.out.println("Chame o programa de Consulta");
			break;
			}		
		default:
			System.out.println ("Opção " + opcao + " inválida.");
			System.out.println ("Escolha uma nova opção de 1 a 4.");
		}
		
		
		
		
		
		
		
		
	}

}
