
public class RelacionaisLogicos {

	public static void main(String[] args) {
		// Operadores Relacionais
		// > < <= >= != ==
		
		int num1, num2;
		// testando uma igualdade		
		num1 = 10;
		num2 = 10;		
		if (num1 == num2) {
			System.out.println("Número 1 e Número 2 são iguais!");
		}
		
		// testando uma desigualdade
		num1 = 10;
		num2 = 30;		
		if (num1 != num2) {
			System.out.println("Número 1 e Número 2 são diferentes!");
		}
		
		// testando maior
		num1 = 10;
		num2 = 30;		
		if (num1 > num2) {
			System.out.println("Número 1 é maior que Número 2!");
		} else {
			System.out.println("Número 2 é maior que Número 1!");
			System.out.println("---------------------------");
		}
		
		// operadores lógicos
		// &&=e   AND=e   ||=ou   OR=ou
		num1 = 10;
		num2 = 5;
		int num3 = 20, num4 = 5;
		if ((num1 > num3) && (num2 == num4)) {
			System.out.println("Primeira opção satisfeita ! ");
		} else {
			System.out.println("Segunda opção satisfeita ! ");
			System.out.println("---------------------------");
		}
		num2 = 10;
		if ((num1 > num3) || (num2 == num4)) {
			System.out.println("Primeira opção satisfeita ! ");
		} else {
			System.out.println("Segunda opção satisfeita ! ");
		}
		
	}
}
