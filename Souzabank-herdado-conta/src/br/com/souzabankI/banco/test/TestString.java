package br.com.souzabankI.banco.test;

public class TestString {

	public static void main(String[] args) {
		
		String vazio = "      Souza     ";
		String outroVazio = vazio.trim();
		
		System.out.println(vazio.contains("Sou"));
		System.out.println(outroVazio);
		
		String nome = "Souza";//object literal
		//String outro = new String("Souza");
		
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++){
			System.out.println(nome.charAt(i));
		}
		
		//String sub = nome.substring(1);
		//System.out.println(sub);
		
		//int pos = nome.indexOf("uz");
		//System.out.println(pos);
		
//		char c = nome.charAt(0);
//		System.out.println(c);
		
//		char c='S';
//		char d='s';
		
//		String outra = nome.replace('S','s');
		//String outra = nome.toUpperCase();
		
		
		//System.out.println(nome);
		//System.out.println(outra);
	}

}
