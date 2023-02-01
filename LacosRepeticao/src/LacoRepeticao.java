
public class LacoRepeticao {

	public static void main(String[] args) {
		// Comando WHILE - laço pré testado
		System.out.println("Comando WHILE");
		int qdtVezes = 1;
		
		while (qdtVezes <= 10) {
			System.out.println("Estou fazendo o laço a " + qdtVezes + "ª vez.");
			qdtVezes++; // qtdVezes = qtdVezes + 1.			
		}
		System.out.println("Saí do laço e executei o laço " + (qdtVezes-1) + " vezes.");
		System.out.println("---------------------------------------------------------- ");
	
		// Do WHILE - laço pós testado
		System.out.println("Comando DO...WHILE");
	qdtVezes = 1;
	do {
		System.out.println("Estou fazendo o laço a " + qdtVezes + "ª vez.");
		qdtVezes++; // qtdVezes = qtdVezes + 1.		
	}while (qdtVezes <= 10);
	System.out.println("Saí do laço e executei o laço " + (qdtVezes-1) + " vezes.");
	System.out.println("---------------------------------------------------------- ");
	
		// For
	System.out.println("Comando FOR");
	qdtVezes = 0;
	for (int qtdVezes1 = 1; qtdVezes1 <= 10; qtdVezes1++) {
		System.out.println("Estou fazendo o laço a " + qtdVezes1 + "ª vez.");
		qdtVezes = qtdVezes1;
	}
	System.out.println("Saí do laço e executei o laço " + (qdtVezes) + " vezes.");
	System.out.println("---------------------------------------------------------- ");
		
	
	
	for (int qtdVezes1 = 1; qtdVezes1 <= 10; qtdVezes1++) {
		System.out.println("Estou fazendo o laço a " + qtdVezes1 + "ª vez.");
		if (qtdVezes1 ==5) {
			System.out.println("Parei na " + qtdVezes1 + "ª vez");
			break;
			
		}
		
		
	}
	
	}
	
	
}
